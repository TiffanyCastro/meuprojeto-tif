
package televisao;

import javax.swing.JOptionPane;

public class TesteNovela {

    public static void main(String[] args) {
        Novela n = new Novela ();
        String titulo , dataprimeiro, dataultimo, horario , autor , emissora, audiencia;
        String violencia, sexo , droga ;
        titulo = JOptionPane.showInputDialog("titulo ");
        n.setTitulo(titulo);
        dataprimeiro =JOptionPane.showInputDialog("primeiro ");
        n.setDataprimeiro (dataprimeiro);
        dataultimo = JOptionPane.showInputDialog("ultimo");
        n.setDataultimo(dataultimo);
        horario= JOptionPane.showInputDialog("harario");
        n.setHorario (horario);
        autor = JOptionPane.showInputDialog("autor ");
        n.setAutor (autor );
        emissora = JOptionPane.showInputDialog("emissora ");
        n.setEmissora(emissora);
        audiencia= JOptionPane.showInputDialog("audiencia ");
        n.setAudiencia (audiencia );
        violencia = JOptionPane.showInputDialog ("contem cenas de violencia ?");
        sexo= JOptionPane.showInputDialog ("sexo /");
        droga= JOptionPane.showInputDialog ("droga ?");
        
        JOptionPane.showMessageDialog (null, "titulo " + titulo + " \n classificaçao " + n.obterClassificacao() + "\n ibope"+ n.Ibope());  
    }
    
}
