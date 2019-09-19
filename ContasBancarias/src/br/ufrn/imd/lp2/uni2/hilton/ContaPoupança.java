package br.ufrn.imd.lp2.uni2.hilton;

public class ContaPoupança extends ContaBancaria implements Imprimivel{
    private double limite;

    //Métodos especiais


    public ContaPoupança(int conta, double saldo, double limite) {
        super(conta, saldo);
        this.limite = limite;
    }

    public double getLimite()   {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    //Métodos públicos
    @Override
    public void sacar(double value) {
        if(value > (this.getSaldo()+this.getLimite())){
            System.out.println("Impossível realizar o saque! Valor excede o limite");
        }else if(value <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - value);
        }else{
            this.setSaldo(this.getSaldo()-value);
            this.setLimite(this.getLimite() + this.getSaldo());
        }
    }

    @Override
    public void depositar(double value) {
        this.setSaldo(this.getSaldo() + value);
        System.out.println("Depósito realizado com sucesso! Saldo : " + this.getSaldo());
    }

    @Override
    public String mostrarDados() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "ContaPoupança{ conta: " + this.getConta() + "\n" +
                "Saldo : " + this.getSaldo() + "\n" + "limite : " + limite + " }";
    }
}
