
package televisao;

import javax.swing.JOptionPane;

public class TesteEmissora {
    public static void main(String[] args) {
        Emissora e = new Emissora ();
        String nome , endereco, abertafechada;  
       nome = JOptionPane.showInputDialog ("nome da emissora ");
       e.setNome(nome);
        endereco = JOptionPane.showInputDialog ("endereço da emissora ");
        e.setEndereco (endereco);
        abertafechada = JOptionPane.showInputDialog("a tv é aberta ou fechada ?");
        e.setAbertafechada(abertafechada);
        JOptionPane.showMessageDialog(null, "nome" + nome + "\n endereço " + endereco + "\n Aberta ou fechada :" +abertafechada);
    }
    
}
