package eh.VetorObjeto;
public class VetorObjeto {
    
    private Object[] elementos;
    private int tamanho;

    public VetorObjeto(int capacidade){
        elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void inserir(Object elemento){
        if (tamanho == elemento.lenght){
            System.out.print("Cheio");
            return
        }
        elementos(tamanho) = elemento;
        tamanho++;

        public Object ler(int indice){
            return elementos[indice];
        }
    }


}
