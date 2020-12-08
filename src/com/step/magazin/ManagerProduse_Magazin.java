package com.step.magazin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduse_Magazin {
    List produse = new ArrayList<Produs>();
    private int maxID = 0;
    private int nrDiferiteProduse = 0;

    public void addProdus(String denumire, int pretC, int pretV, LocalDate dataExpirare, int cantitate, String descriere) {
        produse.add(new Produs(denumire, pretC, pretV, dataExpirare, cantitate, descriere, this));

        this.maxID++;
        this.nrDiferiteProduse++;
    }


    public void readProdus(Produs produs) {
        System.out.println(produs.produsID + "  |  " + produs.denumire + "  |  " + produs.pretC
                + " lei  |  " + produs.pretV + " lei  |  " + produs.dataExpirare + "  |  " + produs.cantitate + "x  |  \"" + produs.descriere + "\"");
    }

    public void readProdusArray(List<Produs> produse) {
        System.out.println("\n\n\n");

        System.out.println("ID" + "  |  " + "denumire" + "  |  " + "pret c."
                + "  |  " + "pret v." + "  |  " + "data de expirare" + "  |  " + "cantitate" + "  |  " + "descrierea produsului");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < this.nrDiferiteProduse; i++) {
            readProdus(produse.get(i));
        }
    }


    public void vindeProdus(List<Produs> produse) {
        Scanner sc = new Scanner(System.in);

        readProdusArray(produse);
        System.out.println("Introduceti id-ul produsului care doriti sa il vindeti: ");
        int idDeVindut = sc.nextInt();

        if(idDeVindut <= maxID) {
            for(int i = 0; i < getNrDiferiteProduse(); i++) {
                if(produse.get(i).produsID == idDeVindut) {
                       System.out.println("Vindem produsul \"" + produse.get(i).denumire + "\", introduceti cantitatea:");
                       int cantitate = sc.nextInt();

                       if(cantitate <= produse.get(i).cantitate) {
                           produse.get(i).cantitate -= cantitate;

//                           if(produse.get(i).cantitate == 0) {
//                               System.out.println("Au fost vandute toate produsele \"" + produse.get(i).denumire + "\"");
//                               produse.remove(i);
//                           }

                           System.out.println("Produsul a fost vandut cu succes");
                       }
                       else {
                           System.out.println("Prea mare cantitate");
                           return; // ar trebui de inercat inca odata de introdus cantitatea inloc de return
                       }
                }
            }
        }
        else {
            System.out.println("Nu exista produs cu asa id");
            return;
        }
    }




        // GETTERS
    public List getProduse() {
        return produse;
    }
    public int getMaxId() {
        return maxID;
    }
    public int getNrDiferiteProduse() {
        return nrDiferiteProduse;
    }
    // GETTERS END

}
