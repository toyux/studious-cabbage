package veiculos;

public class Onibus extends Veiculo {
    private int passageiros;
    private boolean articulado;

    public Onibus(String marca, String motor, boolean articulado, int passageiros) {
        super(marca, motor);
        this.articulado = articulado;
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public boolean isArticulado() {
        return articulado;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + ", Articulado: " + (isArticulado() ? "sim" : "nao") + ", Passageiros: " + getPassageiros();
    }
}
