
package mc;
public class Hamburguer extends Produto {
 private boolean novo;    

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }
    public String descHamb(){
        String retorno , nv;
        if (this.novo== true){
            nv= "sim";
        }else{
            nv ="nao"; 
        }
        retorno=  this.descProd()+ nv;
        return retorno;
    }
}
