
package mc;
public class Caixa {
     private String nome , datanasc, cpf, horatrab;
private double salario = 1.200;
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

    public String getHoratrab() {
        return horatrab;
    }

    public void setHoratrab(String horatrab) {
        this.horatrab = horatrab;
    }
     public double retSalario(){
         return salario;
     }
     
}
