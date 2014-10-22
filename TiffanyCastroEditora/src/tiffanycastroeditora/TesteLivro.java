package tiffanycastroeditora;

import javax.swing.JOptionPane;

public class TesteLivro {
    public static void main(String[] args) {
     String titulo, anopubli, nomeautor , tiragem  ;
    String exemplares, ganhos , preco , ganhoaut, imp;
     String importado ;
     Informacoes i = new Informacoes ();
     titulo= JOptionPane.showInputDialog("titulo : ");
     i.setTitulo(titulo);
     anopubli = JOptionPane.showInputDialog("ano publicado ");
     i.setAnopubli (anopubli);
     nomeautor = JOptionPane.showInputDialog("nome do autor ");
     i.setNomeautor (nomeautor);
     tiragem = JOptionPane.showInputDialog(" tiragem inicial do livro ");
     i.setTiragem (tiragem);
     exemplares =  (JOptionPane.showInputDialog("numero de exemplares "));
     i.setExemplares (Double.parseDouble(exemplares));
     preco = JOptionPane.showInputDialog(" preço ");
     i.setPreco(Double.parseDouble (preco));
     importado= JOptionPane.showInputDialog("importado sim ou nao ?");
     JOptionPane.showMessageDialog(null, "Titulo :" + titulo + "\n Ano Publicado : " + anopubli + "\n Nome do autor :" + nomeautor + "\n tiragem :" + tiragem 
     + "\n exemplares " + exemplares + "\n preço " + preco + "\n importado ?" + importado);
     JOptionPane.showMessageDialog (null, "Nivel de sucesso :" + i.Sucesso() + "\n renda " + i.Renda()+ "\n Ganho autor " + i.ganhoAutor());
    }
    
}
