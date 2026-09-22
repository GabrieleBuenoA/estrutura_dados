package eh.VetorObjeto;
public class Vetor<T> {

    private T[] elementos;
    private int tamanho;


    @SuppressWarnings("unchecked")
    public Vetor(int quantidade){
        elementos = (T[]) new Object[quantidade];
        tamanho = 0;
        
    }

    public void inserir(String elemento) {
        if (tamanho == elemento.length()) {
            expandir ();
        } else {
        elementos[tamanho] = elemento;
        tamanho++;
        }
    }

    private void expandir() {
        String[] novo = new String[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }
        this.elementos = novo;
    }
      
    private void reduzir() {
        
        if (tamanho <= elementos.length/4) { ///quando diminuir
            T[] novo = (T[]) new String[elementos.length/2]; //quanto diminuir
            for (int i = 0; i < elementos.length; i++) {
                novo[i] = elementos[i];
        }
        elementos = novo;
        }   
    }

    public void remover (int indice) {
        if (indice < 0 || indice >= tamanho){
            System.out.println("Indice inválido");
            return;
        }
        for (int i = indice; i < tamanho; i++){
            elementos[i] = elementos[i+1];
        }

        elementos[tamanho-1] = null;
        tamanho--;
        reduzir();
    }
    