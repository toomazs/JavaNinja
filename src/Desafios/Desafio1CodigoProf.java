package Desafios;


public class Desafio1CodigoProf {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Encontrar o bandido";
        String statusDaMissao = "Em andamento";
        char nivelDaMissao = 'D';

        // Verificar nivel da missao e idade do ninja
        if(idade < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D') {
                statusDaMissao = "Concluida";
            } else {
                statusDaMissao = "Nao Concluida, idade não suficiente";
            }

        } else {
            statusDaMissao = "Concluida";
        }

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Status da Missao: " + statusDaMissao);
        System.out.println("Nivel da Missao: " + nivelDaMissao);

        System.out.println("--------------------------------------------");




        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 13;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        // Verificar nivel da missao e idade do ninja
        if(idade2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Concluida";
            } else {
                statusDaMissao2 = "Nao Concluida, idade não suficiente";
            }

        } else {
            statusDaMissao2 = "Concluida";
        }

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Status da Missao: " + statusDaMissao2);
        System.out.println("Nivel da Missao: " + nivelDaMissao2);

        System.out.println("--------------------------------------------");




        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 16;
        String missao3 = "Curar Feridas da guerra";
        String statusDaMissao3 = "Concluido";
        char nivelDaMissao3 = 'B';

        // Verificar nivel da missao e idade do ninja
        if(idade3 < 15) {
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusDaMissao3 = "Concluida";
            } else {
                statusDaMissao3 = "Nao Concluida, idade não suficiente";
            }

        } else {
            statusDaMissao3 = "Concluida";
        }

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Status da Missao: " + statusDaMissao3);
        System.out.println("Nivel da Missao: " + nivelDaMissao3);

        System.out.println("--------------------------------------------");
    }
}
