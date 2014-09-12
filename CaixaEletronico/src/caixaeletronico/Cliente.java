
 
package caixaeletronico;

public class Cliente {
    String cpf, nome , endereco , data ;
    boolean spc, serasa;
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isSpc() {
        return spc;
    }

    public void setSpc(boolean spc) {
        this.spc = spc;
    }

    public boolean isSerasa() {
        return serasa;
    }

    public void setSerasa(boolean serasa) {
        this.serasa = serasa;
    }
    boolean verificaPendencias (){
        serasa = false ;
        return serasa;
    }
    boolean verificaPendencias2 (){
        spc = false ;
        return spc;
    }
    
}
