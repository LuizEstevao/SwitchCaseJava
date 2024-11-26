package switchCase;

import java.util.Scanner;

public class ConversorDeTemperatura {

    /*
     * Exercício 8: Conversor de Temperatura
     * 
     * Crie um programa que converta a temperatura de Celsius para Fahrenheit e
     * vice-versa. O usuário deve escolher a conversão:
     *
     * Celsius para Fahrenheit
     * 
     * Fahrenheit para Celsius
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, vamos realizar conversões de temperatura.");
        System.out.println("Para isso, escolha a opção de conversão: ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Escolha a opção: ");
        int opcaoConversao = sc.nextInt();

        System.out.println("Agora, escolha o valor que deseja converter:");
        double valor = sc.nextDouble();
        double resultado = 0;

        switch (opcaoConversao) {
            case 1:
                resultado = valor * 1.8 + 32;
                System.err.printf("O resultado da conversão de Celsius para Fahrenheit é %.2f F°", resultado);
                break;
            case 2:
                resultado = (valor - 32) * 5 / 9;
                System.err.printf("O resultado da conversão de Fahrenheit para Celsius é %.2f C°", resultado);
                break;
        }

        sc.close();
    }

}
