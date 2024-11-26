package switchCase;

import java.util.Scanner;

public class NotaDoAluno {

    /*
     * Exercício 5: Nota do Aluno
     * 
     * Peça ao usuário para inserir uma nota de 0 a 10 e, com base na nota, imprima
     * a classificação:
     * 
     * 
     * 
     * 9 a 10: "A"
     * 
     * 7 a 8: "B"
     * 
     * 5 a 6: "C"
     * 
     * 3 a 4: "D"
     * 
     * 0 a 2: "F"
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá vamos verficar sua nota final?");
        System.out.println("Insira sua nota de 0 a 10");
        double nota = sc.nextDouble();

        switch ((int) nota) {
            case 0:
            case 1:
            case 2:
                System.out.println("F");
                break;
            case 3:
            case 4:
                System.out.println("D");
                break;
            case 5:
            case 6:
                System.out.println("C");
                break;
            case 7:
            case 8:
                System.out.println("B");
                break;
            case 9:
            case 10:
                System.out.println("A");
                break;

        }

        sc.close();

    }

}
