package switchCase;

import java.util.Scanner;

public class ClassificaçãoFilme {

    /*
     * Exercício 9: Categoria de Filme
     * 
     * Crie um programa que leia a classificação etária de um filme e mostre a faixa
     * etária permitida. As classificações são:
     * 
     * G (Livre)
     * 
     * PG (Maior de 10 anos)
     * 
     * PG-13 (Maior de 13 anos)
     * 
     * R (Maior de 18 anos)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Classificação do Filme: ");
        System.out.println("G (Livre)");
        System.out.println("PG (Maior de 10 anos)");
        System.out.println("PG-13 (Maior de 13 anos)");
        System.out.println("R (Maior de 18 anos)");
        String classificação = sc.nextLine().toUpperCase();
        switch (classificação) {
            case "G":
                System.out.println("Faixa etária permitida: Livre");
                break;
            case "PG":
                System.out.println("Faixa etária permitida: Maior de 10 anos");
                break;
            case "PG-13":
                System.out.println("Faixa etária permitida: Maior de 13 anos");
                break;
            case "R":
                System.out.println("Faixa etária permitida: Maior de 18 anos");
                break;
            default:
                System.out.println("Classificação inválida");
        }

        sc.close();
    }

}
