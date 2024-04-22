package aulas.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que você ganha por hora:");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mes:");
        double horasMes = scan.nextDouble();

        double salarioBruto = valorHora * horasMes;

        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicado = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - ir - inss - sindicado;

        System.out.println("Folha de Pagamento: ");
        System.out.println("\r1.Salario Bruto: "+ salarioBruto);
        System.out.println("\r2.Salario Líguido: " + salarioLiquido);
        System.out.println("\nDescontos : ");
        System.out.println("\r1.Imposto de Renda: "+ ir);
        System.out.println("\r2.INSS: "+ inss);
        System.out.println("\r3.Sindicato: "+ sindicado);
        System.out.println("\nInformações de Pagamento : ");
        System.out.println("Salario Bruto: R$" + salarioBruto + " - R$" + ir + "/IR(11%) - R$" + inss + "/INSS(8%) - R$" + sindicado + "/Sindicato(5%) = R$" + salarioLiquido + "/Salario Líquido");






    }
}
