package com.borjarnau.mascotas.vista.fragment;

import com.borjarnau.mascotas.adapter.MascotaAdaptador;
import com.borjarnau.mascotas.adapter.MiMascotaAdaptador;
import com.borjarnau.mascotas.pojo.Mascota;
import com.borjarnau.mascotas.restApi.model.MascotaResponse;

import java.util.ArrayList;

/**
 * Created by ArnAu on 20/10/2016.
 */
public interface IRecyclerViewFragmentViewII {


    public void generarLinearLayoutVertical();
    public void generarGridLayout();



    public MiMascotaAdaptador crearAdaptadorMiMascota(ArrayList<Mascota> mascotas);


    public void inicializarAdaptadorMiMascotaRV (MiMascotaAdaptador adaptador);
}
