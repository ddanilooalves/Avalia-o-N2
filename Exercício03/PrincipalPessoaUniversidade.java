package Exercício03;

public class PrincipalPessoaUniversidade {
    public static void main(String[] args) {
        Universidade princeton = new Universidade("Princeton (Nova Jersey - EUA)");
        Universidade cambridge = new Universidade("Cambridge (Inglaterra)");

        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879, princeton);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643, cambridge);

        System.out.println(einstein.informaNome() + " - " + einstein.informaUniversidade());
        System.out.println(newton.informaNome() + " - " + newton.informaUniversidade());
    }
}
