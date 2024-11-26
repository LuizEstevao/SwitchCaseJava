package switchCase;

import java.util.Scanner;

public class CalculadoraeImpostos {

    /*
     * Exercício 7: Calculadora de Impostos
     * 
     * Implemente uma calculadora simples que calcula o imposto baseado na faixa
     * salarial do usuário. As faixas são:
     * 
     * Até R$1.500,00: Imposto de 5%
     * De R$1.501,00 a R$3.000,00: Imposto de 10%
     * Acima de R$3.000,00: Imposto de 15%
     * 
     * Peça o valor do salário e calcule o imposto.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, vamos calcular os impostos com base no seu salário?");
        System.out.println("Para isso, por favor, informe o valor do seu salário bruto: ");
        double salarioBruto = sc.nextDouble();
        double imposto = 0;
        double porcentagemInss = 0.14;
        double dependente = 0;

        System.out.println("Você possui dependentes? Se sim, quantos? Se não houver, digite 0:");
        dependente = sc.nextDouble();
        if (dependente > 0) {
            dependente = dependente * 189.59; // Dedução por dependente
        }

        // Calculando o salário base para imposto
        double salarioParaCalcularImposto = salarioBruto - (salarioBruto * porcentagemInss) - dependente;

        // Determinando a alíquota de imposto usando switch
        int faixaSalario;
        if (salarioParaCalcularImposto <= 1500) {
            faixaSalario = 1;
        } else if (salarioParaCalcularImposto <= 3000) {
            faixaSalario = 2;
        } else {
            faixaSalario = 3;
        }

        double aliquota = 0;

        switch (faixaSalario) {
            case 1:
                aliquota = 0.05; // 5%
                break;
            case 2:
                aliquota = 0.10; // 10%
                break;
            case 3:
                aliquota = 0.15; // 15%
                break;
            default:
                System.out.println("Erro ao determinar a faixa salarial.");
        }

        // Calculando o imposto
        imposto = salarioParaCalcularImposto * aliquota;

        // Exibindo o resultado
        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Salário para cálculo de imposto (após deduções): R$ %.2f%n", salarioParaCalcularImposto);
        System.out.printf("Imposto devido: R$ %.2f%n", imposto);

        sc.close();
    }
}
