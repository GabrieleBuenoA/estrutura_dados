package atv_AgendaTelefonica;


public class Agenda {

private Contato[] agenda;
private final int TAMANHO;

public Agenda(int tamanho) {
    this.TAMANHO = tamanho;
    this.agenda = new Contato[tamanho];
}


public boolean verificarNomeLivre(String nome) {
    for (Contato contato : agenda) {
        if (nome.equals(contato.getNome())) {
            System.out.printf("Contato já registrado");
            return false;
        }
    }
    return true;
}


public boolean verificarTelefoneLivre(String telefone) {
    for (Contato contato : agenda) {
        if (telefone.equals(contato.getTelefone())){
            System.out.printf("Número já registrado");
            return false;
        }
    }
    return true;
}


public int getPosição(Contato contato){
    if (!verificarNomeLivre(contato.getNome()) || !verificarTelefoneLivre(contato.getTelefone())) {
        for (int i = 0; i < TAMANHO; i++) {
            if (agenda[i] != null && agenda[i].getNome().equals(contato.getNome()) || agenda[i].getTelefone().equals(contato.getTelefone())) {
            return i;
            }
        }
    }
    return -1;
}


public void adicionarContato(Contato contato) {
    if (!verificarNomeLivre(contato.getNome())){ 
        System.out.println("Nome de contato já registrado. Não é possível adicionar.");
        return;
    } 
    else if (!verificarTelefoneLivre(contato.getTelefone())){
        System.out.println("Número já associado. Não é possível adicionar.");
    } 
    else if (verificarNomeLivre((contato.getNome())) && verificarTelefoneLivre(contato.getTelefone())) {
        for (int i = 0; i < TAMANHO; i++) {
            if (agenda[i] == null) {
                agenda[i] = contato;
                System.out.println("Contato adicionado com sucesso.");
                return;
            }
        }
    }
    else{
        System.out.println("Agenda cheia. Não é possível adicionar mais contatos.");
    }    
}


public void removerContato(Contato nomeContato) {
    if (!verificarNomeLivre(nomeContato.getNome())) {
        for (int i = 0; i < TAMANHO; i++) {
            if (agenda[i] != null && agenda[i].getNome().equals(nomeContato.getNome())) {
                agenda[i] = null;
                System.out.println("Contato removido com sucesso.");
                return;
            }
        } 
    } else {
        System.out.println("Contato não encontrado.");
    }
}


public void atualizarContato(Contato contato, String novoNome, String novoTelefone, String novoEmail) {

    int indice = getPosição(contato);
    if (indice == -1) {
        System.out.println("Contato não encontrado.");
        return;
    }
    if (!novoNome.equals(contato.getNome()) && !verificarNomeLivre(novoNome)) {
        System.out.println("Nome já está sendo utilizado.");
        return;
    }
    contato.setNome(novoNome);
    contato.setTelefone(novoTelefone);
    contato.setEmail(novoEmail);

    System.out.println("Contato atualizado com sucesso.");
}








}





