package com.company;

public abstract class Konto {
    protected String kontoinhaber;
    protected int bankleitzahl;
    protected int kontonummer;
    protected double kontostand;
    protected String kontoart;

    public Konto(String kontoinhaber, int bankleitzahl, int kontonummer,double kontostand, String kontoart){
        this.kontoinhaber = kontoinhaber;
        this.bankleitzahl = bankleitzahl;
        this.kontonummer = kontonummer;
        this.kontostand = 0;
        this.kontoart = kontoart;
    }

    public void einzahlen(double betrag){
        if(betrag > 0){
            kontostand += betrag;
            System.out.println("Einzahlung war erfolgreich: " + betrag + "EUR");
        } else{
            System.out.println("Ungültiger Betrag!");
        }
    }

    public boolean abheben(double betrag){
        if(betrag > 0 && betrag <= kontostand){
            kontostand -= betrag;
            System.out.println("Abhebung erfolgreich:" + betrag + "EUR");
            return true;
        } else{
            System.out.println("Abhebung fehlgeschlagen. Unzureichender Kontostand!");
            return false;
        }
    }
    public void kontoauszug(){
        System.out.println("\n--- Kontoauszug ---");
        System.out.println("Inhaber: " + kontoinhaber);
        System.out.println("BLZ: " + bankleitzahl);
        System.out.println("Kontonummer: " + kontonummer);
        System.out.println("Kontoart: " + kontoart);
        System.out.println("Kontostand: " + kontostand + "EUR");
        System.out.println("--------------------\n");
    }

    public int getKontonummer(){
        return kontonummer;
    }
}
