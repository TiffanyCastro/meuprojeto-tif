
package caixaeletronico;

import java.util.ArrayList;
import java.util.List;

public class ListaCliente {

    public static void main(String[] args) {
        List<Cliente> cli = new ArrayList<Cliente>();
       Cliente c = new Cliente ();
       c.setNome ("Tiffany");
       c.setData ("20/10/98");
       c.setCpf ("09090909");
       c.setEndereco ("Santa flora");
       cli.add(c);
       c = new Cliente ();
       c.setNome ("Marina");
       c.setData ("11/08/98"); 
       c.setCpf ("o9090900");
       c.setEndereco ("Getulio Vargas");
       cli.add(c);
        c = new Cliente ();
       c.setNome ("Rafaella");
       c.setData ("04/03/99"); 
       c.setCpf ("o9090900");
       c.setEndereco ("Dame");
       cli.add(c);
        for (Cliente cliente : cli) {
            System.out.println (cliente.getNome());
            System.out.println (cliente.getData());
        System.out.println (cliente.getCpf());
            System.out.println (cliente.getEndereco());
    }
    
    }
}
