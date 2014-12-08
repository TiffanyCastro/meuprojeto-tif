
package tiffanyeletrodomesticos;

class Produto {
    private String marca;
boolean disponibilidade;
 private double preco;
 
    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String retornarInformacoes() {
        String retorno;
        retorno = this.getMarca() + " - "  + this.getPreco();
        return retorno;
   
        
    }
}
