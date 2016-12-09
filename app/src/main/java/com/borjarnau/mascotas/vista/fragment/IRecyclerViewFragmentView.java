package com.borjarnau.mascotas.vista.fragment;

import com.borjarnau.mascotas.adapter.MascotaAdaptador;
import com.borjarnau.mascotas.adapter.MiMascotaAdaptador;
import com.borjarnau.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by ArnAu on 14/10/2016.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();
    public void generarGridLayout();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV (MascotaAdaptador adaptador);


}
