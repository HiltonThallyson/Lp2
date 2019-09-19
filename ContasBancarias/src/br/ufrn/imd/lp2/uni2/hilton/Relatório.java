package br.ufrn.imd.lp2.uni2.hilton;

public class Relatório {
    public void gerarRelatório(ContaBancaria conta){
        if(conta instanceof ContaCorrente){
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println(cc.mostrarDados());
        }else{
            ContaPoupança cp = (ContaPoupança) conta;
            System.out.println(cp.mostrarDados());
        }
    }
}
