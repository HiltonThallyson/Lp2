package br.ufrn.imd.lp2.uni2.hilton;

public class ContaCorrente extends ContaBancaria implements Imprimivel{
    private double taxaDeOperação;

    //Métodos especiais


    public ContaCorrente(int conta, double saldo, double taxaDeOperação) {
        super(conta, saldo);
        this.taxaDeOperação = taxaDeOperação;
    }

    public double getTaxaDeOperação() {
        return taxaDeOperação;
    }

    public void setTaxaDeOperação(double taxaDeOperação) {
        this.taxaDeOperação = taxaDeOperação;
    }
    //Métodos públicos
    @Override
    public String mostrarDados() {
       return this.toString();
    }

    @Override
    public boolean sacar(double value) {
        if(value > (this.getSaldo()-taxaDeOperação)){
            System.out.println("Saldo insuficiente!");
            return false;
        }else{
            this.setSaldo(getSaldo()-value-taxaDeOperação);
            System.out.println("Saque realizado com sucesso!");
            return true;
        }
    }

    @Override
    public boolean depositar(double value) {
        if(this.taxaDeOperação > (value) + this.getSaldo()){
            System.out.println("Depósito não realizado!");
            return false;
        }else {
            this.setSaldo(this.getSaldo() + value - this.getTaxaDeOperação());
            System.out.println("Depósito realizado com sucesso!");
            return true;
        }
    }

    @Override
    public boolean tranfesrir(double value, ContaBancaria conta) {
        if(this.sacar(value)){
            conta.depositar(value);
            System.out.println("Transferência realizada com sucesso!");
            return true;
        }
        System.out.println("Transfêrencia não realizada! Saldo insuficiente.");
        return false;
    }

    @Override
    public String toString() {
        return "ContaCorrente{ conta: " + this.getConta() + "\n" +
                "Saldo : " + this.getSaldo() + "\n" +
                "taxaDeOperação : " + taxaDeOperação + " }";
    }
}
