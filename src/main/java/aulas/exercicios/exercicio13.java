package aulas.exercicios;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu sexo: ");
        System.out.println("1.Masculino");
        System.out.println("2.Feminino");
        int sexo =  scanner.nextInt();

        double pesoIdeal = 0;
        if (sexo == 1) {
            pesoIdeal = (72.7 * altura) - 58;
        }
        else if (sexo == 2){
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        else {
            System.out.println("Sexo inválido. Por favor, digite uma das opções acima");
        }

        System.out.println("Digite o seu peso atual: ");
        double pesoAtual = scanner.nextDouble();

        if (pesoAtual == pesoIdeal){
            System.out.println("Você está no peso ideal!");
        }
        else if (pesoAtual < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal");
        }
        else {
            System.out.println("Você está acima do peso ideal");
        }

        System.out.println("Suas Informações: ");
        System.out.println("Sua Altura: " + altura);
        System.out.println("Seu Sexo: " + sexo);
        System.out.println("Seu Peso: "+ pesoAtual);
        System.out.println("Seu Peso Ideal: " + pesoIdeal);

    }

}
