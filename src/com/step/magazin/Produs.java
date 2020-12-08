package com.step.magazin;

import java.time.LocalDate;

public class Produs {

    protected int produsID;


    protected String denumire;
    protected int pretC;
    protected int pretV;
    protected LocalDate dataExpirare;
    protected int cantitate;
    protected String descriere;


    public Produs(String denumire, int pretC, int pretV, LocalDate dataExpirare, int cantitate, String descriere, ManagerProduse_Magazin magazin) {
        this.denumire = denumire;
        this.pretC = pretC;
        this.pretV = pretV;
        this.dataExpirare = dataExpirare;
        this.cantitate = cantitate;
        this.descriere = descriere;

        this.produsID = magazin.getMaxId() + 1;
    }

    // GETTERS
    public int getProdusID() {
        return produsID;
    }
    public String getDenumire() {
        return denumire;
    }
    public int getPretC() {
        return pretC;
    }
    public int getPretV() {
        return pretV;
    }
    public LocalDate getDataExpirare() {
        return dataExpirare;
    }
    public int getCantitate() {
        return cantitate;
    }
    public String getDescriere() {
        return descriere;
    }
    // GETTERS END


}
