package Exercício01;

public class TesteData {
    public static void main(String[] args) {
        Datas data1 = new Datas(12, 10, 2023);
        Datas data2 = new Datas();

        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);

        data1.avancarRetroceder(10);
        System.out.println("Data 1 após avançar 10 dias: " + data1);

        data2.avancarRetroceder(-5);
        System.out.println("Data 2 após retroceder 5 dias: " + data2);
    }
}

