package alberto.cano.a05ejercicioinmobiliario;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;


import alberto.cano.a05ejercicioinmobiliario.Modelos.Inmuebles;
import alberto.cano.a05ejercicioinmobiliario.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private ArrayList<Inmuebles> listaInmuebles;

    private ActivityResultLauncher<Intent> editInmuebleLauncher;
    private ActivityResultLauncher<Intent> addInmuebleLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listaInmuebles = new ArrayList<>();
        inicializarLaunchers();



        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //addInmuebleLauncher.launch();

            }
        });
    }

    private void inicializarLaunchers() {
        addInmuebleLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                        //Que hago a la vuelta de Crear Inmuebles
                    }
                }
                );

        editInmuebleLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                        //Que hago a la vuelta de Editar Inmuebles
                    }
                });
    }
}