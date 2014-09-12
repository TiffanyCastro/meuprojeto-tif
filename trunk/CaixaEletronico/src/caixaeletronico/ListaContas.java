
package caixaeletronico;

import java.util.ArrayList;
import java.util.List;

public class ListaContas {

    public static void main(String[] args) {
          List<Conta> contas = new ArrayList<Conta>();
          Conta c = new Conta ();
          c.setNomecorrentista("Tiffany");
          c.setAgencia("02989297");
          c.setNumeroconta("0500-2014-007");
          contas.add(c);
          c = new Conta ();
          c.setNomecorrentista  ("Marina");
          c.setAgencia("0909090");
          c.setNumeroconta("0500-2014-014");
          contas.add(c);
          c= new Conta ();
          c.setNomecorrentista ("Rafaella");
          c.setAgencia ("9090909");
          c.setNumeroconta("0500-2014-040");
          contas.add(c);
          for (Conta conta : contas) {
             System.out.println (conta.getNomecorrentista());
            System.out.println (conta.getAgencia());
            System.out.println (conta.getNumeroconta());
          }
    }
    
    
}
