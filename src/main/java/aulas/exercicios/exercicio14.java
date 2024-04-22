package aulas.exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Peso dos peixes em Quilos: ");
        double peso = scanner.nextDouble();

        double pesoMax = 50.0;

        double excesso = 0.0;
        double multa = 0.0;

        if ( peso > pesoMax ) {
            excesso = peso - pesoMax;
            multa = excesso * 4.0;
        }

        if ( excesso > 0 ) {
            System.out.println("Peso excedente: " + excesso + "kg");
            System.out.println("Multa a ser paga: R$" + multa);
        }
        else {
            System.out.println("Peso dentro do permitido. Excesso: 0");
            System.out.println("Multa 0");
        }
    }
}
