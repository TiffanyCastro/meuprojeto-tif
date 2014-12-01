
package sheldon;

import java.util.ArrayList;
import java.util.List;

public class Bonecos {
      private String nome, editora, dataapariçao, superpoder;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDataapariçao() {
        return dataapariçao;
    }

    public void setDataapariçao(String dataapariçao) {
        this.dataapariçao = dataapariçao;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }
      public String retornarInformaçoes() {
        String retorno;
        retorno = this.getNome() + " - " + "Editora" + getEditora() ;
        return retorno;
    }
     
}
