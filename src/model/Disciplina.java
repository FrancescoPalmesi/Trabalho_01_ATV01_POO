package model;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private double nota;

    public Disciplina(String nome, int cargaHoraria, double nota) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nota = nota;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }
    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }
}