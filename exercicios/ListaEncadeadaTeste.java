package exercicios;

import estruturasDeDados.ListaEncadeada;

public class ListaEncadeadaTeste {

    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();


        //System.out.println(listaEncadeada);
        listaEncadeada.adiciona(1);
        listaEncadeada.adiciona(2);
        listaEncadeada.adiciona(3);
        listaEncadeada.adiciona(4);

//
//        System.out.println(listaEncadeada);
//        System.out.println(listaEncadeada.getTamanho());
//
//        System.out.println(listaEncadeada.espiar());
        //listaEncadeada.percorrerLista();
        System.out.println(listaEncadeada);

        System.out.println(listaEncadeada.pegarPrimeiroElemento());
        System.out.println(listaEncadeada);

        listaEncadeada.limparLista();
        System.out.println(listaEncadeada);
    }
}
