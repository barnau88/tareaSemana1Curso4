package com.borjarnau.mascotas.restApi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.borjarnau.mascotas.R;

/**
 * Created by ArnAu on 15/10/2016.
 */
public final class ConstantesRestApi extends AppCompatActivity {

    //https://api.instagram.com/v1/    //esto (DIRECCION BASE)lo configuraremos con otro parametro con retrofit

    //public static String nombreUsuario;
    //public static final String idUsuario  = "4039200993" ;

    public static final String VERSION = "/v1/";
    public static final String ROOT_URL = "https://api.instagram.com" + VERSION;

    public static final String ACCESS_TOKEN = "4013497851.efd55de.740b5611a52d4b089b6303c3943cf405";
    public static final String KEY_ACCESS_TOKEN = "?access_token=";

    /////////////////////////////////////////////////////////////////////////////////////////

    //https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN


    public static final String KEY_GET_GET_RECENT_MEDIA_USER = "users/self/media/recent/";
    public static final String URL_KEY_GET_RECENT_MEDIA_USER = KEY_GET_GET_RECENT_MEDIA_USER + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    //////////////////////////////////////////////////////////////////////////////////////////

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN

    public static final String WORD_USERS = "users/";
   // public static final String USERS_ID = idUsuario;  /////////////////////////////////////////////////////////////4039200993
    public static final String KEY_GET_RECENT_MEDIA_USER_ID = "/media/recent/";
   // public static final String URL_GET_RECENT_MEDIA_USER_ID = WORD_USERS + USERS_ID + KEY_GET_RECENT_MEDIA_USER_ID + KEY_ACCESS_TOKEN + ACCESS_TOKEN;
    public static final String URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE = WORD_USERS;
    public static final String URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE = KEY_GET_RECENT_MEDIA_USER_ID + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    //////////////////////////////////////////////////////////////////////////////////////////////

    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN

    public static final String KEY_GET_INFO_USER_SEARCH = "users/search?q=";
    //public static final String NAME_USER = nombreUsuario;////////////////////////////////////////////////////////////////////atuaniv
    public static final String KEY_ACCESS_TOKEN_2 = "&access_token=";
    public static final String URL_GET_INFO_USER_SEARCH_PRIMERA_PARTE = KEY_GET_INFO_USER_SEARCH ;
    public static final String URL_GET_INFO_USER_SEARCH_SEGUNDA_PARTE = KEY_ACCESS_TOKEN_2 + ACCESS_TOKEN;
    //public static final String URL_GET_INFO_USER_SEARCH = KEY_GET_INFO_USER_SEARCH + NAME_USER + KEY_ACCESS_TOKEN_2 + ACCESS_TOKEN;


}
