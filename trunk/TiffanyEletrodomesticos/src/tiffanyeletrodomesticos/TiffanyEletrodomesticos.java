
package tiffanyeletrodomesticos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TiffanyEletrodomesticos {
    public static void main(String[] args) {
         List<Produto> lista = new ArrayList<Produto>();
          ArCondicionado ar = new ArCondicionado();
           ar.setMarca("Consul");
          ar.setPreco(1000.00);
          ar.setBtu(8000);
          ar.setPainel(true);
       
          
        Televisao tel = new Televisao ();
        tel.setMarca("Samsung");
        tel.setPreco(1200.00);
        tel.setHdmi("20");
        tel.setVga("20");
        tel.setTela("Led");
        tel.setDisponibilidade(true);
   
        
        Televisao tel2 = new Televisao ();
        tel2.setMarca ("LG");
        tel2.setPreco(1222.00);
        tel2.setHdmi("25");
        tel2.setVga("25");
        tel2.setTela("Led Full HD");
        tel2.setDisponibilidade(true);
       
        
        ArCondicionado ar2 = new ArCondicionado ();
        ar2.setMarca ("Britania");
        ar2.setPreco(1500.00);
        ar2.setBtu(9500);
        ar2.setPainel(true);
     
        
        Televisao tel3 = new Televisao ();
        tel3.setMarca("Samsung");
        tel3.setPreco(1500.00);
        tel3.setHdmi("30");
        tel3.setVga("30");
        tel3.setTela("Plasma");
        tel3.setTelaplasma(true);
        tel3.setDisponibilidade(true);
         
        Televisao tel4 = new Televisao ();
        tel4.setMarca("LG");
        tel4.setPreco(1600.00);
        tel4.setHdmi("90");
        tel4.setVga("90");
        tel4.setTela("Led");
        tel4.setDisponibilidade(false);
        
        
        Lojas l =  new Lojas ();
        l.setLojas("Ferias Legais");
        l.produtinhos.add(ar);
        l.produtinhos.add(tel);
        l.produtinhos.add(tel2);
       
        Lojas l2 = new Lojas ();
        l2.setLojas("IFEletro");
        l2.produtinhos.add(ar2);
        l2.produtinhos.add (tel3);
        l2.produtinhos.add(tel4);
        
        JOptionPane.showMessageDialog(null, l.retornarProdutos());
       JOptionPane.showMessageDialog(null, l2.retornarProdutos());
    }
               
    
}
