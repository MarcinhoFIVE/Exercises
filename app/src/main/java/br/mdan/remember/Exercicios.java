package br.mdan.remember;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exercicios extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Componentes> exercicioList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio_layout);

        Intent intent = getIntent();
        int recebeMuscle;
        recebeMuscle = intent.getIntExtra("muscle",0);

        switch (recebeMuscle) {
            case 0:
                //Toast.makeText(context, "Peito", Toast.LENGTH_SHORT).show();
                exercicioList = new ArrayList<>();
                exercicioList.add(new Componentes(R.drawable.supinoreto, "Supino Reto", "Peitoral Maior", R.drawable.srinicial, R.drawable.srfinal));
                exercicioList.add(new Componentes(R.drawable.supinoreto, "Supino Inclinado", "Peitoral Superior", R.drawable.srinicial, R.drawable.srfinal));
                exercicioList.add(new Componentes(R.drawable.supinoreto, "Supino Declinado", "Peitoral Inferior", R.drawable.srinicial, R.drawable.srfinal));
            case 1:
                exercicioList = new ArrayList<>();
                exercicioList.add(new Componentes(R.drawable.supinoreto, "Costas", "Costas", R.drawable.srinicial, R.drawable.srfinal));
                exercicioList.add(new Componentes(R.drawable.supinoreto, "Costas", "Costas", R.drawable.srinicial, R.drawable.srfinal));
                exercicioList.add(new Componentes(R.drawable.supinoreto, "Costas", "Costas", R.drawable.srinicial, R.drawable.srfinal));
        }

        recyclerView = findViewById(R.id.rvExercicio);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.hasFixedSize();

        ExercicioAdapter exercicioAdapter = new ExercicioAdapter(getApplicationContext(), exercicioList);
        recyclerView.setAdapter(exercicioAdapter);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}