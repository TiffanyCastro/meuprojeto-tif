
package tiffanyeletrodomesticos;

import java.util.List;

public class Lojas {
  private String lojas;
     List <Produto> produtinhos ;    

    public String getLojas() {
        return lojas;
    }

    public void setLojas(String lojas) {
        this.lojas = lojas;
    }

    public List<Produto> getProdutinhos() {
        return produtinhos;
    }

    public void setProdutinhos(List<Produto> produtinhos) {
        this.produtinhos = produtinhos;
    }
     public String retornarProdutos(){
        String retorno;
        
        retorno=  " Loja : " + lojas + "\n" + " Produtos  : " + "\n" ;
         for (Produto produto : produtinhos) {
            retorno = retorno + produto.retornarInformacoes() + "\n";
                   
        }
        return retorno;
        
}
}