

package caixaeletronico;

import javax.swing.JOptionPane;

public class Conta {
    String agencia , numeroconta, nomecorrentista;
    double saldo ;
    boolean ativa;
   double deposito, sacar ;
     
    void abrir ( String ag, String numc, String nomecor){
        agencia = ag ;
        numeroconta =  numc;
        nomecorrentista = nomecor ;
    
        ativa = true ;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public String getNomecorrentista() {
        return nomecorrentista;
    }

    public void setNomecorrentista(String nomecorrentista) {
        this.nomecorrentista = nomecorrentista;
    }

       public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    String depositar (double valor){
        if (ativa == true ){
            saldo = saldo + valor ;
            return "foi realizado" ;
        }else 
            return "nao foi realizado";
    }
    String Sacar (double valors ){
        if (ativa == true && saldo > valors){
            saldo  = saldo - valors ;
            return "foi realizado";
        }else 
            return "nao deu ";
    }
      
    double retSaldo (){
        return saldo;
    }
    
    String fecharConta (){
     saldo = 0 ;
    return "desativada";  
      
    }
}
