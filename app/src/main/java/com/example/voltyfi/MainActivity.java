package com.example.voltyfi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.lights.LightState;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    //Dichiarato bottoni, edit text, spinner e variabile di tipo GestoreBrani
    Button b1;
    EditText ed1;
    GestoreBrani gb;
    Button b2;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    Spinner sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Associazione delle variabili con gli elementi dell'XML
        b1 = (Button)findViewById(R.id.inserisci);
        b2 = (Button)findViewById(R.id.invia);
        ed1 = (EditText)findViewById(R.id.titolo);
        ed2 = (EditText)findViewById(R.id.durata);
        ed3 = (EditText)findViewById(R.id.autore);
        ed4 = (EditText)findViewById(R.id.datacreazione);
        gb=new GestoreBrani();
        sp1=(Spinner)findViewById(R.id.genere);
        //Definisce un formato di data che può essere anche scritto come stringa
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        //Creazione di adattatore di Array che prepara l'array per lo spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                //Impostare l'array come uno spinner
                R.array.genere, android.R.layout.simple_spinner_item);
        //Imposta il tipo specifico di spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Assegnazione dell'adattatore allo spinner
        sp1.setAdapter(adapter);
        //Crea una reazione qualora il bottone venisse cliccato
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Date d= null;
                try {
                    d = format.parse(ed4.getText().toString());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                gb.addBrano(ed1.getText().toString(), Integer.parseInt(ed2.getText().toString()), ed3.getText().toString(), d, sp1.getSelectedItem().toString());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Variabile che ha la capacità di passare le informazioni attraverso le activity
                Intent i=new Intent(getApplicationContext(), MainActivity2.class);
                //Assegna un nome allo spazio del boundle di memoria che gli viene associato e inserisce anche il contenuto della memoria
                i.putExtra("messaggio", gb.ListaBrani());
                startActivity(i);
            }
        });


    }
}