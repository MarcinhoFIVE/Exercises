package br.mdan.remember;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Exercicio> grupoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio_layout);
        recyclerView = findViewById(R.id.rvExercicio);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.hasFixedSize();
        grupoList = new ArrayList<>();
        grupoList.add(new Exercicio(R.drawable.supinoreto, "Peitoral", "Exercícios Para Peito"));
        grupoList.add(new Exercicio(R.drawable.supinoreto, "Dorsal", "Exercícios Para Costas"));
        grupoList.add(new Exercicio(R.drawable.supinoreto, "Membros Inferiores", "Exercício Para Pernas"));

        GrupoAdapter grupoAdapter = new GrupoAdapter(getApplicationContext(), grupoList);
        recyclerView.setAdapter(grupoAdapter);
    }
}