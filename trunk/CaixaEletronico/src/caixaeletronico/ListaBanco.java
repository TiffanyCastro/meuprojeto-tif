

package caixaeletronico;

import java.util.ArrayList;
import java.util.List;

public class ListaBanco {

    public static void main(String[] args) {
         List<Banco> infobancos = new ArrayList<Banco>();
       Banco c = new Banco ();
       c.setNomebanco ("Brasil");
       c.setNumerobanco ("13651");
       infobancos.add(c);
       c = new Banco ();
       c.setNomebanco ("Bradesco");
       c.setNumerobanco ("485781"); 
       infobancos.add(c);
       for (int i =0; i< infobancos.size();i++) {
            System.out.println (infobancos.get(i).getNomebanco());
            System.out.println (infobancos.get(i).getNumerobanco());
    }
     
}
}