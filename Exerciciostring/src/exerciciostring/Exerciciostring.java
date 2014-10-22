

package exerciciostring;

import javax.swing.JOptionPane;

public class Exerciciostring {
    public static void main(String[] args) {
   String escalacao = "  Júlio César, D. Alves, D. Luiz, T. Silva, Maxwell, L.Gustavo, Paulinho, Oscar, Neymar, Fred, Hulk  ";
   int x;     
     x = escalacao.length();
        System.out.println(x);
      escalacao= escalacao.replace("Fred" ,"Jô");
    escalacao.trim();
    System.out.println("asas:"+escalacao.trim());
   if ("Ronaldinho" == escalacao){
       System.out.println("Sim");
       
   } else 
       System.out.println("Não");
    
}
  

}