package com.rober.mytools.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rober.mytools.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frg_Linterna#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frg_Linterna extends Fragment {

    public Frg_Linterna() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frg__linterna, container, false);
    }
}