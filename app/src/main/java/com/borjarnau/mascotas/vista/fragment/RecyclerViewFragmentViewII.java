package com.borjarnau.mascotas.vista.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.borjarnau.mascotas.R;
import com.borjarnau.mascotas.adapter.MascotaAdaptador;
import com.borjarnau.mascotas.adapter.MiMascotaAdaptador;
import com.borjarnau.mascotas.pojo.Mascota;
import com.borjarnau.mascotas.presentador.IRecyclerViewFragmentPresenter;
import com.borjarnau.mascotas.presentador.RecyclerViewFragmentPresenter;
import com.borjarnau.mascotas.restApi.EndPointApi;
import com.borjarnau.mascotas.restApi.deserializador.InfoMascotaDeserializador;
import com.borjarnau.mascotas.restApi.deserializador.MascotaDeserializador;
import com.borjarnau.mascotas.restApi.model.MascotaResponse;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ArnAu on 20/10/2016.
 */
public class RecyclerViewFragmentViewII   extends Fragment { //implements IRecyclerViewFragmentViewII

    private RecyclerView rvMascotasGrid;

    private IRecyclerViewFragmentPresenter presenter;

    private TextView tvUserName;

    public static ImageView imgFotoMiMascota;

    public static boolean esPako = false;

    public static String nuevoPnombre;





    @Nullable
    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_perfil_user, container, false);

        imgFotoMiMascota = (ImageView) v.findViewById(R.id.imgFotoMiMascota);

        //String nuevoPnombre = EndPointApi.nombreUsuario;


        tvUserName = (TextView) v.findViewById(R.id.tvUserName);

        tvUserName.setText(nuevoPnombre);


        rvMascotasGrid= (RecyclerView) v.findViewById(R.id.rvMascotasGrid);
        presenter = new RecyclerViewFragmentPresenter(this, getContext());

        return v;
    }






    //@Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotasGrid.setLayoutManager(llm);

    }

    //@Override
    public void generarGridLayout() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        rvMascotasGrid.setLayoutManager(gridLayoutManager);

    }



    //@Override
    public MiMascotaAdaptador crearAdaptadorMiMascota(ArrayList<Mascota> mascotas) {
        MiMascotaAdaptador adaptador = new MiMascotaAdaptador(mascotas, getActivity());

        return adaptador;
    }




    //@Override
    public void inicializarAdaptadorMiMascotaRV(MiMascotaAdaptador adaptador) {

        rvMascotasGrid.setAdapter(adaptador);
    }



}


