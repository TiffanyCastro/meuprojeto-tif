
package sheldon;
public class Vilão extends Bonecos {
    private String arquiinimigo;

    public String getArquiinimigo() {
        return arquiinimigo;
    }

    public void setArquiinimigo(String arquiinimigo) {
        this.arquiinimigo = arquiinimigo;
    }
 
    public String retornarInformaçoes(){
        String retorno;
        retorno= this.getNome()+ "-" + "Arqui-inimigo :" + this.arquiinimigo + "-" + this.getEditora();
        return retorno ;
    }
    
}
