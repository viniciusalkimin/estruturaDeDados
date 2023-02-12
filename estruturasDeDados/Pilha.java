package estruturasDeDados;

import java.util.EmptyStackException;

public class Pilha<T> {

    private T[] elementos;
    private int capadicade;
    private int tamanho;
    private int tamanhoPadrão = 15;

    public Pilha() {
        this.elementos = (T[]) new Object[tamanhoPadrão];
        this.tamanho = 0;
    }

    public Pilha(int capadicade) {
        this.elementos = (T[]) new Object[capadicade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void empilhar(T objeto) {
        aumentaCapacidade();
        elementos[tamanho] = objeto;
        tamanho++;
    }

    public boolean vazio() {
        return tamanho == 0;
    }

    public T topo() {
        if(this.vazio())
            throw new EmptyStackException();
        return this.elementos[tamanho-1];
    }

    public T desempilhar() {
        if(this.vazio())
            throw new EmptyStackException();
        var elemento = this.elementos[tamanho-1];
        this.elementos[tamanho-1] = null;
        tamanho--;
        return elemento;
    }

    public void aumentaCapacidade() {
        if (tamanho == this.elementos.length) {
            T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                novosElementos[i] = this.elementos[i];
            }
            this.elementos = novosElementos;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(elementos[i]).append(", ");

        }
        if (this.tamanho > 0) {
            sb.append(elementos[tamanho - 1]);
        }
        sb.append(" ]");
        return sb.toString();
    }

}
