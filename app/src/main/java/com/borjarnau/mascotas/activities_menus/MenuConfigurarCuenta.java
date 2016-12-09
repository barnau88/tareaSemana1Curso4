package com.borjarnau.mascotas.activities_menus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.borjarnau.mascotas.MainActivity;
import com.borjarnau.mascotas.R;
import com.borjarnau.mascotas.pojo.Mascota;
import com.borjarnau.mascotas.presentador.IRecyclerViewFragmentPresenter;
import com.borjarnau.mascotas.presentador.RecyclerViewFragmentPresenter;
import com.borjarnau.mascotas.restApi.ConstantesRestApi;
import com.borjarnau.mascotas.restApi.EndPointApi;

import com.borjarnau.mascotas.vista.fragment.IRecyclerViewFragmentViewII;
import com.borjarnau.mascotas.vista.fragment.RecyclerViewFragmentView;
import com.borjarnau.mascotas.vista.fragment.RecyclerViewFragmentViewII;

/**
 * Created by ArnAu on 18/10/2016.
 */
public class MenuConfigurarCuenta extends AppCompatActivity {

    private EditText etUsuario;

    public static  String nombreUsuarioNuevo;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_configurar_cuenta);

        Toolbar myActionBar = (Toolbar) findViewById(R.id.myActionBar);
        setSupportActionBar(myActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button btGuardarUsuario = (Button)findViewById(R.id.etButtonGuardarUser);
        btGuardarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etUsuario = (EditText)findViewById(R.id.etUsuario);

                nombreUsuarioNuevo = etUsuario.getText().toString();


                if(nombreUsuarioNuevo.equals("perritopaco")){
                    RecyclerViewFragmentViewII.esPako = true;
                    RecyclerViewFragmentViewII.nuevoPnombre = "perritopaco";

                }else{
                    Toast.makeText(getBaseContext(),nombreUsuarioNuevo + "  no es el usuario principal de la aplicación" , Toast.LENGTH_LONG).show();
                    RecyclerViewFragmentViewII.esPako = false;
                    RecyclerViewFragmentViewII.nuevoPnombre = "";
                }

                Intent intent = new Intent(MenuConfigurarCuenta.this, MainActivity.class);


                startActivity(intent);
                onBackPressed();


            }
        });
    }
}


