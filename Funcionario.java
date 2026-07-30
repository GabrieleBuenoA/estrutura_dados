public class Funcionario {

    private String idFuncionario;
    private String nomeFuncionario;
    private double salarioBase;
    private int projetosConcluidos;
    private double salarioFinal;

    public Funcionario(String idFuncionario, String nomeFuncionario, double salarioBase) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioBase = salarioBase;
        this.salarioFinal = salarioBase;
        this.projetosConcluidos = 0;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal() {
        salarioFinal = salarioBase + ((projetosConcluidos * 0.10) * salarioBase);
    }

    public void incrementarProjetosConcluidos() {
        projetosConcluidos++;
        setSalarioFinal();
    }

    @Override
    public String toString() {
        return "Nome: " + nomeFuncionario + 
        "Salário Base: R$ " + String.format("%.2f", salarioBase) + 
        "Bônus de Projetos: " + ((projetosConcluidos * 0.10) * salarioBase) + 
        "Salário Final: R$ " + String.format("%.2f", salarioFinal);
    }

}