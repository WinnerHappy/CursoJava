package aulas;

public class Operadores {
    public static void main(String[] args) {

        // -------- OPERADORES ARITMÉTICOS ------------
        System.out.println("Teste de Operadores Aritméticos");
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        // ---------------------------------------------

        System.out.println("Teste de operação com incremento");
        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        System.out.println(resultado++); // incremento é adicionado depois do resultado
        /* Mesma coisa que :
        System.out.println(resultado);
        resultado = resultado +1;
        resultado += 1;
         */

        System.out.println(++resultado); // incremento é adicionado antes do resultado
        /* Mesma coisa que :
        resultado += 1;
        System.out.println(resultado);
         */

        resultado --;
        System.out.println(resultado);

        System.out.println(resultado--); // decremento é adicionado depois do resultado
        System.out.println(--resultado); // decremento é adicionado antes do resultado

        // ---------------------------------------------

        System.out.println("Teste de operação com Strings");
        String primeiraString = "Esta é";
        String segundaString = " uma String concatenada.";
        String terceiraString = primeiraString + segundaString;
        System.out.println(terceiraString);

        // -------- OPERADORES RELACIONAIS ------------
        System.out.println("Teste de Operadores Relacionais");
        int valor1 = 1;
        int valor2 = 2;

        System.out.println("valor1 == valor2: " + (valor1 == valor2));
        System.out.println("valor1 != valor2: " + (valor1 != valor2));
        System.out.println("valor1 >= valor2: " + (valor1 > valor2));
        System.out.println("valor1 >= valor2: " + (valor1 >= valor2));
        System.out.println("valor1 < valor2: " + (valor1 < valor2));
        System.out.println("valor1 <= valor2: " + (valor1 <= valor2));

        // -------- OPERADORES LOGICOS ------------
        System.out.println("Teste de Operadores Logicos");
        int valor3 = 1;
        int valor4 = 2;

        boolean resultado1 = (valor3 == 1) && (valor4 == 2);
        System.out.println("valor3 é 1 AND valor4 é 2 - resultado: " + resultado1);

        boolean resultado2 = (valor3 == 1) || (valor4 == 2);
        System.out.println("valor3 é 1 OR valor4 é 2 - resultado: " + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);

        // -------- Curto Circuito ------------
        System.out.println("Teste Curto Circuito");
        boolean verdadeiiro = true;
        boolean fallso = false;
        boolean resultadoBoolean1 = fallso &
                verdadeiiro;
        boolean resultadoBoolean2 = fallso &&
                verdadeiiro;
        System.out.println(resultadoBoolean1);
        System.out.println(resultadoBoolean2);

    }
}
