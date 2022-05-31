package funcionarios;


public class Funcionario implements imprimir {
    protected double salarioBase;
    protected String nome;

    public Funcionario(String nome, double salarioBase) {
        this.salarioBase = salarioBase;
        this.nome = nome;
    }

    public double getSalario() {
        return salarioBase + getGratificacao();
    }

    protected double getGratificacao() {
        return 0;
    }

    @Override
    public void imprimir() {
        System.out.println(this.nome + ", salario de R$ " + getSalario());
    }

}
