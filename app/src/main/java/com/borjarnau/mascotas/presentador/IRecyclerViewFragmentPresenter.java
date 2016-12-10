package com.borjarnau.mascotas.presentador;

import com.borjarnau.mascotas.adapter.MascotaAdaptador;
import com.borjarnau.mascotas.pojo.Mascota;
import com.borjarnau.mascotas.restApi.model.MascotaResponse;
import com.borjarnau.mascotas.vista.fragment.IRecyclerViewFragmentViewII;

import java.util.ArrayList;

/**
 * Created by ArnAu on 14/10/2016.
 */
public interface IRecyclerViewFragmentPresenter {

    //public void obtenerInfoUsuario();

    public void obtenerFotoPerfil();               /////////////////////////////////////

    public void obtenerFotoPerfilGatoulises();
    public void obtenerMediosRecientesGatoulises();

    public void obtenerFotoPerfilNiko_pty();
    public void obtenerMediosRecientesNiko_pty();


    public void mostrarFotoPerfilUser(String x);
    //public ArrayList<Mascota> getMascotasUSer();

    public void obtenerMediosRecientes();

    //public void obtenerMediosRecientesUsuario();   //////////////////////////////////////

    public void mostrarMascotasRV();

    public void mostrarMascotasUserRV();

    //public void obtenerInfoUsuario();

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void obtenerMediosRecientesUsuarios();
    //public void obtenerMediosRecientesMypetappcour();
    //public void obtenerMediosRecientesLuistono56 ();
    //public void obtenerMediosRecientesMascotasapp2016();

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
