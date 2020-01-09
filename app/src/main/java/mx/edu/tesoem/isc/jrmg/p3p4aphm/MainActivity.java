package mx.edu.tesoem.isc.jrmg.p3p4aphm;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvDatos;
    ArrayList<String> arreglo = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvDatos = findViewById(R.id.gvDatos);
        Contenido obj = new Contenido(arreglo, this);
        gvDatos.setAdapter(obj);
        arreglo.add("Fernando");
        arreglo.add("Marisol");
        arreglo.add("Javier");
        arreglo.add("Maritza");
        arreglo.add("Flor");
        arreglo.add("Miguel");
        arreglo.add("Francisco");
        arreglo.add("Alfonso");
        arreglo.add("Antonio");
        arreglo.add("Federico");
    }
}
