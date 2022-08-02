package br.mdan.remember;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
        recebeMuscle = intent.getIntExtra("muscle", 0);

        switch (recebeMuscle) {
            case 0:
                //Toast.makeText(context, "Peito", Toast.LENGTH_SHORT).show();
                exercicioList = new ArrayList<>();
                exercicioList.add(new Componentes(R.drawable.supinoreto, "Supino Reto Com Barra", "Peitoral Maior", R.drawable.srinicial, R.drawable.srfinal));
                exercicioList.add(new Componentes(R.drawable.supinoinclinado, "Supino Inclinado Com Barra", "Peitoral Superior", R.drawable.siinicial, R.drawable.sifinal));
                exercicioList.add(new Componentes(R.drawable.supinodeclinado, "Supino Declinado Com Barra", "Peitoral Inferior", R.drawable.sdinicial, R.drawable.sdfinal));
                break;
            case 1:
                //Toast.makeText(context, "Peito", Toast.LENGTH_SHORT).show();
                exercicioList = new ArrayList<>();
                exercicioList.add(new Componentes(R.drawable.supinoreto, "Costas", "Peitoral Maior", R.drawable.srinicial, R.drawable.srfinal));
                exercicioList.add(new Componentes(R.drawable.supinoinclinado, "Costas", "Peitoral Superior", R.drawable.siinicial, R.drawable.sifinal));
                exercicioList.add(new Componentes(R.drawable.supinodeclinado, "Costas", "Peitoral Inferior", R.drawable.sdinicial, R.drawable.sdfinal));
                break;
            case 2:
                //Toast.makeText(context, "Peito", Toast.LENGTH_SHORT).show();
                exercicioList = new ArrayList<>();
                exercicioList.add(new Componentes(R.drawable.cadeiraextensora, "Cadeira Extensora", "Quadríceps", R.drawable.ceinicial, R.drawable.cefinal));
                exercicioList.add(new Componentes(R.drawable.supinodeclinado, "Quadriceps", "Peitoral Inferior", R.drawable.sdinicial, R.drawable.sdfinal));
                break;
            case 3:
                //Toast.makeText(context, "Peito", Toast.LENGTH_SHORT).show();
                exercicioList = new ArrayList<>();
                exercicioList.add(new Componentes(R.drawable.cadeiraflexora, "Cadeira Flexora", "Bíceps Femural", R.drawable.cfinicial, R.drawable.cffinal));
                break;
            default:
                break;
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