package switchCase;

import java.util.Scanner;

public class Bebida {
    /*
     * Exercício 6: Escolha de Bebida Crie um programa onde o usuário escolhe uma
     * bebida pelo número:
     * 
     * Café
     * 
     * Chá
     * 
     * Suco
     * 
     * Refrigerante Use switch case para exibir a bebida escolhida.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma bebida: ");
        System.out.println("1 - Café");
        System.out.println("2 - Chá");
        System.out.println("3 - Suco");
        System.out.println("4 - Refrigerante");
        System.out.print("Digite o número da bebida: ");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Você escolheu o Café");
                break;
            case 2:
                System.out.println("Você escolheu o Chá");
                break;
            case 3:
                System.out.println("Você escolheu o Suco");
                break;
            case 4:
                System.out.println("Você escolheu o Refrigerante");
                break;
            default:
                System.out.println("Opção inválida");
        }

        sc.close();

    }

}
