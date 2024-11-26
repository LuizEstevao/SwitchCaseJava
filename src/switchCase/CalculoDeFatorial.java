package switchCase;

import java.util.Scanner;

public class CalculoDeFatorial {
    public static void main(String[] args) {

        /*
         * Exercício 10: Calculadora de Fatorial
         * 
         * Crie um programa que calcule o fatorial de um número utilizando um switch
         * case para selecionar as operações, mas para esse exercício, será necessário
         * usar o switch case para verificar as condições.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá vamos calcular o fatorial de um numero?");
        System.out.println("Escolha um numero: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 0:
                System.out.println("O fatorial de 0 é 1");
                break;
            case 1:
                System.out.println("O fatorial de 1 é 1");
                break;
            default:
                if (numero < 0) {
                    System.out.println("Não é possível calcular o fatorial de um numero negativo");
                } else {
                    long fatorial = 1;
                    for (int contadora = 1; contadora <= numero; contadora++) {
                        fatorial *= contadora;
                    }
                    System.out.println("O fatorial de " + numero + " é " + fatorial);
                }
                ;

                sc.close();

        }

    }
}
