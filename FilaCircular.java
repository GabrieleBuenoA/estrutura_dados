
public class FilaCircular<T extends Comparable<T>> {

    private T[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaCircular(int capacidade) {
        this.elementos = (T[]) new Comparable[capacidade];
        this.tamanho = 0;
        this.fim = -1;
        this.inicio = 0;

    }

    public void enfileirar(T elemento) {
        if (tamanho == elementos.length) {
            throw  new RuntimeException("Fila cheia");
        }

        fim = (fim + 1) % elements.length;
        elemento[fim] = elemento;
        tamanho++;
    }


    public T desenfileirar() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        T valor = elementos[inicio]
        elementos[inicio] = null;

        //N PRECISA DESLOCAR!

        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return valor; 
    }
        
    public void imprimir(){
        for (int i = 0; i < tamanho; i++){
            int indice = (inicio + 1) % elementos.length;
            System.out.print(elementos[indice] + " ");
        }
        System.out.println();
    }







    public boolean isFull() {
        return tamanho == elementos.length;
    }

    public int tamanho() {
        return tamanho;
    }

    public int espacoDisponivel() {
        return elementos.length - tamanho;
    }    


    public boolean isEmpty() {
        return tamanho==0;
    }


    public T frente() {
        if (isEmpty()) {
            throw  new RuntimeException("Fila vazia");
        }
        return elementos[0];
    }

    public void imprimir() {
        if (isEmpty()) {
            System.out.println("Fila Vazia!");
        } else {
            System.out.println("Fila: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }




}
