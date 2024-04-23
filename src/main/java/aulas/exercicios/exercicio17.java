package aulas.exercicios;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada: ");
        double area = scanner.nextDouble();

        int coberturaLitro = 6;
        int tamanhoLata = 18;
        int tamanhoGalao = 36 / 10; // 3,6 litros
        double precoLata = 80.0;
        double precoGalao = 25.0;

        double litrosNece = area / coberturaLitro * 1.1;

        int latasNecessarias = (int) Math.ceil(litrosNece / tamanhoLata);

        double precoTotalLatas = latasNecessarias * precoLata;

        int galoesNecessarios = (int) Math.ceil(litrosNece / tamanhoGalao);

        double precoTotalGaloes = galoesNecessarios * precoGalao;

        int latasParaMenorPreco = (int) (litrosNece / tamanhoLata);
        double litrosRestantes = litrosNece % tamanhoLata;
        int galoesParaMenorPreco = (int) Math.ceil(litrosRestantes / tamanhoGalao);
        double precoTotalMenorPreco = (latasParaMenorPreco * precoLata) + (galoesParaMenorPreco * precoGalao);

        System.out.println("Situação 1: Comprar apenas latas de 18 litros");
        System.out.println("Quantidade de latas: " + latasNecessarias);
        System.out.println("Preço total: R$" + precoTotalLatas);

        System.out.println("\nSituação 2: Comprar apenas galões de 3,6 litros");
        System.out.println("Quantidade de galões: " + galoesNecessarios);
        System.out.println("Preço total: R$" + precoTotalGaloes);

        System.out.println("\nSituação 3: Misturar latas e galões para o menor preço");
        System.out.println("Quantidade de latas: " + latasParaMenorPreco);
        System.out.println("Quantidade de galões: " + galoesParaMenorPreco);
        System.out.println("Preço total: R$" + precoTotalMenorPreco);

    }
}
