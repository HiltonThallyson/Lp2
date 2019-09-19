package br.ufrn.imd.lp2.uni2.hilton;

public class Main {

    public static void main(String[] args) {
    	Banco bb = new Banco();
	    ContaPoupança cp = new ContaPoupança(1,1000,500);
	    ContaCorrente cc = new ContaCorrente(2, 700, 3.5d);
	    Relatório r = new Relatório();

	    bb.inserir(cp);
	    bb.inserir(cc);
	    bb.remover(cp);
		bb.remover(cp);
		bb.inserir(cp);
	    bb.mostrarDados();
//	    r.gerarRelatório(cp);
//	    r.gerarRelatório(cc);
//	    cc.sacar(695);
//	    cc.depositar(10);
//	    cp.sacar(1000);
//	    cp.sacar(500);
//	    cp.depositar(1000);
//	    cc.tranfesrir(100, cp);
//	    r.gerarRelatório(cc);
//	    r.gerarRelatório(cp);
//	    cp.tranfesrir(100,cc);
//	    r.gerarRelatório(cp);
//	    r.gerarRelatório(cc);

    }
}
