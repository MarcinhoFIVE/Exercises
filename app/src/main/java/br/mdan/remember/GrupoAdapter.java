package br.mdan.remember;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GrupoAdapter extends RecyclerView.Adapter<GrupoAdapter.ViewHolder> {

    Context context;
    List<Exercicio> grupo;

    public GrupoAdapter() {
    }

    public GrupoAdapter(Context context, List<Exercicio> grupo) {
        this.context = context;
        this.grupo = grupo;
    }

    @NonNull
    @Override
    public GrupoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GrupoAdapter.ViewHolder holder, int position) {
        holder.fotoGrupo.setImageResource(grupo.get(holder.getAdapterPosition()).getPhotoExercicio());
        holder.nomeGrupo.setText(grupo.get(holder.getAdapterPosition()).getNomeExercicio());
        holder.cardGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, grupo.get(holder.getAdapterPosition()).getNomeExercicio(), Toast.LENGTH_SHORT).show();
                switch (holder.getAdapterPosition()) {
                    case 0:
                        Toast.makeText(context, "Peito", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Peitoral.class);
                        context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                        //Intent intent = new Intent(context, Peitoral.class);
                        //context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return grupo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoGrupo;
        TextView nomeGrupo;
        CardView cardGrupo;
        public ViewHolder(View view) {
            super(view);
            fotoGrupo = view.findViewById(R.id.ivExercicio);
            nomeGrupo = view.findViewById(R.id.tvExercicio);
            cardGrupo = view.findViewById(R.id.cvExercicio);
        }
    }
}
