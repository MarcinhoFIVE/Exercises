package br.mdan.remember;

public class Componentes {
    int photoExercicio;
    String nomeExercicio;
    String descExercicio;
    int photoInicial;
    int photoFinal;

    public Componentes() {
    }

    public Componentes(int photoExercicio, String nomeExercicio, String descExercicio, int photoInicial, int photoFinal) {
        this.photoExercicio = photoExercicio;
        this.nomeExercicio = nomeExercicio;
        this.descExercicio = descExercicio;
        this.photoInicial = photoInicial;
        this.photoFinal = photoFinal;
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

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

    public String getDescExercicio() {
        return descExercicio;
    }

    public void setDescExercicio(String descExercicio) {
        this.descExercicio = descExercicio;
    }

    public int getPhotoInicial() {
        return photoInicial;
    }

    public void setPhotoInicial(int photoInicial) {
        this.photoInicial = photoInicial;
    }

    public int getPhotoFinal() {
        return photoFinal;
    }

    public void setPhotoFinal(int photoFinal) {
        this.photoFinal = photoFinal;
    }
}
