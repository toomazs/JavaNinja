package TiposDeDados;


public class DadosNaoPrimitivos {
    public static void main(String[] args) {
    // Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java

        /*
        * Dados nao primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja, e atribuir metodos a ele.
        */

        String nome =  "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); // ToUppercase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto está em CAPS LOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto está normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase();
        System.out.println("Este texto está em CAIXA BAIXA: " + aldeiaEmCaixaBaixa);


    }
}
