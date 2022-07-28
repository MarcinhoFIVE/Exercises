package br.mdan.remember;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class ExercicioClicked extends AppCompatActivity {
    ImageView recebeInicial;
    ImageView recebeFinal;
    TextView recebeWhat;
    TextView recebeDescribe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio_clicked_layout);
        recebeInicial = findViewById(R.id.ivPosicaoInicial);
        recebeFinal = findViewById(R.id.ivPosicaoFinal);
        recebeWhat = findViewById(R.id.tvRecebeWhat);
        recebeDescribe = findViewById(R.id.tvRecebeDescribe);

        Intent intent = getIntent();
        int foto;
        String nome, desc;
        foto = intent.getIntExtra("FotoRemember",0);
        nome = intent.getStringExtra("TextRemember");
        desc = intent.getStringExtra("TextDescribe");

        recebeInicial.setImageResource(foto);
        recebeFinal.setImageResource(foto);
        recebeWhat.setText(nome);
        recebeDescribe.setText(desc);

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