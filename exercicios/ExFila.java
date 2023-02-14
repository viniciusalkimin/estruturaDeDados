package exercicios;

import estruturasDeDados.Fila;

public class ExFila {
    public static void main(String[] args) {

        Fila<String> fila = new Fila<>();
        fila.enfileira("Vinicius");
        fila.enfileira("Davi");
        fila.enfileira("Sara");
        System.out.println(fila);
        System.out.println(fila.tamanho());

        System.out.println(fila.espiar());
        fila.desenfileirar();
        System.out.println(fila);
    }
}
