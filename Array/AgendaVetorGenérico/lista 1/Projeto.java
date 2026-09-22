import java.util.ArrayList;

public class Projeto {

    private String nomeProjeto;
    private Gerente gerente;
    private ArrayList<Funcionario> equipe;
    private double custoTotal;
    private boolean statusConcluido;

    public Projeto(String nomeProjeto, Gerente gerente) {
        this.nomeProjeto = nomeProjeto;
        this.gerente = gerente;
        this.equipe = new ArrayList<>();
        this.custoTotal = 0;
        this.statusConcluido = false;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        equipe.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        equipe.remove(funcionario);
    }

    public void setConcluido(boolean concluido) {
        this.statusConcluido = concluido;
    }

    public boolean isConcluido() {
        return statusConcluido;
    }

    public double calcularCustoTotal() {
        custoTotal = gerente.salarioFinalGerente(equipe.size(), statusConcluido);
        for (Funcionario funcionario : equipe) {
            custoTotal += funcionario.getSalarioFinal();
        }
        return custoTotal;
    }

    public void exibirDados() {
        System.out.println("Projeto: " + nomeProjeto);
        double salarioGerente = gerente.salarioFinalGerente(equipe.size(), statusConcluido);
        System.out.println("Gerente: "
                + gerente.getNomeFuncionario()
                + " - Salário final: R$ "
                + String.format("%.2f", salarioGerente)
        );
        System.out.println("Equipe:");
        if (equipe.isEmpty()) {
            System.out.println(" - Nenhum funcionário associado.");
        } else {
            for (Funcionario funcionario : equipe) {
                System.out.println(
                        " - "
                        + funcionario.getNomeFuncionario()
                        + " - R$ "
                        + String.format("%.2f",
                                funcionario.getSalarioFinal())
                );
            }
        }
        System.out.println("Custo total do projeto: R$ "
        + String.format("%.2f", calcularCustoTotal())
    );
    }
}