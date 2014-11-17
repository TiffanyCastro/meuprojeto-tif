
package mc;
public class BatataFrita extends Produto {
 private String tamanho;    

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String descBatata(){
       String retorno;
       retorno= this.descProd()+ "," + this.tamanho;
       return retorno;
    }
}
