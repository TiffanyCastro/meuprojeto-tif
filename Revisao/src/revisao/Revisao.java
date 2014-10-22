package revisao;

import javax.swing.JOptionPane;

public class Revisao {
    public static void main(String[] args) {
         Professor p = new Professor ();
        String nome= "Tiffany" , endereco= "Paris" , escola = "High School" , aula , aula1;
        double salario = 10000;
        boolean aulatec , aulasup ;
       p.aulatec= true;
       p.aulasup= true;
               
     if (p.aulatec == true){
         aula= "sim ";
     }else {
         aula = "nao ";
     }
     if (p.aulasup == true ){
         aula1 = "sim";
     }else {
         aula1= "nao ";
     }
     
     JOptionPane.showMessageDialog(null,"Nome : " + nome + "\n Endereço : " + endereco + "\n Escola : " + escola + "\n Salario : " 
        + salario + "\n Aula Tecnico : " + aula + "\n Aula Superior : " + aula1 );
    }
    
    }