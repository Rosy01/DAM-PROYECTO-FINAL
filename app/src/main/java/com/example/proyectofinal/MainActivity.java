package com.example.proyectofinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.opcion1){
            Intent i1 = new Intent(MainActivity.this, crearCalendario.class);
            startActivity(i1);
            return true;
        }else if(item.getItemId()==R.id.opcion2){
            Intent i1 = new Intent(MainActivity.this, verCursos.class);
            startActivity(i1);
            return true;
        }else if(item.getItemId()==R.id.opcion3){
            Intent i1 = new Intent(MainActivity.this, programarRecordatorio.class);
            startActivity(i1);
            return true;
        }else if(item.getItemId()==R.id.opcion4){
            Intent i1 = new Intent(MainActivity.this, Ajustes.class);
            startActivity(i1);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    //Boton Crear Cuenta

    public void crearcuenta(View view){
        Intent crearcuenta = new Intent(this, crearCuenta.class);
        startActivity(crearcuenta);
    }
}