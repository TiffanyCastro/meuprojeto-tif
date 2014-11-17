
package mc;

import java.util.ArrayList;
import java.util.List;

public class Filial {
   
   private String cidade;
    private double  preçomedio, faturamento;
    private Integer qtdvendida;
   private Gerente gerente;
   private List <Cozinheiro> cozinheiro;
   private List <Caixa> caixa;
  
   public Filial(){
       this.gerente= new Gerente();
   
       this.cozinheiro= new ArrayList<Cozinheiro>();
       this.caixa= new ArrayList <Caixa>();
   }

    public List<Cozinheiro> getCozinheiro() {
        return cozinheiro;
    }

    public void setCozinheiro(List<Cozinheiro> cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    public List<Caixa> getCaixa() {
        return caixa;
    }

    public void setCaixa(List<Caixa> caixa) {
        this.caixa = caixa;
    }
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

   

    public Integer getQtdvendida() {
        return qtdvendida;
    }

    public void setQtdvendida(Integer qtdvendida) {
        this.qtdvendida = qtdvendida;
    }

    public double getPreçomedio() {
        return preçomedio;
    }

    public void setPreçomedio(double preçomedio) {
        this.preçomedio = preçomedio;
    }
  
    public double retFaturamento(){
        faturamento = preçomedio* qtdvendida;
        return faturamento;
    }
}
