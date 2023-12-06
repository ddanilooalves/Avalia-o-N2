package Exercício02;

import java.time.LocalDate;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        einstein.calculaIdade(LocalDate.now());
        newton.calculaIdade(LocalDate.now());

        System.out.println("Idade de " + einstein.informaNome() + ": " + einstein.informaIdade() + " anos");
        System.out.println("Idade de " + newton.informaNome() + ": " + newton.informaIdade() + " anos");
    }
}
