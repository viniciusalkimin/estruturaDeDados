package estruturasDeDados;

public class Fila<T> {

    private T[] elementos;
    private int tamanho;
    private int tamanhoPadrao = 15;

    public Fila(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Fila() {
        this.elementos = (T[]) new Object[tamanhoPadrao];
        this.tamanho = 0;
    }

    public void enfileira(T objeto) {
        aumentaCapacidade();
        this.elementos[this.tamanho] = objeto;
        this.tamanho++;
    }

    public T espiar() {
        if (this.vazio()) {
            throw new RuntimeException("Fila está vázia");
        }
        return this.elementos[0];
    }

    public T desenfileirar() {
        if (this.vazio()) {
            throw new RuntimeException("Fila está vázia");
        }
        var elemento = this.elementos[0];
        for (int i = 0; i <= this.tamanho -1 ; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.elementos[tamanho - 1] = null;
        tamanho--;
        return elemento;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean vazio() {
        return tamanho == 0;
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
            sb.append(elementos[i] + ", ");

        }
        if (this.tamanho > 0) {
            sb.append(elementos[tamanho - 1]);
        }
        sb.append(" ]");
        return sb.toString();
    }
}
