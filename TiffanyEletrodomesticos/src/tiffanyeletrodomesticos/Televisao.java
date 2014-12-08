package tiffanyeletrodomesticos;
public class Televisao  extends Produto {
    private String hdmi,vga, tela;
     private boolean telaplasma ;

    public boolean getTelaplasma() {
        return telaplasma;
    }

    public void setTelaplasma(boolean telaplasma) {
        this.telaplasma = telaplasma;
    }

    public String getHdmi() {
        return hdmi;
    }

    public void setHdmi(String hdmi) {
        this.hdmi = hdmi;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }
     
    public String retornarInformacoes() {
        String retorno;
        if (disponibilidade == true )
        {
        retorno = super.retornarInformacoes() + this.hdmi + "HDMI " + " / " + this.vga + "VGA " + " , " + this.tela;
        return retorno;
    } 
        else 
        {
            retorno= "Produto Indisponivel";
        }
        return retorno;
}
    public double precoFinal (){
        double retorno ;
        if (telaplasma == true )
        {
            retorno = this.getPreco() * 0.5 ;
        }
        else
        {
            retorno= this.getPreco();
        }
        return retorno;
    }
}
