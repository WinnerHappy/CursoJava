package aulas.exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.println("A área do cículo é: " + area);

    }
}
