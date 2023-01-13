package com.example.imagenesintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.imagenesintent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgRick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent presionar = new Intent(getApplicationContext(),SegundaActividad.class);
                String nombre = "RICK SÁNCHEZ";
                presionar.putExtra("foto",R.drawable.rick2);
                presionar.putExtra("nombre",nombre);
                presionar.putExtra("audio",R.raw.wuba);
                startActivity(presionar);
            }
        });
        binding.imgBender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent presionar = new Intent(getApplicationContext(),SegundaActividad.class);
                String nombre = "BENDER";
                presionar.putExtra("foto",R.drawable.bender);
                presionar.putExtra("nombre",nombre);
                presionar.putExtra("audio",R.raw.azarymujerzuelas);
                startActivity(presionar);
            }
        });
        binding.imgBean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent presionar = new Intent(getApplicationContext(),SegundaActividad.class);
                String nombre = "BEAN & LUCY";
                presionar.putExtra("foto",R.drawable.bean);
                presionar.putExtra("nombre",nombre);
                presionar.putExtra("audio",R.raw.lucylios);
                startActivity(presionar);
            }
        });
        binding.imgHomero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent presionar = new Intent(getApplicationContext(),SegundaActividad.class);
                String nombre = "HOMERO SIMPSON";
                presionar.putExtra("foto",R.drawable.homero2);
                presionar.putExtra("nombre",nombre);
                presionar.putExtra("audio",R.raw.risahomero);
                startActivity(presionar);
            }
        });
    }
}