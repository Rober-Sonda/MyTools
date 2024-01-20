package com.rober.mytools.Fragmentos;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateInterpolator;
import android.widget.ImageButton;

import com.rober.mytools.Interfaces.Comunica_Menu;
import com.rober.mytools.R;

public class Frg_Menu extends Fragment {

    public final int[] BOTONESMENU={R.id.linterna,R.id.sonido, R.id.giroscopio}; //array para los guardar los id de mis botones

    public Frg_Menu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View miMenu = inflater.inflate(R.layout.fragment_menu, container, false);

        ImageButton botonMenu;

        //ponemos a la escucha los botones del menu al evento click

        for (int i =0; i<BOTONESMENU.length; i++){
            //hacemos un casting y almacenamos cada boton en el array
            botonMenu = (ImageButton) miMenu.findViewById(BOTONESMENU[i]);
            final int botonpresionado = i;
            //poner cada boton a la escucha
            botonMenu.setOnClickListener((new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    //y es este metodo el que tiene que detectar el que actividad
                    //se encuentra el boton pulsado y enviar al metodo mostrarMenu de la interfaz
                    //Frg_Menu que boton he pulsado
                    //para detectar en que actividad nos encontramos
                    //utilizamos la clase Activity
                    Activity detectaActividad = getActivity();
                    ((Comunica_Menu)detectaActividad).mostrarMenu(botonpresionado); //esto es un casting
                }
            }));
        }




        return miMenu;
    }
}