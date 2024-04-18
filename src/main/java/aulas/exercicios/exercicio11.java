package aulas.exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int inteiro1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int inteiro2 = scanner.nextInt();

        System.out.println("Digite o um número real: ");
        double real = scanner.nextDouble();

        double produto = 2 * inteiro1  * (inteiro2 / 2.0);
        System.out.println("Valor do produto é: " + produto);

        double soma = (3 * inteiro1) + real;
        System.out.println("Valor da soma é: " + soma);

        double cubo = Math.pow(real , 3);
        System.out.println("Valor do cubo é: " + cubo);

    }
}
