package aulas.exercicios;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de metros quadrados da área a ser pintada: ");
        double area = scan.nextDouble();

        int coberturaPorLitro = 3;

        int tamanholata = 18;
        double precoLata = 80.0;

        double litrosNece = Math.ceil( area / coberturaPorLitro );

        int latasNece = (int) Math.ceil(litrosNece / tamanholata);

        double precoTotal = latasNece * precoLata;

        System.out.println("Quantidade de latas de tinta necessárias : " + latasNece);
        System.out.println("Preço total : R$" + precoTotal);

    }
}
