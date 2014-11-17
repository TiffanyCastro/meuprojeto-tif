
package mc;

public class McOferta extends Produto{
     private Hamburguer hamburguer;
     private BatataFrita batatafrita;
     private Bebida bebida;
   

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public BatataFrita getBatatafrita() {
        return batatafrita;
    }

    public void setBatatafrita(BatataFrita batatafrita) {
        this.batatafrita = batatafrita;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
 
   public String descricaoOferta(){
       String retorno;
       retorno= this.descProd() ;
       return retorno;
   }
   public Double valorEconomia(){
      Double retorno;
       retorno= (this.bebida.getPreco()+ this.batatafrita.getPreco()+ this.hamburguer.getPreco() ) - this.getPreco();
       return retorno;
   
 }    
}
