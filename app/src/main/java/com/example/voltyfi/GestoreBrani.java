package com.example.voltyfi;

import android.accessibilityservice.GestureDescription;

import java.util.ArrayList;
import java.util.Date;

public class GestoreBrani {
    ArrayList<Brano> listaBrani;
    //costruttore
    public GestoreBrani () { listaBrani = new ArrayList<Brano>(); }
    //Metodo per l'inserimento del brano all'interno dell'array
    public void addBrano(String titolo, int durata, String autore, Date datacreazioe, String genere)
    {
        //crea il brano secondo gli input delle caselle
        Brano b= new Brano( titolo, durata, autore,datacreazioe, genere);
        //aggiunge il brano alla lista
        listaBrani.add(b);
    }
    //Inisce i dati di tutti i brani presenti in un unica stringa
    public String ListaBrani()
    {
        StringBuilder stbui= new StringBuilder(40);
        //FOR EACH ( for specifico per gli array che cicla tutti gli oggetti all'interno degli array e li assegna a una variabile temporanea
        for(Brano Brv : listaBrani)
        {
            //Concatena le stringhe
            stbui.append(Brv.toString());
            stbui.append(";");
        }
        //Elimina l'ultimo carattere della stringa (;)
        stbui.deleteCharAt(-1);
        stbui.append(".");
        //Creiamo una variabile e la associamo la stringa che abbiamo creato con StringBuilder
        String s = stbui.toString();
        return s;
    }
}
