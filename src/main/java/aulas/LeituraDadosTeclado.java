package aulas;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Digite seu Nome Completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Seu Nome: " + nomeCompleto);

        System.out.println("Digite seu Nome Primeiro nome: ");
        String primeiroNome = scanner.next();
        System.out.println("Seu Primeiro nome é: " + primeiroNome);

        System.out.println("Digite a Sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Você tem " + idade + " anos");

        System.out.println("Digite a Sua Altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Sua altura é: " + altura + "cm");*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichos de estimação:");
        String primeiroNome = scanner.next();
        int idade = scanner.nextInt();
        byte qtdFilhos = scanner.nextByte();
        float altura = scanner.nextFloat();
        boolean temPet = scanner.nextBoolean();

        System.out.println("Informações Digitadas:" + "\n\r Seu Primeiro nome: " + primeiroNome + "\n\r Sua idade: " + idade + "\n\r Quantidade de filhos: " + qtdFilhos + "\n\r Sua Altura: " + altura + "\n\r Tem bichinhos de estimação: " + temPet);
    }
}
