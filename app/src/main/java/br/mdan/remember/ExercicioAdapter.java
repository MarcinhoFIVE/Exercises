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

public class ExercicioAdapter extends RecyclerView.Adapter<ExercicioAdapter.ViewHolder> {

    Context context;
    List<Componentes> exercicio;

    public ExercicioAdapter() {
    }

    public ExercicioAdapter(Context context, List<Componentes> exercicio) {
        this.context = context;
        this.exercicio = exercicio;
    }

    @NonNull
    @Override
    public ExercicioAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExercicioAdapter.ViewHolder holder, int position) {
        holder.photoRemember.setImageResource(exercicio.get(holder.getAdapterPosition()).getPhotoExercicio());
        holder.textRemember.setText(exercicio.get(holder.getAdapterPosition()).getNomeExercicio());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, exercicio.get(holder.getAdapterPosition()).getNomeExercicio(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, ExercicioClicked.class);
                intent.putExtra("FotoRemember", exercicio.get(holder.getAdapterPosition()).getPhotoExercicio());
                intent.putExtra("TextRemember", exercicio.get(holder.getAdapterPosition()).getNomeExercicio());
                intent.putExtra("TextDescribe", exercicio.get(holder.getAdapterPosition()).getDescExercicio());
                intent.putExtra("FotoInicial", exercicio.get(holder.getAdapterPosition()).getPhotoInicial());
                intent.putExtra("FotoFinal", exercicio.get(holder.getAdapterPosition()).getPhotoFinal());

                context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    @Override
    public int getItemCount() {
        return exercicio.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView photoRemember;
        TextView textRemember;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            photoRemember = itemView.findViewById(R.id.ivExercicio);
            textRemember = itemView.findViewById(R.id.tvExercicio);
            cardView = itemView.findViewById(R.id.cvExercicio);
        }
    }
}
