package atv_AgendaTelefonica;


public class Agenda {

private Contato[] agenda;
private final int TAMANHO;

public Agenda(int tamanho) {
    this.TAMANHO = tamanho;
    this.agenda = new Contato[tamanho];
}

public boolean verificarNome(String nome) {
    for (Contato contato : agenda) {
        if (nome.equals(contato.getNome())) {
            System.out.printf("Contato já registrado");
            return false;
        } else {
            return true;
        }
    }
}

public boolean verificarTelefone(String telefone) {
    for (Contato contato : agenda) {
        if (telefone.equals(contato.getTelefone())){
            System.out.printf("Número já registrado");
            return false;
        } else {
            return true;
        }
    }
}

public void adicionarContato(Contato contato) {
    for (int i = 0; i < TAMANHO; i++) {
        if (agenda[i] == null) {
            agenda[i] = contato;
            return;
        }
    }
    System.out.println("Agenda cheia. Não é possível adicionar mais contatos.");
}


















}





