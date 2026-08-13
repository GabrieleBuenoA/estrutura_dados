package eh.atv_array;
public class ex3{
    public static void main() {
        VetorEstatico vetor = new VetorEstatico(10);

        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");
        vetor.inserir("E");
        vetor.inserir("F");

        vetor.imprimir();

        vetor.remover(2);
        vetor.remover(5);

        vetor.imprimir();
    }
}
