package televisao;

import javax.swing.JOptionPane;

public class TesteAtor {
    public static void main(String[] args) {
   String nome , datanascimento, quantidadedenovela , email = null, nomeartistico,  cidade, endereco, bairro ,estado;
   String salariomensal , cacheeve;
   String  qevento ;
    Ator a = new Ator ();
    nome = JOptionPane.showInputDialog ("nome do ator: ");
    a.setNome(nome);
    datanascimento = JOptionPane.showInputDialog("data de nascimento");
    a.setDatanascimento (datanascimento);
    quantidadedenovela = JOptionPane.showInputDialog ("quantidade de novela ?");
    a.setQuantidadedenovela (quantidadedenovela);
    email= JOptionPane.showInputDialog("email");
    a.setEmail(email);
    nomeartistico= JOptionPane.showInputDialog("nome artistico");
    a.setNomeartistico (nomeartistico);
    cidade= JOptionPane.showInputDialog ("cidade");
    a.setCidade (cidade);
    endereco = JOptionPane.showInputDialog("endereço");
    a.setEndereco (endereco);
    bairro = JOptionPane.showInputDialog(" bairro ");
    a.setBairro(bairro);
    estado= JOptionPane.showInputDialog("estado");
    a.setEstado(estado);
    qevento = JOptionPane.showInputDialog ("quantidade de eventos");
    salariomensal =(JOptionPane.showInputDialog ("salario mensal"));
    a.setSalariomensal (Double.parseDouble(salariomensal));
    cacheeve= JOptionPane.showInputDialog("cache por evento ");
    a.setCacheeve (Double.parseDouble(cacheeve));
     
    JOptionPane.showMessageDialog(null, "Nome Artistico : " + nomeartistico + "\n Data de nascimento : " +datanascimento + "\n email : "+ email + "\nquantidade de novela : " +quantidadedenovela +
            "\n Status : " + a.obterStatus() + "\n ganhos " + a.calcularGanhos());
    
    
    }
}