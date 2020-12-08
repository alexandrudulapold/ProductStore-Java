package com.step;

import com.step.display.Menu;
import com.step.magazin.ManagerProduse_Magazin;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        ManagerProduse_Magazin magazin = new ManagerProduse_Magazin();

        // Default produse
        magazin.addProdus("Paine Botanica Fr", 3, 5, LocalDate.now().plusDays(5), 25, "Paine alba Botanica 'Franzeluta'");
        magazin.addProdus("Lapte integral CM", 10, 15, LocalDate.now().plusDays(4), 15, "Lapte integral 'Casuta mea'");
        magazin.addProdus("Apa Om 0.5", 5, 7, LocalDate.now().plusDays(180), 20, "Apa plata 0.5l 'Om'");


        Scanner sc = new Scanner(System.in);
        // menu
        while(true) {
            menu.mainMenu();
            int choice = sc.next().charAt(0);

            switch (choice) {
                case '1':
                    sc.next();
                    break;

                case '2':
                    magazin.readProdusArray(magazin.getProduse());
                    System.out.println("\nTaseaza orice pentru a continua");
                    sc.next();
                    break;

                case '3':
                    magazin.vindeProdus(magazin.getProduse());
                    break;

            }
        }

    }
}