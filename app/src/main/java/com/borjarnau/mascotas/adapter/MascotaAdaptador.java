package com.borjarnau.mascotas.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.borjarnau.mascotas.DetalleMascota;
import com.borjarnau.mascotas.R;
import com.borjarnau.mascotas.db.ConstructorMascotas;
import com.borjarnau.mascotas.pojo.Mascota;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ArnAu on 27/05/2016.
 */
public class MascotaAdaptador extends  RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{


    ArrayList<Mascota> mascotas;
    Activity activity;


    public MascotaAdaptador(ArrayList<Mascota>mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }



    //inflar o dar vida a el layout (cardview) y lo pasara al viewholder para el obtenga los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //aqui indicamos cual es el layout que estara reciclando el recycleview
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_grid_mascota,parent, false);
        return new MascotaViewHolder(v);
    }

    //asocia cada elemento de nuestra lista con cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {

        final Mascota mascota = mascotas.get(position);
        //////////mascotaViewHolder.imgFoto.setImageResource(mascota.getUrlFoto());
        Picasso.with(activity)
                .load(mascota.getUrlFoto())
                .placeholder(R.drawable.perro1)
                .into(mascotaViewHolder.imgFoto);

        //mascotaViewHolder.tvNombreCV.setText(mascota.getNombre());
        //mascotaViewHolder.tvNumMeGustas.setInputType(mascota.getNumMegustas());
        //mascotaViewHolder.tvNumMeGustas.setText(Integer.toString(mascota.getNumMegustas()));
        mascotaViewHolder.tvLikes.setText(String.valueOf(mascota.getLikes()));

        mascotaViewHolder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, DetalleMascota.class);
                intent.putExtra("url", mascota.getUrlFoto());
                intent.putExtra("like",mascota.getLikes());
                activity.startActivity(intent);

            }
        });

       /* mascotaViewHolder.ibHuesoBlanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity, "Diste like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();

                ConstructorMascotas constructorMascotas = new ConstructorMascotas(activity);
                constructorMascotas.darLikeMascota(mascota);
                int c = constructorMascotas.obtenerLikesMascota(mascota);
                mascotaViewHolder.tvNumMeGustas.setText(String.valueOf(c) + " Likes");

                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
                //////////////////////////////////////////////////////////////////////////////////////////////////////////////

                constructorMascotas.insertarMascotaFavo( mascota);

                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                // mascotaViewHolder.ibHuesoBlanco.setImageResource(R.drawable.huesoamarillo);
                // mascotaViewHolder.tvNumMeGustas.setText(Integer.toString(mascota.getNumMegustas() + 1));

            }
        });*/


    }

    @Override
    public int getItemCount() { //cantidad de elementos que contiene mi lista
        return mascotas.size();

    }




    public static  class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        //private TextView tvNombreCV;
        private TextView tvLikes;

        //private ImageButton ibHuesoBlanco;

        //Este constructor se ha puesto automaticamente, poniendome
        //alado de RecyclerView.ViewHolder cuando me salia la linea entera en rojo
        //apretando Alt+enter y me a sugerido el constructor


        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView)itemView.findViewById(R.id.imgFoto);
            //tvNombreCV = (TextView)itemView.findViewById(R.id.tvNombreCV);
            tvLikes = (TextView) itemView.findViewById(R.id.tvLikes);

            //ibHuesoBlanco = (ImageButton)itemView.findViewById(R.id.ibHuesoBlanco);

        }

    }


}
