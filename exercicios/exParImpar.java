package exercicios;

import estruturasDeDados.Pilha;

import java.util.Scanner;

public class exParImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("digite um numero");
            Integer numeroDigitado = sc.nextInt();
            if (numeroDigitado == 0) {
                if (!par.vazio()) {
                    par.desempilhar();
                } else {
                    System.out.println("Pilha par está vazia");
                }
                if (!impar.vazio()) {
                    impar.desempilhar();
                } else {
                    System.out.println("Pilha impar está vazia");
                }
            } else if ((numeroDigitado % 2) == 0) {
                par.empilhar(numeroDigitado);
            } else {
                impar.empilhar(numeroDigitado);
            }
        }

        if (!par.vazio()) {
            while (!par.vazio()) {
                System.out.println("Desepilhando pilha par:" + par.desempilhar());
            }
        }
        if (!impar.vazio()) {
            while (!impar.vazio()) {
                System.out.println("Desepilhando pilha impar:" + impar.desempilhar());
            }
        }


        sc.close();
    }
}
