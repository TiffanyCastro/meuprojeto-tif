package sheldon;

import java.util.ArrayList;
import java.util.List;

public class FilmesDesenhos extends Bonecos  {
     private String filme;
     List <Bonecos> personagens;
     
     public  FilmesDesenhos (){
         this.personagens = new ArrayList <Bonecos> ();
     }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public List<Bonecos> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Bonecos> personagens) {
        this.personagens = personagens;
    }

    
    public String retornarPersonagens(){
        String retorno;
        
        retorno=  " FILME " + filme + "\n" + "PERSONAGENS :" + "\n" ;
        
        for (Bonecos bonecos : personagens) {
            retorno = retorno + bonecos.retornarInformaçoes() + "\n";
                    
            
        }
        return retorno;
        
        
    }

}
