package Desafios.Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        // Abrir o scanner
        Scanner caixaDeTexto = new Scanner(System.in);


        // Menu principal
        System.out.println("Escolha o que deseja fazer!: ");
        System.out.println("1 - Adicionar um ninja");
        System.out.println("2 - Morrer");


        // Pedir para o usuario escolher uma opçao
        int escolhaDoUsuario = caixaDeTexto.nextInt();
        caixaDeTexto.nextLine(); // Buffer limpo
        System.out.println("Você digitou o número: " + escolhaDoUsuario);


        // Reaçao ao escolher uma opção
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Escreva aqui o nome do ninja 1: ");
                String nomeDoNinja = caixaDeTexto.nextLine();

                System.out.println("Escreva aqui o nome do ninja 2: ");
                String nomeDoNinja1 = caixaDeTexto.nextLine();

                System.out.println("Escreva aqui o nome do ninja 3: ");
                String nomeDoNinja2 = caixaDeTexto.nextLine();

                System.out.println("Escreva aqui o nome do ninja 4: ");
                String nomeDoNinja3 = caixaDeTexto.nextLine();

                System.out.println("Escreva aqui o nome do ninja 5: ");
                String nomeDoNinja4 = caixaDeTexto.nextLine();

                System.out.println("Escreva aqui o nome do ninja 6: ");
                String nomeDoNinja5 = caixaDeTexto.nextLine();

                System.out.println("Escreva aqui o nome do ninja 7: ");
                String nomeDoNinja6 = caixaDeTexto.nextLine();

                System.out.println("Escreva aqui o nome do ninja 8: ");
                String nomeDoNinja7 = caixaDeTexto.nextLine();

                System.out.println("Escreva aqui o nome do ninja 9: ");
                String nomeDoNinja8 = caixaDeTexto.nextLine();

                System.out.println("Escreva aqui o nome do ninja 10: ");
                String nomeDoNinja9 = caixaDeTexto.nextLine();


                // Começar array
                String[] ninja = new String[10];
                ninja[0] = nomeDoNinja;
                ninja[1] = nomeDoNinja1;
                ninja[2] = nomeDoNinja2;
                ninja[3] = nomeDoNinja3;
                ninja[4] = nomeDoNinja4;
                ninja[5] = nomeDoNinja5;
                ninja[6] = nomeDoNinja6;
                ninja[7] = nomeDoNinja7;
                ninja[8] = nomeDoNinja8;
                ninja[9] = nomeDoNinja9;


                // Dizer o histórico de Ninjas citados
                System.out.println("Aqui está o histórico de Ninjas:");
                for (int i = 0; i < 10; i++) {
                    System.out.println(ninja[i]);
                };
                break;

            case 2:
                System.out.println("Você morreu.");
                break;

            default:
                System.out.println("Você não digitou uma resposta válida! Tente de novo.");
        }

        // Fechar o scanner
        caixaDeTexto.close();

    }
}
