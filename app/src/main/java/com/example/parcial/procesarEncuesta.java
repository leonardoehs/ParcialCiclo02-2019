package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import static com.example.parcial.MainActivity.conteoPlatos;
import static com.example.parcial.MainActivity.contar;

public class procesarEncuesta extends AppCompatActivity {
    ListView lstContadorComida;
    String lista[]=new String[]{"","","",""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procesar_encuesta);
        lstContadorComida=findViewById(R.id.lstContadorComida);
        concatenar();
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adaptador.addAll(lista);
        lstContadorComida.setAdapter(adaptador);

        adaptador.notifyDataSetChanged();
    }

    private void concatenar(){
        lista[0]=conteoPlatos[0]+contar[0];
        lista[1]=conteoPlatos[1]+contar[1];
        lista[2]=conteoPlatos[2]+contar[2];
        lista[3]=conteoPlatos[3]+contar[3];
    }
}
