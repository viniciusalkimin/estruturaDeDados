package estruturasDeDados;


import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

public class ListaEncadeada<T> {

    private Nodo<T> primeiro;

    private Nodo<T> ultimo;
    @Getter
    private int tamanho;


    public void adiciona(T elemento) {
        Nodo<T> nodo = new Nodo<>(elemento);
        if (tamanho == 0) {
            this.primeiro = nodo;
        } else {
            this.ultimo.setProximoNodo((T) nodo);
        }
        this.ultimo = nodo;
        this.tamanho++;
    }

    public T espiar() {
        if (!(tamanho == 0)) {
            return this.primeiro.getElemento();
        }
        return null;
    }

    public T pegarPrimeiroElemento() {
        if (!(tamanho == 0)) {
            var primeiroRlemento = this.primeiro.getElemento();
            this.primeiro = (Nodo<T>) primeiro.getProximoNodo();
            this.tamanho--;
            return primeiroRlemento;
        }
        return null;
    }

    public void limparLista() {
        if (tamanho != 0) {
            while (tamanho > 0 ) {
                this.pegarPrimeiroElemento();
            }
            this.ultimo = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (tamanho == 0) {
            return "[ ]";
        } else {
            sb.append("[");
            Nodo<T> proximo = primeiro;
            sb.append(proximo.getElemento() + ",");
            while (!Objects.isNull(proximo.getProximoNodo())) {
                proximo = (Nodo<T>) proximo.getProximoNodo();
                if (proximo == ultimo) {
                    sb.append(proximo.getElemento());
                } else {
                    sb.append(proximo.getElemento() + ",");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
