public class Main {
    public static void main(String[] args) {
        Vip v = new Vip();
        CamaroteInferior ci = new CamaroteInferior();
        CamaroteSuperior cs = new CamaroteSuperior();
        Normal n = new Normal();

        System.out.println(n.imprimeValor());
        System.out.println(v.imprimeValor());
        System.out.println(ci.ImprimeLocal());
        System.out.println(cs.ImprimeLocal());
        System.out.println(cs.imprimeValor());


    }
}
