public interface Gerente extends Funcionario {

    private double bonusGerente;


    public void setBonusGerente(double bonusGerente){
        this.bonusGerente = bonusGerente;
    }
    
    public double getBonusGerente(){
        return bonusGerente;

    
}