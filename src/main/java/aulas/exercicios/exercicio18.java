package aulas.exercicios;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivoMB = scanner.nextDouble();

        System.out.print("Digite a velocidade do link de Internet (em Mbps): ");
        double velocidadeMbps = scanner.nextDouble();

        double velocidadeMBMin = velocidadeMbps / 8 * 60;

        double tempoMinutos = tamanhoArquivoMB / velocidadeMBMin;

        System.out.println("Tempo aproximado de download: " + tempoMinutos + " minutos");

    }
}
