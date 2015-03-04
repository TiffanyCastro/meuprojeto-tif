
package tiffanypessoa;

import javax.swing.JOptionPane;

public class TiffanyPessoa {

    public static void main(String[] args) {
         Pessoa pessoa = new Pessoa ();
          while (pessoa.getCodigo() == null)
          {
              try
              {
                  pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("digite o codigo")));
 
              }
              catch(Exception ex)
                      {
                          JOptionPane.showMessageDialog(null, "codigo errado");
                      }
          }
          pessoa.setNome(JOptionPane.showInputDialog("digite nome"));
          pessoa.setSexo(JOptionPane.showInputDialog("digite o sexo"));
          
          JOptionPane.showMessageDialog(null, pessoa.getCodigo() + "\n" + pessoa.getNome()+ "\n " + pessoa.getSexo ());
        
        
    }
    
}
