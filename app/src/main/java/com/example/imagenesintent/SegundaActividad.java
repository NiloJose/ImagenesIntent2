package com.example.imagenesintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.imagenesintent.databinding.ActivitySegundaActividadBinding;

public class SegundaActividad extends AppCompatActivity {
private ActivitySegundaActividadBinding binding1;
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding1 = ActivitySegundaActividadBinding.inflate(getLayoutInflater());
        setContentView(binding1.getRoot());

        Bundle extras = getIntent().getExtras();
        int imagen = extras.getInt("foto");
        String name =extras.getString("nombre");
        int audio = extras.getInt("audio");

        mp=MediaPlayer.create(SegundaActividad.this,audio);
        binding1.imgSegunda.setImageResource(imagen);
        binding1.textView.setText(name);
        mp.start();


    binding1.btnVolver.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent volver = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(volver);
            mp.stop();
        }
    });
    }

}