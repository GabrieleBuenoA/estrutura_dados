public class Main {

    public static void main(String[] args) {

        Gerente LMolusco = new Gerente("G01", "Lula Molusco", 2000.00);

        Funcionario BEsponja = new Funcionario("F01", "Bob Esponja", 1000.00);

        Funcionario PEstrela = new Funcionario("F02", "Patrick Estrela", 50.00);

        Funcionario GCaracol = new Funcionario("F03", "Garry Caracol", 7000.00);

        Projeto SiriCascudo = new Projeto("Siri Cascudo", LMolusco);

        SiriCascudo.adicionarFuncionario(BEsponja);
        SiriCascudo.adicionarFuncionario(PEstrela);
        SiriCascudo.adicionarFuncionario(GCaracol);

        SiriCascudo.exibirDados();

        SiriCascudo.setConcluido(true);
        SiriCascudo.exibirDados();
    }
}