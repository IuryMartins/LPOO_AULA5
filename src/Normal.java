public class Normal extends Ingresso {

    public Normal() {
    }

    public String ImprimeTipoIngresso() {
        return "Ingresso Normal";
    }

    @Override
    public String imprimeValor() {
        return "Valor do ingresso: " + getValor();
    }
}
