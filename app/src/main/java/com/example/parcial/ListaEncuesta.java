package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.parcial.MainActivity.listaOrdenes;
import Adaptador.adaptadorPersona;
import android.os.Bundle;
import android.widget.ListView;

public class ListaEncuesta extends AppCompatActivity {
    ListView lstEncuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_encuesta);
        lstEncuesta=findViewById(R.id.lstEncuesta);
        lstEncuesta.setAdapter(new adaptadorPersona(this,R.layout.plantilla_lista,listaOrdenes));
    }
}
