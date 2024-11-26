package switchCase;

import java.util.Scanner;

public class DiaDaSemana {

    /*
     * Peça ao usuário para digitar um número de 1 a 7 e, em seguida, imprima o nome
     * do dia correspondente (1 = "Domingo", 2 = "Segunda-feira", etc.). Use o
     * comando switch case.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esolha um numero correspondente a um dia da semana. \n");
        System.out.println("2 - Segunda-feira \n");
        System.out.println("3 - Terça-feira \n");
        System.out.println("4 - Quarta-feira \n");
        System.out.println("5 - Quinta-feira \n");
        System.out.println("6 - Sexta-feira \n");
        System.out.println("7 - Sábado \n");
        System.out.println("1 - Domingo \n");
        int diaDaSemana = sc.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.printf("Domingo");
                break;
            case 2:
                System.out.printf("Segunda-feira");
                break;
            case 3:
                System.out.printf("Terça-feira");
                break;
            case 4:
                System.out.printf("Quarta-feira");
                break;
            case 5:
                System.out.printf("Quinta-feira");
                break;
            case 6:
                System.out.printf("Sexta-feira");
                break;
            case 7:
                System.out.printf("Sábado");
                break;
        }

        sc.close();

    }

}
