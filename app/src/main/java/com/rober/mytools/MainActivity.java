package com.rober.mytools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.rober.mytools.Actividades.ActividadHerramientas;
import com.rober.mytools.Fragmentos.Frg_Menu;
import com.rober.mytools.Interfaces.Comunica_Menu;

public class MainActivity extends AppCompatActivity implements Comunica_Menu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void mostrarMenu(int x_boton) {
        Intent in=new Intent(this, ActividadHerramientas.class);
        in.putExtra("BOTONPULSADO", x_boton);
        startActivity(in);
    }
}