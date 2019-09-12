package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import Entidades.persona;

import static com.example.parcial.MainActivity.nuevaEncuesta;
import static com.example.parcial.MainActivity.listaOrdenes;
import static com.example.parcial.MainActivity.contar;
import static com.example.parcial.MainActivity.conteoPlatos;

public class ListaComida extends AppCompatActivity {
    private String comidas[]=new String[]{"Carne Asada","Postre de Chocolate","Sopa de Gallina","Pastel de fresas"};
    ListView lstComida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_comida);

        lstComida=findViewById(R.id.lstComida);
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adaptador.addAll(comidas);
        lstComida.setAdapter(adaptador);

        adaptador.notifyDataSetChanged();

        this.lstComida.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position>=0 && position<comidas.length){
                    nuevaEncuesta.setComida(comidas[position]);
                    if(guardarOrden()){
                        if(comidas[position].equals("Carne Asada")){
                            contar[position]++;
                        }
                        if(comidas[position].equals("Postre de Chocolate")){
                            contar[position]++;
                        }
                        if(comidas[position].equals("Sopa de Gallina")){
                            contar[position]++;
                        }
                        if(comidas[position].equals("Pastel de fresas")){
                            contar[position]++;
                        }
                        finish();
                    }
                }
            }
        });
    }

    private boolean guardarOrden(){
        boolean guardado=false;
        if(!nuevaEncuesta.getComida().isEmpty() && !nuevaEncuesta.getUbicacion().isEmpty() &&
            !nuevaEncuesta.getEdad().isEmpty()){
            listaOrdenes.add(nuevaEncuesta);
            nuevaEncuesta=new persona();
            guardado=true;
            Toast.makeText(this,"Encuestada Registrada con Exito",Toast.LENGTH_LONG).show();
        }
        return guardado;
    }
}
