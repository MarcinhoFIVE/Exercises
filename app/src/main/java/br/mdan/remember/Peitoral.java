package br.mdan.remember;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Peitoral extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Exercicio> exercicioList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio_layout);
        recyclerView = findViewById(R.id.rvExercicio);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.hasFixedSize();
        exercicioList = new ArrayList<>();
        exercicioList.add(new Exercicio(R.drawable.supinoreto, "Supino Reto", "Exercício Para Peito"));
        exercicioList.add(new Exercicio(R.drawable.supinoreto, "Supino Reto", "Exercício Para Peito"));
        exercicioList.add(new Exercicio(R.drawable.supinoreto, "Supino Reto", "Exercício Para Peito"));

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