
package mc;

public class Cozinheiro {
    private String nome, datanasc, cpf;
    private boolean turno;
private double salario = 1.300;

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

    public boolean getTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    public double retSalario(){
        if (turno= true ){
            return salario + 400.00;
        }else 
        return salario;
    }
    
}
