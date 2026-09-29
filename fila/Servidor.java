import java.util.Random;

public class Servidor {

    private int totalReqGeradas = 0;
    private int totalReqAtendidas = 0;
    private int totalReqPerdidas = 0;
    private Random aleatorio;
    private Fila<String> fila;
    private int numProcessadores;
    private int N;
    private int novasReq;
    //TODO: adicionar metodo relatorio

    public Servidor(Random aleatorio, int capacidadeFila, int numProcessadores, int N) {
        this.aleatorio = new Random();
        this.fila = new Fila<>(capacidadeFila);
        this.numProcessadores = numProcessadores;
        this.N = N;
        this.novasReq = 0;
    }
    
    public void executar(int ciclos) {
        for (int ciclo = 1; ciclo < ciclos; ciclo++) {
            for (int i = 0; i < numProcessadores; i++) {
                if (!fila.isEmpty()) {
                    fila.desenfileirar();
                    totalReqAtendidas++;
                }
            }
            
            if (novasReq > fila.espacoDisponivel()) {
                totalReqPerdidas += (novasReq - fila.espacoDisponivel());
                novasReq = fila.espacoDisponivel();
            }
            
            for (int j = 0; j < novasReq; j++) {
                fila.enfileirar ("Requisição " + (j+1));
            }            
            
            novasReq = aleatorio.nextInt(1, N-1);
            totalReqGeradas += novasReq;
        }
    }
}
    











    //                     if (!fila.isFull()) {
    //                         fila.enfileirar("Requisição " + (totalReqGeradas + 1));
    //                         totalReqGeradas++;
    //                     } else {
    //                         totalReqPerdidas++;
    //                     }
    //                 }             

    //             totalReqPerdidas++;
    //         }
            


    //         //simulação aqui
    //         //for pro n de pricessadoes
    //         //fila.desenfileirar();
    //         // totalReqGeradas++
    //         int novasReq = aleatorio.nextInt(1, N-1);
    //         //gerar as novasReq requisiçõies e adicionar na fila
            
    //     }

    // }






