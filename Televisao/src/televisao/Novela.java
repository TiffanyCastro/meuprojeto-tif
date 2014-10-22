
package televisao;
public class Novela {
private String titulo , dataprimeiro, dataultimo, horario , autor , emissora, audiencia , classif;
private double pessoas ;
public Novela (){
   titulo = null;
   dataprimeiro= null;
   dataultimo= null;
   horario = null;
   autor = null;
   emissora= null;
   audiencia = null;
    
}
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataprimeiro() {
        return dataprimeiro;
    }

    public void setDataprimeiro(String dataprimeiro) {
        this.dataprimeiro = dataprimeiro;
    }

    public String getDataultimo() { 
        return dataultimo;
    }

    public void setDataultimo(String dataultimo) {
        this.dataultimo = dataultimo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmissora() {
        return emissora;
    }

    public void setEmissora(String emissora) {
        this.emissora = emissora;
    }

    public String getAudiencia() {
        return audiencia;
    }

    public void setAudiencia(String audiencia) {
        this.audiencia = audiencia;
    }

    public boolean isViolencia() {
        return violencia;
    }

    public void setViolencia(boolean  violencia) {
        this.violencia = violencia;
    }

    public boolean  isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isDroga() {
        return droga;
    }

    public void setDroga(boolean droga) {
        this.droga = droga;
    }
  private boolean violencia, sexo, droga ;
   
  public String obterClassificacao(){
      if (violencia == false  && sexo == false && droga== false ){
         return "livre ";
      }else if (violencia == true && sexo == false  && droga == false ){
         return "14 anos ";
      }else if (violencia==  true && sexo == true  || sexo == true && droga == true ){
          return "16 anos ";
      }else if ( violencia == true  && sexo==  true  && droga == true  ){
      return "18 anos ";
  }else 
         return "";
}
  
  public double Ibope (){
   pessoas = Double.parseDouble (audiencia ) * 10.000;
   return pessoas;
  }
}