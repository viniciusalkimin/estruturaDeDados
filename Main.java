import estruturasDeDados.Pilha;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>(20);

        for (int i = 1; i < 11; i++) {
            pilha.empilhar(i);

        }
        System.out.println(pilha);
        System.out.println("TAMANHO DA PILHA:" + pilha.tamanho());

        System.out.println(pilha.desempilhar());
        System.out.println(pilha.tamanho());

    }
}
