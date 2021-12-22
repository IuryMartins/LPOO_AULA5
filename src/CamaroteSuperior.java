public class CamaroteSuperior extends Vip{
   private String Localizacao;

    public CamaroteSuperior() {
        setValor(getValor() * 1.25);
        setLocalizacao("Camarote Superior");
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String localizacao) {
        Localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "CamaroteSuperior{" +
                ", valor=" + valor +
                '}';
    }

   // public String imprimeLocal(){
   //     return Localizacao;
  //  }


    public String ImprimeLocal(){
        return  "Você esta no camarote superior";
    }

    @Override
    public String imprimeValor(){
        return "Valor do ingresso do camarote superior: " + getValor();
    }
}
