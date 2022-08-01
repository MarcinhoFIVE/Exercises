package br.mdan.remember;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Componentes> grupoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio_layout);
        recyclerView = findViewById(R.id.rvExercicio);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.hasFixedSize();
        grupoList = new ArrayList<>();
        grupoList.add(new Componentes(R.drawable.peitoral, "Peitoral", "Exercícios Para Peito", 0, 0));
        grupoList.add(new Componentes(R.drawable.dorsal, "Dorsal", "Exercícios Para Costas", 0, 0));
        grupoList.add(new Componentes(R.drawable.quadriceps, "Quadriceps", "Exercício Para Coxa", 0, 0));

        GrupoAdapter grupoAdapter = new GrupoAdapter(getApplicationContext(), grupoList);
        recyclerView.setAdapter(grupoAdapter);
    }
}