package aulas.exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor recebido por hora: ");
        double valorhr = scanner.nextDouble();

        System.out.println("Digite o valor total de horas trabalhadas: ");
        double hora = scanner.nextDouble();

       double resultado = valorhr * hora;

        System.out.println("Total do Salário: " + resultado);
    }
}
