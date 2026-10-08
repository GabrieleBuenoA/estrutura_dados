public class SistemaOperacional {

    private final FilaCircular<Processo> filaProcessos;
    private final Processo[] processos;
    private static final int QUANTUM = 2;           // numero de instruções por vez.


    public SistemaOperacional() {
        filaProcessos = new FilaCircular<>(16);
        processos = new Processo[5];

        processos[0] = new Processo("Processo I", 7, 0);
        processos[1] = new Processo("Processo II", 4, 0);
        processos[2] = new Processo("Processo III", 5, 1);
        processos[3] = new Processo("Processo IV", 6, 2);
        processos[4] = new Processo("Processo V", 3, 4);
    }

    public void executar() {

        //enfileira o processo de acordo com o tempo 
        int tempo = 0;

        for (int i = 0; i < processos.length; i++) {

            if (processos[i].getTempoChegada() == tempo) { 
                filaProcessos.enfileirar(processos[i]); 
                System.out.println("Tempo " + tempo + ": " + processos[i].getNome() + " chegou e entrou na fila."); 
            }
        }

        //dedenfileira o processo da vez e executa pelo quantum
        while (!filaProcessos.isEmpty()) {
            Processo processo = filaProcessos.desenfileirar();
            processo.setStatus(Status.EXECUTANDO);

            try {
                System.out.println(processo.getNome() + " executando...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int instrucoesExecutadas = (processo.getInstrucoesRestantes() < QUANTUM) ? processo.getInstrucoesRestantes() : QUANTUM;

            processo.setInstrucoesRestantes(processo.getInstrucoesRestantes() - instrucoesExecutadas);
  
            System.out.println("Tempo " + tempo + ": " + processo.getNome() + " executou " + instrucoesExecutadas + " instrucoes. Restam " + processo.getInstrucoesRestantes());
            

        //organiza o status do processo 
            if (processo.getInstrucoesRestantes() == 0) { 
                processo.setStatus(Status.TERMINADO); 
                System.out.println("Tempo " + tempo + ": " + processo.getNome() + " terminou!");
            } else {
                processo.setStatus(Status.PRONTO);
                filaProcessos.enfileirar(processo);
                System.out.println("Tempo " + tempo + ": " + processo.getNome() + " voltou para o fim da fila.");
            }

            tempo++;

            for (int i = 0; i < processos.length; i++) { 
                if (processos[i].getTempoChegada() == tempo && processos[i].getStatus() == Status.PRONTO) {
                    filaProcessos.enfileirar(processos[i]); 
                    System.out.println("Tempo " + tempo + ": " + processos[i].getNome() + " chegou e entrou na fila."); 
                }
            }
        }

        System.out.println("Simulacao concluida.");
    }

    public static void main(String[] args) {
        SistemaOperacional sistema = new SistemaOperacional();
        sistema.executar();
    }
}
