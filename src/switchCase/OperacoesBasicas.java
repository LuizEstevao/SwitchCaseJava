package switchCase;

import java.util.Scanner;

public class OperacoesBasicas {

    /*
     * Crie um programa que leia dois números e um operador (+, -, *, /), e então
     * execute a operação correspondente. Se o operador for inválido, mostre uma
     * mensagem de erro.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores e depois escolha a operação matemática que deseja realizar: ");
        System.out.println("Escolha o primeiro valor:");
        double valor1 = sc.nextDouble();
        System.out.println("Escolha o segundo valor:");
        double valor2 = sc.nextDouble();
        System.out.println("Adição = 1");
        System.out.println("Subtração = 2");
        System.out.println("Multiplicação = 3");
        System.out.println("Divisão = 4");
        int operador = sc.nextInt();

        if (operador != 1 && operador != 2 && operador != 3 && operador != 4) {
            System.out.println("Operador inválido");
        } else {

            switch (operador) {
                case 1:
                    System.out.printf("%.2f", valor1 + valor2);
                    break;
                case 2:
                    System.out.printf("%.2f", valor1 - valor2);
                    break;
                case 3:
                    System.out.printf("%.2f", valor1 * valor2);
                    break;
                case 4:
                    System.out.printf("%.2f", valor1 / valor2);
            }

        }

        sc.close();
    }

}
