
package mc;
public class Produto {
 private String nome,codigo;
 private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
     public String descProd (){
         String retorno;
         retorno=  this.nome + "," + this.preco + ", " + this.codigo;
        return retorno;
     }
 
}
