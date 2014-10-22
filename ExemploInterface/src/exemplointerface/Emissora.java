package exemplointerface ;
public class Emissora {
private String nome , endereco;
       boolean abertafechada;    

    public boolean isAbertafechada() {
        return abertafechada;
    }

    public void setAbertafechada(boolean abertafechada) {
        this.abertafechada = abertafechada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

 
     public Emissora (){
       nome = null;
       endereco =null;
       abertafechada= false ;
     }
}
          
         
