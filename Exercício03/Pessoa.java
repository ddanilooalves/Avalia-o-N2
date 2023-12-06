package Exercício03;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private int day;
    private int month;
    private int year;
    private String name;
    private Universidade universidade;

    public Pessoa(String name, int day, int month, int year, Universidade universidade) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.universidade = universidade;
    }

    public void calculaIdade(LocalDate dataAtual) {
        LocalDate dataNascimento = LocalDate.of(year, month, day);
        Period periodo = Period.between(dataNascimento, dataAtual);
    }

    public String informaNome() {
        return name;
    }

    public String informaUniversidade() {
        return "Trabalha na universidade: " + universidade.informaNome();   
    }
}
