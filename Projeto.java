import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Projeto {

    private String nomeProjeto;
    private Gerente gerente;
    private ArrayList<Funcionario> equipe;

    private double custoTotal;
    private boolean statusConcluido;

    
    public Projeto(String nomeProjeto, Gerente gerente, Funcionario... funcionariosEquipe) {
        this.nomeProjeto = nomeProjeto;
        this.gerente = nomeGerente;

        this.equipe = new ArrayList<>();
        Collections.addAll(this.equipe, funcionariosEquipe);

        this.bonusGerente = 0;
        this.custoTotal = 0;
        this.statusConcluido = false;        
    }

    public void calcularBonusGerente{        
        this.gerente.setBonusGerente = ((this.equipe.size() * (1/100)) * this.gerente.getSalario);
    }

    

}