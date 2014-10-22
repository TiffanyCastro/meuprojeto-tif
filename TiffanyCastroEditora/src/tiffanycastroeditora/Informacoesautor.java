
package tiffanycastroeditora;

import javax.swing.JOptionPane;

public class Informacoesautor {
private String datanascimento , nome , sobrenome, inf;
private double quantlivros ;
   public Informacoesautor (){
       datanascimento = null;
       nome = null;
       sobrenome= null;
       quantlivros = 0.0;
   }
    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getQuantlivros() {
        return quantlivros;
    }

    public void setQuantlivros(double quantlivros) {
        this.quantlivros = quantlivros;
    }
  public String Autor (){
      inf = nome + sobrenome + quantlivros;
      return inf;
   }
}