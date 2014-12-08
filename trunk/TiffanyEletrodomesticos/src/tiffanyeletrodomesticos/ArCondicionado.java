
package tiffanyeletrodomesticos;

public class ArCondicionado extends Produto {
    private double btu;
     private boolean painel ;

    public boolean isPainel() {
        return painel;
    }

    public void setPainel(boolean painel) {
        this.painel = painel;
    }

    public double  getBtu() {
        return btu;
    }

    public void setBtu(double btu) {
        this.btu = btu;
    }
    public String Painel (){
        String retorno;
     if (painel == true )
     {
         retorno = "sim ";
     }
     else 
     {
         retorno ="nao ";
     }
     return retorno ;
    }
    
     
     
     public String retornarInformacoes() {
        String retorno;
        retorno =super.retornarInformacoes() + this.btu;
        return retorno;
    }
     public double precoFinal (){
         double  retorno;
         double desconto = 200.00;
         if (btu < 9000 )
         {
             retorno = this.getPreco() - desconto ;
         }
         else 
         {
             retorno = this.getPreco();
         }
         return retorno;
     }
}

