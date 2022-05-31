package funcionarios;

public class Temporario extends Funcionario {
    private int mesesContrato;

    public Temporario(String nome, double salarioBase, int mesesContrato) {
        super(nome, salarioBase);
        this.mesesContrato = mesesContrato;
    }

    @Override
    protected double getGratificacao() {
        return this.mesesContrato * 100;
    }
}
