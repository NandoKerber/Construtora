package com.example.construtorarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView equipe;
    private ImageView projetos;
    private ImageView contatos;
    private ImageView servicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        equipe = findViewById(R.id.nosID);
        projetos = findViewById(R.id.projID);
        servicos = findViewById(R.id.servID);
        contatos = findViewById(R.id.contID);


        equipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,equipe.class));
            }

        });

        projetos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,projetos.class));
            }

        });
        servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,servicos.class));
            }

        });
        contatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,contatos.class));
            }

        });
    }
}
