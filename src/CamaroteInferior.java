public class CamaroteInferior extends Vip {
    private String Localizacao;

    public CamaroteInferior() {
        setValor(getValor());
        setLocalizacao("Camarote Inferior");
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String localizacao) {
        Localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "CamaroteInferior{" +
                ", valor=" + valor +
                '}';
    }

    //public String imprimeLocal(){
      //  return Localizacao;
    //}

    public String ImprimeLocal(){
        return  "Você esta no camarote inferior";
    }
}
