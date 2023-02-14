package exercicios;

import estruturasDeDados.Pilha;
import estruturasDeDados.Vetor;

import java.util.Scanner;

public class ExEmpilhaDesempilha {

    public static void main(String[] args) throws Exception {


//        System.out.println(pilha);
//        System.out.println("TAMANHO DA PILHA:" + pilha.tamanho());
//
//        System.out.println(pilha.desempilhar());
//        System.out.println(pilha.tamanho());

        Scanner sc = new Scanner(System.in);

        Vetor<Integer> numeros = new Vetor<>();
        Pilha<Integer> pilha = new Pilha<>();
        int numeroDigitado;
        System.out.println("Digite 10 numero inteiros;");
        for (int i = 0; i < 10; i++) {
            numeroDigitado = sc.nextInt();
            if((numeroDigitado % 2)==0){
                pilha.empilhar(numeroDigitado);
            } else {
                if(pilha.vazio()) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Desempilhando: " + pilha.desempilhar());
                }
            }
        }

        if(!pilha.vazio()) {
            while (!pilha.vazio()) {
                System.out.println("Desempilhando mais um numero: " + pilha.desempilhar());
            }
        }



        sc.close();


    }
}
