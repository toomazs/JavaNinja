package Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 16;
        String missaoNinja1 = "Virar Hokage";
        char nivelDificuldadeNinja1 = 'A';
        boolean statusDeConclusaoNinja1 = true;

        String nomeCaixaAlta1 = nomeNinja1.toUpperCase();

        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 13;
        String missaoNinja2 = "Vingar de Itachi";
        char nivelDificuldadeNinja2 = 'B';
        boolean statusDeConclusaoNinja2 = false;

        String nomeCaixaAlta2 = nomeNinja2.toUpperCase();


        // Ninja 3
        String nomeNinja3 = "Pain";
        int idadeNinja3 = 18;
        String missaoNinja3 = "Atacar a Vila da Folha";
        char nivelDificuldadeNinja3 = 'C';
        boolean statusDeConclusaoNinja3 = true;

        String nomeCaixaAlta3 = nomeNinja3.toUpperCase();




        // COMPILAÇÃO AO PRIMEIRO NINJA
        System.out.println("Primeiro Ninja: " + nomeCaixaAlta1);
        System.out.println("Sua Idade é: " + idadeNinja1);
        System.out.println("A sua principal missão é: " + missaoNinja1);
        System.out.println("A dificuldade da sua missão é: " + nivelDificuldadeNinja1);
        System.out.println("É verdade que ele passou na missão?: " + statusDeConclusaoNinja1);

        System.out.println();

        // COMPILAÇÃO AO SEGUNDO NINJA
        System.out.println("Primeiro Ninja: " + nomeCaixaAlta2);
        System.out.println("Sua Idade é: " + idadeNinja2);
        System.out.println("A sua principal missão é: " + missaoNinja2);
        System.out.println("A dificuldade da sua missão é: " + nivelDificuldadeNinja2);
        System.out.println("É verdade que ele passou na missão?: " + statusDeConclusaoNinja2);

        System.out.println();

        // COMPILAÇÃO AO TERCEIRO NINJA
        System.out.println("Primeiro Ninja: " + nomeCaixaAlta3);
        System.out.println("Sua Idade é: " + idadeNinja3);
        System.out.println("A sua principal missão é: " + missaoNinja3);
        System.out.println("A dificuldade da sua missão é: " + nivelDificuldadeNinja3);
        System.out.println("É verdade que ele passou na missão?: " + statusDeConclusaoNinja3);

        System.out.println();
    }
}
