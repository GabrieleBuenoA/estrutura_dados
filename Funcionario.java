public class Funcionário {

    private String idFuncionario;
    private String nomeFuncionario;
    private double salario;
    private double bonusProjeto;


    public Funcionario(String idFuncionario, String nomeFuncionario, double salario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;
        this.bonusProjeto = 0;
    }

    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }
    
    public double getSalario(){
        return salario;
    }

    public void setbonusProjetos(double bonusProjeto){
        this.bonusProjeto = bonusProjeto;
    }
    
    public double bonusProjetos(){
        return bonusProjeto;
    }





}