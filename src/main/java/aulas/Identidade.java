package aulas;

import java.util.Scanner;

public class Identidade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Informações:
        /*String nome = scan.nextLine();
        String sobrenome = "Happy";
        String trabalho = scan.nextLine();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();
        double salario = scan.nextDouble(); // quem me dera, pena q é fictício

        System.out.println("Suas Informações :\n\r 1.Nome: " +nome + "\n\r 2.Sobrenome: " + sobrenome + "\n\r 3.Idade: " + idade + "\n\r 4.Altura : " + altura + "\n\r 5.Trabalho: " + trabalho + "\n\r 6.Salário: " + salario);
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Trabalho: " + trabalho);
        System.out.println("Salário: " + salario);*/

        System.out.println("Digite o seu Cargo:");
        String trab = scanner.nextLine();

        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu telefone para contato: ");
        long contato = scanner.nextLong();

        System.out.println("Digite seu Salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Informações Digitadas: ");
        System.out.println("Seu Nome: " + nome + " " + sobrenome);
        System.out.println("Sua Idade: " + idade + " anos");
        System.out.println("Sua Altura: " + altura + " cm");
        System.out.println("Seu Trabalho: " + trab);
        System.out.println("Seu Salário: " + salario);
        System.out.println("Seu Contato: " + contato);

    }
}
