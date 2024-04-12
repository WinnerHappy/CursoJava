package aulas;

import java.util.Scanner;

public class Glossario {

        public static void main(String[] args) {
            // Vamos definir algumas variáveis e comentar o que elas fazem!

            // Variáveis primitivas

            // Variável do tipo inteiro
            int idade = 10; // Armazena um número inteiro, como a idade de uma pessoa.

            // Variável do tipo ponto flutuante
            double altura = 1.4; // Armazena um número de ponto flutuante, como a altura de uma pessoa.

            // Variável do tipo texto (String)
            String nome = "Joãozinho"; // Armazena uma sequência de caracteres, como o nome de uma pessoa.

            // Variável do tipo booleano
            boolean gostaDeChocolate = true; // Armazena um valor verdadeiro ou falso, como se uma pessoa gosta ou não de chocolate.

            // Variável do tipo caractere
            char genero = 'M'; // Armazena um caractere Unicode, como o gênero de uma pessoa ('M' para masculino, 'F' para feminino).

            // Variáveis de tipo primitivo numérico

            // Variável do tipo byte
            byte numeroPequeno = 5; // Armazena um número inteiro pequeno, como a quantidade de maçãs que uma pessoa comeu.

            // Variável do tipo short
            short distancia = 1000; // Armazena um número inteiro curto, como a distância percorrida por uma pessoa em metros.

            // Variável do tipo int
            int populacao = 1000000; // Armazena um número inteiro, como a população de uma cidade.

            // Variável do tipo long
            long populacaoMundial = 7800000000L; // Armazena um número inteiro longo, como a população mundial.

            // Variável do tipo float
            float preco = 5.99f; // Armazena um número de ponto flutuante de precisão simples, como o preço de um produto.

            // Variável do tipo double
            double precoDobro = 10.50; // Armazena um número de ponto flutuante de precisão dupla, como o preço de outro produto.

            // Variáveis de tipo não primitivo

            // Variável do tipo array
            int[] notas = {8, 9, 7, 10}; // Armazena uma sequência de valores do mesmo tipo, como as notas de um aluno.

            // Variável do tipo objeto
            Pessoa aluno = new Pessoa(); // Armazena uma instância de uma classe, como informações sobre um aluno.

            // Variáveis de tipo enum (enumerado)
            DiaDaSemana dia = DiaDaSemana.SEGUNDA; // Armazena um dos valores pré-definidos em um conjunto específico, como um dia da semana.

            // Variável do tipo char (array de caracteres)
            char[] palavra = {'h', 'e', 'l', 'l', 'o'}; // Armazena uma sequência de caracteres, como uma palavra.


           /* ------Sequência de ESCAPE--------

            \t = TAB
            \n = NOVA LINHA
            \r = RETORNO DE CARRO
            \' = ASPAS SIMPLES
            \" = ASPAS DUPLAS
            \\ = BARRA INVERTIDA

             */
            System.out.println(" \"Hello, World!\" \n\r \"Hello, World\""); // teste de output com aspas duplas usando a sequência de escape
            System.out.println("1\\4");

            /*--------------Leitura do teclado :--------------

            Scanner scan = new Scanner(System.in); // Classe Scanner realiza a leitura do que é digitado no teclado.
            String nome = scan.nextLine(); // tipo de utilização que é usado na Classe Scanner
            int idade = scan.nextInt(); // tipo de utilização que é usado na Classe Scanner
            double altura = scan.nextDouble(); // tipo de utilização que é usado na Classe Scanner
            */
        }
    }

    class Pessoa {
        String nome;
        int idade;
        double altura;
    }

    enum DiaDaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
    }

