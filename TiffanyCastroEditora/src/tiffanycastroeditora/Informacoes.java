
package tiffanycastroeditora;
public class Informacoes {
    private String titulo, anopubli, nomeautor , tiragem  ;
    private double exemplares, ganhos , preco , ganhoaut;
    boolean importado ;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnopubli() {
        return anopubli;
    }

    public void setAnopubli(String anopubli) {
        this.anopubli = anopubli;
    }

    public String getNomeautor() {
        return nomeautor;
    }

    public void setNomeautor(String nomeautor) {
        this.nomeautor = nomeautor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double  preco) {
        this.preco = preco;
    }

    public String getTiragem() {
        return tiragem;
    }

    public void setTiragem(String tiragem) {
        this.tiragem = tiragem;
    }

    public double  getExemplares() {
        return exemplares;
    }

    public void setExemplares(double exemplares) {
        this.exemplares = exemplares;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }
    public String Sucesso (){
       
        if (exemplares < 30.000 ){
            return "FRACASSO";
        }else if (exemplares >= 30.000 && exemplares <= 40.000 ){
            return "REGULAR";
        }else 
            return "SUCESSO";
    }
    public double Renda (){
        ganhos = exemplares * preco ;
        return ganhos ;
    }
    public double ganhoAutor (){
        if (importado == true ){
            ganhoaut = ganhos * 0.25 ;
            
            return ganhoaut ;
        } else 
            ganhoaut = ganhos * 0.20 ;
       
        return ganhoaut;
        }
    
    }
