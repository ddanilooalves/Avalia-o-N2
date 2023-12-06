package Exercício02;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private int age;
    private int day;
    private int month;
    private int year;
    private String name;

    public Pessoa(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        
        calculaIdade(LocalDate.now());
    }

    public Pessoa() {

    }

    public void calculaIdade(LocalDate dataAtual) {
        LocalDate dataNascimento = LocalDate.of(year, month, day);
        Period periodo = Period.between(dataNascimento, dataAtual);
        age = periodo.getYears();
    }

    public int informaIdade() {
        return age;
    }

    public String informaNome() {
        return name;
    }

    public void ajustaDataDeNascimento(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
