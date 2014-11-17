
package mc;
public class Gerente {
 private String nome, datanasc, cpf;
private double salario = 3.500;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    
    }
    public Double retSalario(){
        return salario;
        
    }
}
