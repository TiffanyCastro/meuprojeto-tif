
package sheldon;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Sheldon {
    public static void main(String[] args) {
       List<Bonecos> lista = new ArrayList<Bonecos>();
       Vilão v = new Vilão();
       v.setNome("Loki");
       v.setArquiinimigo("Não sei");
       v.setDataapariçao("20/10");
       v.setEditora("Marvel");
       v.setSuperpoder("Não sei");
       
       Vilão c = new Vilão ();
       c.setArquiinimigo("Batman");
       c.setDataapariçao("2000");
       c.setEditora("DC");
       c.setNome("Coringa");
       c.setSuperpoder("Risadas");
       
       Vilão ll= new Vilão ();
       ll.setArquiinimigo("Seila");
       ll.setDataapariçao("2000");
       ll.setEditora("DC");
       ll.setNome("Lex Luthor");
       ll.setSuperpoder("EU NÃO SEI");
       
       
        Heroi b = new Heroi ();
        b.setAlterego("Não sei ");
        b.setDataapariçao("2000");
        b.setEditora("DC");
        b.setNome("Batman");
        b.setSuperpoder("Imitar um morcego");
        
        Heroi s= new Heroi ();
        s.setAlterego("Não sei ");
        s.setDataapariçao("2000");
        s.setEditora("DC");
        s.setNome("Super Man");
        s.setSuperpoder("voar");
        
        Heroi l = new Heroi ();
        l.setAlterego("não sei ");
        l.setDataapariçao("2000");
        l.setEditora("DC");
        l.setNome("Lanterna Verde");
        l.setPreferido(true);
        l.setSuperpoder("Um anel");
        
        
       Heroi h = new Heroi();
       h.setNome("Hulk");
       h.setAlterego("Não sei ");
       h.setSuperpoder("Força");
       h.setEditora("Marvel");
       h.setDataapariçao("2000");
       
        Heroi ca = new Heroi ();
        ca.setAlterego("Não sei");
        ca.setDataapariçao("2000");
        ca.setEditora("Marvel");
        ca.setNome("Capitão América");
        ca.setSuperpoder("Escudo");
        
        Heroi hf = new Heroi ();
        hf.setAlterego("Não sei");
        hf.setDataapariçao("2000");
        hf.setEditora("Marvel");
        hf.setNome("Homem de Ferro");
        hf.setSuperpoder("seila");
      
         FilmesDesenhos f = new FilmesDesenhos();
        f.setFilme("Vingadores");
        f.personagens.add(h);
        f.personagens.add(ca);
        f.personagens.add(hf);
        f.personagens.add(v);
      
        
       FilmesDesenhos f2 = new FilmesDesenhos();
       f2.setFilme("Batman VS SuperMan");
       f2.personagens.add(b);
       f2.personagens.add(s);
       f2.personagens.add(c);
       f2.personagens.add(ll);
       f2.personagens.add(l);
     
       JOptionPane.showMessageDialog(null, f.retornarPersonagens());
       JOptionPane.showMessageDialog(null, f2.retornarPersonagens());
       

        
    }
    
}
