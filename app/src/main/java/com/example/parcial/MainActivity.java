package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import Entidades.persona;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static List<persona> listaOrdenes;
    public static persona nuevaEncuesta;
    public static String conteoPlatos[]=new String[]{"Carne Asada. Ordenes: ","Postre de Chocolate. Ordenes: ","Sopa de Gallina. Ordenes: ","Pastel de fresas. Ordenes: "};
    public static int contar[]=new int[]{0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.listaOrdenes=new ArrayList<>();
        nuevaEncuesta=new persona();
    }

    public void clickNuevoEncuestado(View v){
        Intent nuevaEncuesta=new Intent(this,FormEncuesta.class);
        startActivity(nuevaEncuesta);
    }
    public void clickListaEncuesta(View v){
        if(listaOrdenes==null || listaOrdenes.size()==0){
            Toast.makeText(this,"No hay registros para mostrar",Toast.LENGTH_LONG).show();
        }else {
            Intent lista=new Intent(this,ListaEncuesta.class);
            startActivity(lista);
        }
    }
    public void clickProcesarEncuesta(View v){
        Intent pro=new Intent(this,procesarEncuesta.class);
        startActivity(pro);
    }
}
