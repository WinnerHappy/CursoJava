package aulas;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar os números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Exibe o menu de opções
        System.out.println("Escolha o numero da operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double resultado;

        // Realiza a operação selecionada
        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    return; // Sai do programa
                }
                break;
            default:
                System.out.println("Opção inválida.");
                return; // Sai do programa
        }

        // Exibe o resultado
        System.out.println("O resultado da operação é: " + resultado);

        // Fecha o scanner
        scanner.close();
    }
}