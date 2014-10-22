package televisao;
public class Apresentador {
private String nome , datadenascimento, programa, email, nomeartistico , cidade, endereco, bairro , estado;    
private double ganhos , qevento , ganhototal, salariomensal,cache,  merchan;
public Apresentador (){
    nome = null; 
    datadenascimento = null;
    programa= null;
    email= null;
    nomeartistico= null;
    salariomensal= 0.0;
    cache= 0.0;
    merchan= 0.0;
    cidade= null;
    endereco=null;
    bairro = null;
    estado = null;
    
}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeartistico() {
        return nomeartistico;
    }

    public void setNomeartistico(String nomeartistico) {
        this.nomeartistico = nomeartistico;
    }

    public double getSalariomensal() {
        return salariomensal;
    }

    public void setSalariomensal(double salariomensal) {
        this.salariomensal = salariomensal;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public double getMerchan() {
        return merchan;
    }

    public void setMerchan(double merchan) {
        this.merchan = merchan;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   public double apreGanhos (){
      ganhos = qevento * cache;
      ganhototal= (ganhos + salariomensal) + merchan ;
      return ganhototal;
   }

   
}
