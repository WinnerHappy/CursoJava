package aulas.exercicios;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        double dobro = 2 * area;

        System.out.println("A área do quadrado é: " + area);

        System.out.println("O dobro da área do quadrado é: " + dobro);

    }
}
