public class Vip extends Ingresso{

    public Vip() {
        setValor(getValor() * 1.25);
    }
    @Override
    public String imprimeValor(){
        return "Valor do ingresso VIP: " + getValor();
    }
}
