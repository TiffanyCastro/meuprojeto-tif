package mc;
public class Bebida extends Produto{
  private String quantidade, unidade;   

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    public String descBebida (){
        String retorno;
        retorno = this.descProd()+ "," + this.quantidade + "," + this.unidade;
        return retorno;
    }
}
