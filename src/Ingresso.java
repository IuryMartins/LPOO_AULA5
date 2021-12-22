public abstract class Ingresso {
double valor;

    public Ingresso() {
        setValor(250);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "valor=" + valor +
                '}';
    }

    public abstract String imprimeValor();
}
