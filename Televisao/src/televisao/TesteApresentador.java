package televisao;

import javax.swing.JOptionPane;

public class TesteApresentador {
    public static void main(String[] args) {
        Apresentador ap = new Apresentador ();
   String nome , datadenascimento, programa, email, nomeartistico , cidade, endereco, bairro , estado;    
   String ganhos , qevento , ganhototal, salariomensal,cache,  merchan;
   nome = JOptionPane.showInputDialog ("nome do apresentador ");
   ap.setNome(nome);
   datadenascimento = JOptionPane.showInputDialog ("data de nascimento ");
   ap.setDatadenascimento(datadenascimento);
   programa= JOptionPane.showInputDialog("programa ");
   ap.setPrograma(programa);
   email= JOptionPane.showInputDialog("email");
   ap.setEmail(email);
   nomeartistico= JOptionPane.showInputDialog("nome artistico");
   ap.setNomeartistico(nomeartistico);
   cidade= JOptionPane.showInputDialog("cidade ");
   ap.setCidade(cidade);
   endereco = JOptionPane.showInputDialog("endereço");
   ap.setEndereco(endereco);
   bairro = JOptionPane.showInputDialog("bairro ");
   ap.setBairro(bairro);
   estado= JOptionPane.showInputDialog("estado ");
   ap.setEstado(estado);
   salariomensal = JOptionPane.showInputDialog("salario mensal ");
   ap.setSalariomensal (Double.parseDouble (salariomensal));
  cache= JOptionPane.showInputDialog ("cache ");
  ap.setCache( Double.parseDouble (cache));
  merchan = JOptionPane.showInputDialog("mechan ");
  ap.setMerchan(Double.parseDouble(merchan));
  qevento = JOptionPane.showInputDialog ("quantidade de evento ?");
  JOptionPane.showMessageDialog (null, "nome artistico " + nomeartistico+ "\n programa "+ programa + "\n ganhos " + ap.apreGanhos());
    }
    
}
