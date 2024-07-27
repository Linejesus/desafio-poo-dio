package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{

    private int cargaHoraria;
    private String dificuldade;
    private LocalDate data;

    @Override
    public double calcularXp() {
        switch (dificuldade.toLowerCase()) {
            case "fácil":
                return XP_PADRAO * cargaHoraria;
            case "médio":
                return XP_PADRAO * cargaHoraria * 1.5;
            case "difícil":
                return XP_PADRAO * cargaHoraria * 2;
            default:
                return XP_PADRAO * cargaHoraria;
        }
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria + '\'' +
                ", dificuldade=" + dificuldade + '\'' +
                ", data para finalizar o curso=" + data +
                '}';
    }

}
