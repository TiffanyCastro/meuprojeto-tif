
package caixaeletronico;

import javax.swing.JOptionPane;

public class CaixaEletronico {
    public static void main(String[] args) {
        String agencia, numeroconta, nomecorrentista;
        double saldo, deposito, sacar , valor , valors , valorret;
        boolean ativa ,serasa, spc;
        String cpf, nome , endereco , data ;
        String nomebanco, numerobanco, empimovel, empcarro;;
        
        int m= 0 ;
        Banco b = new Banco ();
        Cliente cli = new Cliente ();
        Conta c = new Conta ();
        do {
            m = Integer.parseInt(JOptionPane.showInputDialog ("1-abrir conta \n 2- depositar \n 3- sacar \n 4- ver saldo"
                    + " \n 5- fechar conta \n 6- informaçoes clientes \n7-informaçoes do bando \n8- sair "));
            switch (m){
               
                case 1 :{
                     agencia = JOptionPane.showInputDialog ("informe agencia");
                     numeroconta= JOptionPane.showInputDialog("informe o numero da conta");
        nomecorrentista = JOptionPane.showInputDialog ("informe o nome do correntista");
        c.abrir( agencia, numeroconta, nomecorrentista);
        m = 0;
        break;
                }
                case 2:{
                     deposito = Double.parseDouble(JOptionPane.showInputDialog("valor para deposito"));
        JOptionPane.showMessageDialog(null,c.depositar(deposito));
        m=0;
        break;
                }
                case 3 :{
                    sacar = Double.parseDouble (JOptionPane.showInputDialog("valor para saque"));
        JOptionPane.showMessageDialog(null,c.Sacar(sacar));
        m=0;
        break;
                }
                case 4 :{ 
                      JOptionPane.showMessageDialog(null, + c.retSaldo());
                   m=0;
                      break;
                }
                case 5 :{ 
                    JOptionPane.showMessageDialog(null, c.fecharConta());
                    m=0;
                    break;
                }
                case 6 :{
                     cpf = JOptionPane.showInputDialog("informe seu cpf ");
                nome = JOptionPane.showInputDialog("nome ");
                 endereco= JOptionPane.showInputDialog("endereço");
                 data= JOptionPane.showInputDialog("data de nascimento");
                 cli.getCpf();
                  cli.getNome();
                  cli.getEndereco();
                  cli.getData();
                  JOptionPane.showMessageDialog(null,"serasa " + cli.isSerasa());
                  JOptionPane.showMessageDialog(null, "spc " +cli.isSpc());
                  m=0;
                  JOptionPane.showMessageDialog(null, "cpf = "+ cpf + "\n nome = " +nome + "\n endereço = " +endereco + "\n data de nascimento: "+ data);
                  break;
                }
                case 7 :{
                    nomebanco = JOptionPane.showInputDialog("nome do banco");
                    numerobanco= JOptionPane.showInputDialog("numero do banco");
                    empimovel= JOptionPane.showInputDialog ("o banco faz emprestimo de imovel?");
                    empcarro= JOptionPane.showInputDialog("o banco faz emprestimo de carro ?");
                    b.getNomebanco();
                    b.getNumerobanco();
                    b.getEmpcarro();
                    b.getEmpimovel();
                    JOptionPane.showMessageDialog(null, "Nome Banco : "+ nomebanco +"\n numero do banco"+ numerobanco +
                            "\n emprestimo de carro : " +empcarro + "\n emprestimo de imovel :" + empimovel);
                    break;
                }
                case 8 :{
                m = 1 ;
                break;
            }
            }
        }while (m == 0);   
       
        }
}