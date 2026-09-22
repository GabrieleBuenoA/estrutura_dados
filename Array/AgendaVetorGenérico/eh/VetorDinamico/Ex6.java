package eh.VetorDinamico;

public class Ex6 {

    static void main() {
        
        VetorDinamico vetor = new VetorDinamico(2);

        vetor.inserir("Ana1");
        vetor.inserir("Ana2");
        vetor.imprimir();

        vetor.inserir("Ana3");
        vetor.inserir("Ana4");

        vetor.imprimir();

        vetor.inserir("Ana5");
        vetor.inserir("Ana6");
        vetor.inserir("Ana7");
        vetor.inserir("Ana8");
        vetor.imprimir();


        vetor.remover(1);
        vetor.remover(2);
        vetor.remover(3);
        vetor.remover(4);
        vetor.remover(5);
        vetor.remover(6);
        vetor.imprimir();


    }
}