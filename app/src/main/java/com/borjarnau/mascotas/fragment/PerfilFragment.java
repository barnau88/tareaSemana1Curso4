package com.borjarnau.mascotas.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.borjarnau.mascotas.R;
//import com.borjarnau.mascotas.adapter.MiMascotaAdaptador;
import com.borjarnau.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by ArnAu on 27/05/2016.
 */
/*public class PerfilFragment extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaMascotas = (RecyclerView)v.findViewById(R.id.rvMascotasGrid);

        //LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.VERTICAL);
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 2);

        listaMascotas.setLayoutManager(glm);

        //listaMascotas.setLayoutManager(llm);

        inicializarListaMiMascotas();
        inicializarAdaptador();

        return  v;
    }


    public MiMascotaAdaptador  adaptador;
    public void inicializarAdaptador(){

        adaptador = new MiMascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);

    }


    public void inicializarListaMiMascotas(){

        mascotas = new ArrayList<Mascota>();
/*
        mascotas.add(new Mascota(R.drawable.bird1, "Nino", 14));
        mascotas.add(new Mascota(R.drawable.bird2, "Nino", 110));
        mascotas.add(new Mascota(R.drawable.bird3, "Nino", 36));
        mascotas.add(new Mascota(R.drawable.bird4, "Nino", 12));
        mascotas.add(new Mascota(R.drawable.bird5, "Nino", 18));
        mascotas.add(new Mascota(R.drawable.bird6, "Nino", 29));
        mascotas.add(new Mascota(R.drawable.bird7, "Nino", 40));
        mascotas.add(new Mascota(R.drawable.bird8, "Nino", 140));

*/
/*

    }




}
*/