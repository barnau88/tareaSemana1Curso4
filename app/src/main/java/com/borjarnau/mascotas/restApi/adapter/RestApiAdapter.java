package com.borjarnau.mascotas.restApi.adapter;

import com.borjarnau.mascotas.restApi.ConstantesRestApi;
import com.borjarnau.mascotas.restApi.EndPointApi;
import com.borjarnau.mascotas.restApi.deserializador.InfoMascotaDeserializador;
import com.borjarnau.mascotas.restApi.deserializador.MascotaDeserializador;
import com.borjarnau.mascotas.restApi.deserializador.MascotaFotoPerfilDeserializador;
import com.borjarnau.mascotas.restApi.model.MascotaFotoPerfilResponse;
import com.borjarnau.mascotas.restApi.model.MascotaResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ArnAu on 17/10/2016.
 */
public class RestApiAdapter {

    public EndPointApi establecerConexionRestApiInstagram(Gson gson){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(EndPointApi.class);
    }

    public Gson construyeGsonDeserializadorMediaRecent(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MascotaResponse.class, new MascotaDeserializador());

        return gsonBuilder.create();

    }


    ///////////////////////////////////////////////////////////////////
    public Gson construyeGsonDeserializadorFotoPerrfil(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MascotaFotoPerfilResponse.class, new MascotaFotoPerfilDeserializador());

        return gsonBuilder.create();

    }



    ///////////////////////////////////////////////////////////////////
    public Gson construyeGsonDeserializadorInfoUser(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MascotaResponse.class, new InfoMascotaDeserializador());

        return gsonBuilder.create();

    }


}
