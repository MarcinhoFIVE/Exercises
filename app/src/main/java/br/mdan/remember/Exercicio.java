package br.mdan.remember;

public class Exercicio {
    int photoExercicio;
    String nomeExercicio;
    String descExercicio;

    public Exercicio() {
    }

    public Exercicio(int photo, String first, String descExercicio) {
        this.photoExercicio = photo;
        this.nomeExercicio = first;
        this.descExercicio = descExercicio;
    }

    public int getPhotoExercicio() {
        return photoExercicio;
    }

    public void setPhotoExercicio(int photoExercicio) {
        this.photoExercicio = photoExercicio;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String first) {
        this.nomeExercicio = first;
    }

    public String getDescExercicio() {
        return descExercicio;
    }

    public void setDescExercicio(String descExercicio) {
        this.descExercicio = descExercicio;
    }

}
