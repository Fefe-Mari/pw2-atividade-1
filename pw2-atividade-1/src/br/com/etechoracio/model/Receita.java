package br.com.etechoracio.model;

import br.com.etechoracio.enums.CustoEnum;
import br.com.etechoracio.enums.NiveldeDificuldadeEnum;

public class Receita {
    String nome;
    Autor autor;
    NiveldeDificuldadeEnum niveldeDificuldade;
    CustoEnum custo;
    int tempoPreparo;
    double avaliacoes;
    int porcoes;
    String descricao;
}

