package com.borjarnau.mascotas.presentador;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.borjarnau.mascotas.MainActivity;
import com.borjarnau.mascotas.R;
import com.borjarnau.mascotas.activities_menus.MenuConfigurarCuenta;
import com.borjarnau.mascotas.adapter.MiMascotaAdaptador;
import com.borjarnau.mascotas.adapter.PageAdapter;
import com.borjarnau.mascotas.pojo.Mascota;
import com.borjarnau.mascotas.restApi.EndPointApi;
import com.borjarnau.mascotas.restApi.adapter.RestApiAdapter;
import com.borjarnau.mascotas.restApi.model.MascotaFotoPerfilResponse;
import com.borjarnau.mascotas.restApi.model.MascotaResponse;
import com.borjarnau.mascotas.vista.fragment.IRecyclerViewFragmentView;
import com.borjarnau.mascotas.vista.fragment.IRecyclerViewFragmentViewII;
import com.borjarnau.mascotas.vista.fragment.RecyclerViewFragmentViewII;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ArnAu on 14/10/2016.
 */
public class RecyclerViewFragmentPresenter  implements  IRecyclerViewFragmentPresenter { //extends AppCompatActivity


    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    //private IRecyclerViewFragmentViewII iRecyclerViewFragmentViewII;
    //private IRecyclerViewFragmentViewII iRecyclerViewFragmentViewII;
    private RecyclerViewFragmentViewII recyclerViewFragmentViewII;
    private Context context;

    private ArrayList<Mascota> mascotas;

    private   ArrayList<Mascota> mascotasUSer;

    public static Mascota x;
    public String urlPerfilFoto ;

    //public static boolean esPako = false;


    public  RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;

        //obtenerMediosRecientes();
        obtenerMediosRecientesUsuarios();

    }

    public  RecyclerViewFragmentPresenter(RecyclerViewFragmentViewII recyclerViewFragmentViewII, Context context) {
        //this.iRecyclerViewFragmentViewII = iRecyclerViewFragmentViewII;
        this.recyclerViewFragmentViewII = recyclerViewFragmentViewII;
        this.context = context;

        //obtenerMediosRecientesUsuario();
        //Toast.makeText(context, mascotasUSer.get(0).getId(), Toast.LENGTH_LONG).show();
        if (RecyclerViewFragmentViewII.esPako == true){
            obtenerFotoPerfil();
            obtenerMediosRecientes();
        }

        //Toast.makeText(context, urlPerfilFoto, Toast.LENGTH_LONG).show();

    }


  public void obtenerFotoPerfil() {
      RestApiAdapter restApiAdapter = new RestApiAdapter();
      Gson gsonMediaRecent = restApiAdapter.construyeGsonDeserializadorFotoPerrfil();
      EndPointApi endPointApi = restApiAdapter.establecerConexionRestApiInstagram(gsonMediaRecent);

      Call<MascotaFotoPerfilResponse> mascotaFotoPerfilResponseCall = endPointApi.getFotoPerfilMiUsuario();

      mascotaFotoPerfilResponseCall.enqueue(new Callback<MascotaFotoPerfilResponse>() {
          @Override
          public void onResponse(Call<MascotaFotoPerfilResponse> call, Response<MascotaFotoPerfilResponse> response) {
              MascotaFotoPerfilResponse mascotaFotoPerfilResponse = response.body();
              urlPerfilFoto = mascotaFotoPerfilResponse.getUrlFotoPerfil();

              //Toast.makeText(context, urlPerfilFoto, Toast.LENGTH_LONG).show();


              mostrarFotoPerfilUser(urlPerfilFoto);

          }

          @Override
          public void onFailure(Call<MascotaFotoPerfilResponse> call, Throwable t) {
              Toast.makeText(context, "Algo paso en la conexión", Toast.LENGTH_LONG).show();

          }
      });

  }



           @Override
    public void obtenerMediosRecientes() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Gson gsonMediaRecent = restApiAdapter.construyeGsonDeserializadorMediaRecent();
        EndPointApi endPointApi = restApiAdapter.establecerConexionRestApiInstagram(gsonMediaRecent);

        Call<MascotaResponse> mascotaResponseCall = endPointApi.getRecentMedia();

        mascotaResponseCall.enqueue(new Callback<MascotaResponse>() {
            @Override
            public void onResponse(Call<MascotaResponse> call, Response<MascotaResponse> response) {
                MascotaResponse mascotaResponse = response.body();


                mascotas = mascotaResponse.getMascotas();
                mostrarMascotasUserRV();
            }

            @Override
            public void onFailure(Call<MascotaResponse> call, Throwable t) {
                Toast.makeText(context, "Algo paso en la conexión", Toast.LENGTH_LONG).show();

            }
        });

    }

/*
    public void obtenerMediosRecientesUsuario() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Gson gsonMediaRecent = restApiAdapter.construyeGsonDeserializadorMediaRecent();
        EndPointApi endPointApi = restApiAdapter.establecerConexionRestApiInstagram(gsonMediaRecent);

        Call<MascotaResponse> mascotaResponseCall = endPointApi.getRecentMediaUSer();

        mascotaResponseCall.enqueue(new Callback<MascotaResponse>() {
            @Override
            public void onResponse(Call<MascotaResponse> call, Response<MascotaResponse> response) {
                MascotaResponse mascotaResponse = response.body();
                mascotasUSer = mascotaResponse.getMascotas();

                mostrarMascotasUserRV();
            }

            @Override
            public void onFailure(Call<MascotaResponse> call, Throwable t) {
                Toast.makeText(context, "Algo paso en la conexión", Toast.LENGTH_LONG).show();

            }
        });
    }
*/

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void obtenerMediosRecientesUsuarios() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Gson gsonMediaRecent = restApiAdapter.construyeGsonDeserializadorMediaRecent();
        EndPointApi endPointApi = restApiAdapter.establecerConexionRestApiInstagram(gsonMediaRecent);

        Call<MascotaResponse> mascotaResponseCall = endPointApi.getRecentMediaAtuaniv();
        final Call<MascotaResponse> mascotaResponseCall1 = endPointApi.getRecentMediaMypetappcour();
        final Call<MascotaResponse> mascotaResponseCall2 = endPointApi.getRecentMediaLuistono56();
        final Call<MascotaResponse> mascotaResponseCall3 = endPointApi.getRecentMediaMascotasapp2016();

        mascotaResponseCall.enqueue(new Callback<MascotaResponse>() {
            @Override
            public void onResponse(Call<MascotaResponse> call, Response<MascotaResponse> response) {
                MascotaResponse mascotaResponse = response.body();
                mascotasUSer = mascotaResponse.getMascotas();

                mascotaResponseCall1.enqueue(new Callback<MascotaResponse>() {
                    @Override
                    public void onResponse(Call<MascotaResponse> call, Response<MascotaResponse> response) {
                        MascotaResponse mascotaResponse = response.body();
                        mascotasUSer.addAll(mascotaResponse.getMascotas());

                        mascotaResponseCall2.enqueue(new Callback<MascotaResponse>() {
                            @Override
                            public void onResponse(Call<MascotaResponse> call, Response<MascotaResponse> response) {
                                MascotaResponse mascotaResponse = response.body();
                                mascotasUSer.addAll(mascotaResponse.getMascotas());

                                mascotaResponseCall3.enqueue(new Callback<MascotaResponse>() {
                                    @Override
                                    public void onResponse(Call<MascotaResponse> call, Response<MascotaResponse> response) {
                                        MascotaResponse mascotaResponse = response.body();
                                        mascotasUSer.addAll(mascotaResponse.getMascotas());

                                        mostrarMascotasRV();
                                    }
                                    @Override
                                    public void onFailure(Call<MascotaResponse> call, Throwable t) {
                                        Toast.makeText(context, "Algo paso en la conexión", Toast.LENGTH_LONG).show();
                                    }
                                });
                            }
                            @Override
                            public void onFailure(Call<MascotaResponse> call, Throwable t) {
                                Toast.makeText(context, "Algo paso en la conexión", Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                    @Override
                    public void onFailure(Call<MascotaResponse> call, Throwable t) {
                        Toast.makeText(context, "Algo paso en la conexión", Toast.LENGTH_LONG).show();
                    }
                });
            }
            @Override
            public void onFailure(Call<MascotaResponse> call, Throwable t) {
                Toast.makeText(context, "Algo paso en la conexión", Toast.LENGTH_LONG).show();
            }
        });
    }



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotasUSer));
        iRecyclerViewFragmentView.generarGridLayout();
    }

    public void mostrarMascotasUserRV() {
        recyclerViewFragmentViewII.inicializarAdaptadorMiMascotaRV(recyclerViewFragmentViewII.crearAdaptadorMiMascota(mascotas));
        recyclerViewFragmentViewII.generarGridLayout();
    }

    public void mostrarFotoPerfilUser(String x){
         Picasso.with(recyclerViewFragmentViewII.getContext())
                .load(x)
                .placeholder(R.drawable.perro1)
                .into(recyclerViewFragmentViewII.imgFotoMiMascota);

    }



}





