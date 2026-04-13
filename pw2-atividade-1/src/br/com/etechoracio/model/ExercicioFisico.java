package br.com.etechoracio.model;

import br.com.etechoracio.enums.NivelDificuldadeEnum;

public class ExercicioFisico {
    String nome;
    GrupoMuscular grupoMuscular;
    String imagem;
    String descricao;
    int numeroSeries;
    int numeroRepeticoes;
    double cargaSugerida;
    NivelDificuldadeEnum nivelDificuldade;
}
