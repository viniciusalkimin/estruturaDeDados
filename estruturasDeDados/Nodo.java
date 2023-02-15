package estruturasDeDados;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Data
public class Nodo<T> {

    private T elemento;
    @Getter
    @Setter
    private T proximoNodo;


    public Nodo(T elemento) {
        this.elemento = elemento;
        this.proximoNodo = null;
    }

    public Nodo(T elemento, T proximoNodo) {
        this.elemento = elemento;
        this.proximoNodo = proximoNodo;
    }

    public Nodo<T> proximo() {
       return (Nodo<T>) this.proximoNodo;
    }

}
