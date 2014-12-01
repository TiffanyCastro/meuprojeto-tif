
package sheldon;
public class Heroi extends Bonecos {
  private String alterego;
  private boolean preferido;
    public String getAlterego() {
        return alterego;
    }

    public void setAlterego(String alterego) {
        this.alterego = alterego;
    }

    public boolean isPreferido() {
        return preferido;
    }

    public void setPreferido(boolean preferido) {
        this.preferido = preferido;
    }

        public String retornarInformaçoes() {
        String retorno;
      if (preferido == true){
          retorno = super.retornarInformaçoes() + "\n"+ this.getNome ()+  "Bazingaaaaa";
        }
      else 
      {
          retorno = super.retornarInformaçoes();
      }
       return retorno;
}
}
