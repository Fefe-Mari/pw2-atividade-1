package br.com.etechoracio.model;

import br.com.etechoracio.enums.FaseLuaEnum;
import br.com.etechoracio.enums.CondicaoClimaEnum;

import java.time.LocalDate;

public class PrevisaoTempo {
    LocalDate data;
    String local;
    CondicaoClimaEnum condicaoClima;
    Temperatura temperatura;
    double probabilidadeChuva;
    Vento velocidadeVento;
    FaseLuaEnum lua;
}

