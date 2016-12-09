package com.borjarnau.mascotas;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.borjarnau.mascotas.activities_menus.MenuAcercaDeActivity;
import com.borjarnau.mascotas.activities_menus.MenuConfigurarCuenta;
import com.borjarnau.mascotas.activities_menus.MenuContactoActivity;
import com.borjarnau.mascotas.adapter.PageAdapter;
import com.borjarnau.mascotas.presentador.RecyclerViewFragmentPresenter;
import com.borjarnau.mascotas.restApi.EndPointApi;
import com.borjarnau.mascotas.vista.fragment.PerfilFragment;
import com.borjarnau.mascotas.vista.fragment.RecyclerViewFragmentView;
import com.borjarnau.mascotas.vista.fragment.RecyclerViewFragmentViewII;
import com.squareup.picasso.Picasso;
//import com.borjarnau.mascotas.fragment.PerfilFragment;
//import com.borjarnau.mascotas.fragment.RecyclerViewFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;



    //private TextView tvUserName;

    //public static String URLFotoPrinci;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = (Toolbar)findViewById(R.id.toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);

        //URLFotoPrinci = RecyclerViewFragmentPresenter.urlPerfilFoto;

       // Toast.makeText(this, URLFotoPrinci, Toast.LENGTH_LONG).show();
        setUpViewPager();


        if(toolbar != null){
            setSupportActionBar(toolbar);
        }

    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new RecyclerViewFragmentView());   // fragments.add(new RecyclerViewFragment());
        fragments.add(new RecyclerViewFragmentViewII());   //PerfilFragment()   //RecyclerViewFragmentViewII()
        return fragments;

    }

    public void setUpViewPager(){

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager() , agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_dog_house);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_dog);



    }





    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.mContacto:
                // Toast.makeText(this, "has pulsado menu contacto", Toast.LENGTH_LONG).show();

                Intent intent = new Intent (this , MenuContactoActivity.class);
                startActivity(intent);
                break;


            case R.id.mAcercaDe:
                // Toast.makeText(this, "has pulsado menu acerca de", Toast.LENGTH_LONG).show();

                Intent i = new Intent (this, MenuAcercaDeActivity.class);
                startActivity(i);
                break;

            case R.id.mConfigurarCuenta:
                // Toast.makeText(this, "has pulsado menu acerca de", Toast.LENGTH_LONG).show();

                Intent inte = new Intent (this, MenuConfigurarCuenta.class);
                startActivity(inte);
                break;

        }

        return super.onOptionsItemSelected(item);
    }





    public void irAFavoritos(View v){

        Intent intent = new Intent(this, Favoritas_Activity.class);
        startActivity(intent);

    }

}
