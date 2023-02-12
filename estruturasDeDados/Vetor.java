package estruturasDeDados;

public class Vetor<T> {

    private T[] elementos;
    private int tamanho;
    private final int tamanhoPadrao = 50;

    public Vetor() {
        this.elementos = (T[]) new Object[tamanhoPadrao];
        this.tamanho = 0;
    }

    public Vetor(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

/*    public Vetor(Class<T> tipoClasse, int capacidade) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }*/

    public int tamanho() {
        return this.tamanho;
    }

    public void adiciona(T objeto) throws Exception {
        this.aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = objeto;
            tamanho++;
        } else {
            throw new Exception("VETOR TA LOTADÃO!");
        }
    }

    public void adiciona(T elemento, int posicao) {
        this.aumentaCapacidade();
        if (!(posicao > 0 && posicao < this.tamanho)) {
            throw new IndexOutOfBoundsException("Posicao não existe");
        }
        for (int i = this.tamanho; i > posicao; i--) {
            this.elementos[i] = elementos[i - 1];
        }
        tamanho++;
        elementos[posicao] = elemento;
    }

    public int espacosLivres() {
        int count = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                count++;
            }
        }
        return count;
    }

    public T trazUm(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("NAO EXISTE ISSO AI");
        }
        return this.elementos[posicao];
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

    public void alterarElementoDaPosicao(T objeto, int posicao) {
        if (!(posicao > 0 && posicao < tamanho)) {
            throw new IndexOutOfBoundsException("Posicao não existe");
        }
        elementos[posicao] = objeto;
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

    public void remover(int posicao) {
        if (!(posicao > 0 && posicao < this.tamanho)) {
            throw new IndexOutOfBoundsException("Posicao não existe");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.elementos[tamanho - 1] = null;
        tamanho--;
    }

    public void remover(T objeto) {
        for (int i = 0; i < this.tamanho; i++) {
            if (elementos[i].equals(objeto)) {
                for (int it = i; it < this.tamanho - 1; it++) {
                    this.elementos[it] = this.elementos[it + 1];
                }
                this.elementos[tamanho - 1] = null;
                tamanho--;
                break;
            }
        }
    }

    public boolean contem(T objeto) {
        boolean contemObjeto = false;
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(objeto)) {
                contemObjeto = true;
            }
        }
        return contemObjeto;
    }

    public int ultimoIndice(T objeto) {
        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(objeto)) {
                return i;
            }
        }
        return -1;
    }

    public void removerTodos() {
        for(int i = 0; i< this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    public void removerTodos1() {
        this.elementos = (T[]) new Object[this.tamanho];
        this.tamanho = 0;
    }
}

/*    public boolean temElemento(String elemento) {
        boolean valorRetorno = false;
        for(int i = 0; i < tamanho; i++) {
            if(elemento.equals(elementos[i])){
                valorRetorno = true;
            }
        }
        return valorRetorno;
    }

    public void adiciona(T elemento) {
        for(int i=0; i<elementos.length; i++) {
            if(elementos[i] == null) {
                elementos[i] = elemento;
                break;
            }
        }
    }
*/