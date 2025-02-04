package com.company;

public class Girokonto extends Konto{
    private double ueberziehungsrahmen;

    public Girokonto(String kontoinhaber, int bankleitzahl, int kontonummer, double ueberziehungsrahmen){
        super(kontoinhaber, bankleitzahl, kontonummer, 0, "Girokonto");
        this.ueberziehungsrahmen = ueberziehungsrahmen;
    }

    @Override
    public boolean abheben(double betrag){
        if(betrag > && (kontostand - betrag) >= -ueberziehungsrahmen){
            kontostand -= betrag;
            System.out.println("Abhebung erfolgreich: " + betrag + "EUR");
            return true;
        } else{
            System.out.println("Abhebung nicht möglich, überziehungsrahmen überschritten.");
            return false;
        }
    }
}
