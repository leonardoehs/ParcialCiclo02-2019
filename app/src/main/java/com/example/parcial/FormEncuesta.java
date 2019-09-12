package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.parcial.MainActivity.nuevaEncuesta;

public class FormEncuesta extends AppCompatActivity {
    EditText txtEdad,txtUbicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_encuesta);

        txtEdad=findViewById(R.id.txtEdad);
        txtUbicacion=findViewById(R.id.txtUbicacion);
    }

    public void clickSeleccionarAlimento(View v){
        if(txtEdad.getText().toString().isEmpty()){
            Toast.makeText(this,"Por favor llene la edad",Toast.LENGTH_LONG).show();
        }else if(txtUbicacion.getText().toString().isEmpty()){
            Toast.makeText(this,"Por favor llene la ubicacion",Toast.LENGTH_LONG).show();
        }else {
            nuevaEncuesta.setEdad(txtEdad.getText().toString());
            nuevaEncuesta.setUbicacion(txtUbicacion.getText().toString());
            Intent alimen=new Intent(this,ListaComida.class);
            startActivity(alimen);
            finish();
        }
    }
}
