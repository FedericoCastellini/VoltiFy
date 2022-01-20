package com.example.voltyfi;
import java.util.Date;
public class Brano {
    private String titolo;
    private int durata;
    private String genere;
    private String autore;
    private Date datacreazione;
    //Costruttore ( inizializza l'oggetto Brano e inserisce tutti i valori all'interno delle variabili )
    public Brano (String titolo, int durata, String autore, Date datacrezione, String genere)
    {
        this.titolo=titolo;
        this.durata=durata;
        this.autore=autore;
        this.datacreazione=datacrezione;
        this.genere=genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Date getDatacreazione() {
        return datacreazione;
    }

    public void setDatacreazione(Date datacreazione) {
        this.datacreazione = datacreazione;
    }
    @Override
    //il metodo trasforma tutti gli attributi dell'oggetto in un unica stringa
    public String toString() {
        return
                "titolo=" + titolo + ", durata=" + durata + ", genere=" + genere + ", autore=" + autore + ", data creazione=" + datacreazione;
    }
}
