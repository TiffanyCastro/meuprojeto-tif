package revisao;
public class Professor {
String nome, endereco, escola;
    double salario;
    boolean aulatec , aulasup;
    

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public boolean isAulartec() {
        return aulatec;
    }

    public void setAulartec(boolean aulartec) {
        this.aulatec = aulartec;
    }

    public boolean isAluasup() {
        return aulasup;
    }

    public void setAluasup(boolean aluasup) {
        this.aulasup = aluasup;
    }    
}
