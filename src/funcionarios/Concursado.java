package funcionarios;

public class Concursado extends Funcionario {
    private int anosTrabalho;

    public Concursado(String nome, double salarioBase, int anosTrabalho) {
        super(nome, salarioBase);
        this.anosTrabalho = anosTrabalho;
    }

    @Override
    protected double getGratificacao() {
        return 0.02*(this.anosTrabalho/5)*this.salarioBase;
    }
}