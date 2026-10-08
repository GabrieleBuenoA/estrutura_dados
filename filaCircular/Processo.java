class Processo implements Comparable<Processo> {
    private String nome;
    private int instrucoesRestantes;    // quantidade de instruções que o processo precisa executar
    private int tempoChegada;           // momento em que o processo entra na fila
    private Status status;              // PRONTO, EXECUTANDO, TERMINADO

    public Processo(String nome, int instrucoesRestantes, int tempoChegada) {
        this.nome = nome;
        this.instrucoesRestantes = instrucoesRestantes;
        this.tempoChegada = tempoChegada;
        this.status = Status.PRONTO;
    }

    public String getNome() {
        return nome;
    }

    public int getInstrucoesRestantes() {
        return instrucoesRestantes;
    }

    public void setInstrucoesRestantes(int instrucoesRestantes) {
        this.instrucoesRestantes = instrucoesRestantes;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int compareTo(Processo qualquer) {
        return this.nome.compareTo(qualquer.nome);
    }
}