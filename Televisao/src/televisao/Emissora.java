package televisao;
public class Emissora {
private String nome , endereco, abertafechada;    

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

    public String getAbertafechada() {
        return abertafechada;
    }

    public void setAbertafechada(String abertafechada) {
        this.abertafechada = abertafechada;
    }
     public Emissora (){
       nome = null;
       endereco =null;
       abertafechada= "tv fechada" ;
     }
}
          
         
