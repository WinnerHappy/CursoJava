package aulas.exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o quantitativo em metros: ");
        double metros = scanner.nextDouble();

        double resultado = metros * 100;

        System.out.println("A conversão deu " + resultado + " cm");
    }
}
