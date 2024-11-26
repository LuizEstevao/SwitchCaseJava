package switchCase;

import java.util.Scanner;

public class MenuDeOpções {

    /*
     * Exercício 4: Menu de Opções
     * 
     * Implemente um menu de opções onde o usuário pode escolher entre 3 opções:
     * 
     * 
     * 
     * Exibir "Olá, Mundo!"
     * 
     * Exibir "Bem-vindo ao Java"
     * 
     * Sair do programa
     * 
     * Utilize switch case para executar a opção escolhida.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, bem vindo ao programa, escolha uma das opções:");
        System.out.println("1 - Exibir 'Olá, Mundo!'");
        System.out.println("2 - Exibir 'Bem-vindo ao Java'");
        System.out.println("3 - Sair do programa");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
            System.out.println("Olá, Mundo!");
            break;
            case 2:
            System.out.println("Bem-vindo ao Java");
            break;
            case 3:
            System.out.println("Saindo do programa");
            System.exit(0);
            break;
        }

        sc.close();
    }

}
