package com.borjarnau.mascotas.restApi;

import android.support.v7.app.AppCompatActivity;

import com.borjarnau.mascotas.MainActivity;
import com.borjarnau.mascotas.R;
import com.borjarnau.mascotas.pojo.Mascota;
import com.borjarnau.mascotas.presentador.RecyclerViewFragmentPresenter;
import com.borjarnau.mascotas.restApi.adapter.RestApiAdapter;
import com.borjarnau.mascotas.restApi.deserializador.InfoMascotaDeserializador;
import com.borjarnau.mascotas.restApi.model.MascotaFotoPerfilResponse;
import com.borjarnau.mascotas.restApi.model.MascotaResponse;
import com.borjarnau.mascotas.vista.fragment.RecyclerViewFragmentViewII;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ArnAu on 15/10/2016.
 */
public interface EndPointApi  {


    //public static String nombreUsuario  = "atuaniv";
    //public static String idUsuario  = "4039200993";



    public static String idMiUsuario  = "4013497851";


    public static String nombreUsuarioAtuaniv = "atuaniv";
    public static String idUsuarioAtuaniv = "4039200993";

    public static String nombreUsuarioMypetappcour = "mypetappcour";
    public static String idUsuarioAtuanivMypetappcour = "4036128990";

    public static String nombreUsuarioLuistono56 = "luistono56";
    public static String idUsuarioLuistono56 = "3077421755";

    public static String nombreUsuarioMascotasapp2016= "mascotasapp2016";
    public static String idUsuarioMascotasapp2016 = "4036470568";



    //https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_KEY_GET_RECENT_MEDIA_USER)
    Call<MascotaResponse> getRecentMedia();


    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idMiUsuario + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilMiUsuario();


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuario + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaResponse> getRecentMediaUSer();


    //https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN
    //@GET(ConstantesRestApi.URL_KEY_GET_RECENT_MEDIA_USER)
    //Call<MascotaResponse> getRecentMedia();

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuario + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilUser();

    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    @GET (ConstantesRestApi.URL_GET_INFO_USER_SEARCH_PRIMERA_PARTE + nombreUsuario + ConstantesRestApi.URL_GET_INFO_USER_SEARCH_SEGUNDA_PARTE)
    Call<MascotaResponse> getInfoUser();


*/
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioAtuaniv + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaResponse> getRecentMediaAtuaniv();

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioAtuaniv + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilAtuaniv();

    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    @GET (ConstantesRestApi.URL_GET_INFO_USER_SEARCH_PRIMERA_PARTE + nombreUsuarioAtuaniv + ConstantesRestApi.URL_GET_INFO_USER_SEARCH_SEGUNDA_PARTE)
    Call<MascotaResponse> getInfoAtuaniv();

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioAtuanivMypetappcour + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaResponse> getRecentMediaMypetappcour();

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioAtuanivMypetappcour + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilMypetappcour();

    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    @GET (ConstantesRestApi.URL_GET_INFO_USER_SEARCH_PRIMERA_PARTE + nombreUsuarioMypetappcour + ConstantesRestApi.URL_GET_INFO_USER_SEARCH_SEGUNDA_PARTE)
    Call<MascotaResponse> getInfoMypetappcour();

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioLuistono56 + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaResponse> getRecentMediaLuistono56();

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioLuistono56 + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilLuistono56();

    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    @GET (ConstantesRestApi.URL_GET_INFO_USER_SEARCH_PRIMERA_PARTE + nombreUsuarioLuistono56 + ConstantesRestApi.URL_GET_INFO_USER_SEARCH_SEGUNDA_PARTE)
    Call<MascotaResponse> getInfoLuistono56();

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioMascotasapp2016 + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaResponse> getRecentMediaMascotasapp2016();

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioMascotasapp2016 + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilMascotasapp2016();

    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    @GET (ConstantesRestApi.URL_GET_INFO_USER_SEARCH_PRIMERA_PARTE + nombreUsuarioMascotasapp2016 + ConstantesRestApi.URL_GET_INFO_USER_SEARCH_SEGUNDA_PARTE)
    Call<MascotaResponse> getInfoMascotasapp2016();

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////



}