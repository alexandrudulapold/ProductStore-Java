package com.step.display;

public class Menu {

    private void spaceAbove() {
        System.out.println("\n\n\n");
    }

    public void mainMenu() {
        spaceAbove();

        System.out.println("\tMAGAZIN");
        System.out.println("------------------------------");
        System.out.println("1. Produs nou");
        System.out.println("2. Afiseaza produse");
        System.out.println("3. Vinde produs");
        System.out.println("4. Sterge angajati");
        System.out.println("\nOricare alt buton - iesi");
    }

}
