package aulas.exercicios;

import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatuda em Farenheit: ");
        double farenheit = scanner.nextDouble();

        double celsius = (farenheit - 32) * 5/9;

        System.out.println("A temperatura em Celsius é: " + celsius + "°C");
    }
}
