public class Gerente extends Funcionario {

    private double bonusPorFuncionario;
    private double salarioFinalGerente;

    public Gerente(String idFuncionario, String nomeFuncionario, double salarioBase) {
        super(idFuncionario, nomeFuncionario, salarioBase);
    }

    public double bonusPorFuncionario(int numFuncionarios) {
        this.bonusPorFuncionario = getSalarioBase() * (0.01 * numFuncionarios);
        return this.bonusPorFuncionario;
    }

    public double salarioFinalGerente(int numFuncionarios) {
        this.salarioFinalGerente = getSalarioBase() + bonusPorFuncionario(numFuncionarios);
        return this.salarioFinalGerente;
    }

    public double salarioFinalGerente(int numFuncionarios, boolean projetoConcluido) {
        double bonusConclusao = 0;
        if (projetoConcluido) {
            bonusConclusao = getSalarioBase() * 0.10;
        }
        this.salarioFinalGerente =
            getSalarioBase() + bonusPorFuncionario(numFuncionarios) + bonusConclusao;
        return salarioFinalGerente;
    }
}