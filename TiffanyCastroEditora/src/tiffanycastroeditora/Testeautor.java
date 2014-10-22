
package tiffanycastroeditora;

import javax.swing.JOptionPane;

public class Testeautor {
    public static void main(String[] args) {
     Informacoesautor ia = new Informacoesautor ();
     String datanascimento , nome , sobrenome, inf;
     String quantlivros ;
    datanascimento = JOptionPane.showInputDialog("data de nascimento " );
    ia.setDatanascimento(datanascimento);
    nome = JOptionPane.showInputDialog("nome ");
    ia.setNome(nome);
    sobrenome= JOptionPane.showInputDialog("sobrenome ");
    ia.setSobrenome(sobrenome);
    quantlivros =JOptionPane.showInputDialog("quantidade de livros ?");
    ia.setQuantlivros (Double.parseDouble (quantlivros ));
    JOptionPane.showMessageDialog(null, "Nome :" + nome + "\n sobrenome " + sobrenome + "\n data de nascimento:" +datanascimento + "\n quantidade de livros" + quantlivros);
    JOptionPane.showMessageDialog(null, "Nome Sobrenome  / Quantidade de livros ");
    JOptionPane.showMessageDialog (null,  ia.Autor());
   
    }
    
}
