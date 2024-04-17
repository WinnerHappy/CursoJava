package aulas.exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatuda em Celsius : ");
        double celsius = scanner.nextDouble();

        double farenheit = (celsius * 9/5 + 32);

        System.out.println("A temperatura em Farenheit é: " + farenheit + "°F");

    }
}
