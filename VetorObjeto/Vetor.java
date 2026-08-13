public class Vetor<T> {

    private T[] elementos;
    private int tamanho;


    @SuppressWarnings("unchecked")
    public Vetor(int quantidade){
        elementos = (T[]) new Object[quantidade];
        tamanho = 0;
        

    }
    
}
