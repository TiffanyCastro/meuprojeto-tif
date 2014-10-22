

package televisao;

public class Ator {

   private String nome , datanascimento, quantidadedenovela , email , nomeartistico,  cidade, endereco, bairro ,estado;
   private Double  salariomensal , cacheeve;
    double ganhoeve , qevento, ganhototal;
    public Ator (){
        nome = null;
        datanascimento = null;
        quantidadedenovela = null;
        email= null;
        nomeartistico= null;
        cidade= null;
        endereco= null;
        bairro= null;
        estado = null;
        salariomensal= 0.0 ;
        cacheeve= 0.0;
    }
    public Double getSalariomensal() {
        return salariomensal;
    }

    public void setSalariomensal(double salariomensal) {
        this.salariomensal = salariomensal;
    }

    public double  getCacheeve() {
        return cacheeve;
    }

    public void setCacheeve(double cacheeve) {
        this.cacheeve = cacheeve;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getQuantidadedenovela() {
        return quantidadedenovela;
    }

    public void setQuantidadedenovela(String quantidadedenovela) {
        this.quantidadedenovela = quantidadedenovela;
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
    public String obterStatus(){
        if (Double.parseDouble (quantidadedenovela) < 3 && (salariomensal) < 5.000){
            return "Calouro";
        }else if (Double.parseDouble(quantidadedenovela) > 3 && Double.parseDouble(quantidadedenovela) < 6 ){
           return "revelaçao"; 
        }else if (Double.parseDouble(quantidadedenovela) == 6 &&  (salariomensal) > 30.000){
         return "joia ";    
        } else if (Double.parseDouble (quantidadedenovela) > 9 && (salariomensal)< 30.000){
            return "elenco de apoio";
        }else if ((salariomensal) > 30.000 && (salariomensal) < 100.000){
            return " elenco principal ";
        }else if ( (salariomensal) > 1000.000){
            return "estrela";
    }else 
            return "elenco regular";
        }
        public double calcularGanhos (){  
        
        ganhototal=  (qevento * cacheeve) +  salariomensal;
        return ganhototal ;
    }
}