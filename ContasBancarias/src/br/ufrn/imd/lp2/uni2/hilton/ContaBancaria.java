package br.ufrn.imd.lp2.uni2.hilton;

public abstract class ContaBancaria {
    private int conta;
    private double saldo;

    //Métodos Especiais

    public ContaBancaria(int conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos Públicos
    public abstract void sacar(double value);
    public abstract void depositar (double value);


}
