package br.ufrn.imd.lp2.uni2.hilton;

import java.util.ArrayList;

public class Banco implements Imprimivel {
    private ArrayList<ContaBancaria> contas;

    //Métodos especiais

    public Banco(){
        this.contas = new ArrayList<>();
    }
    public Banco(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
    }

    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
    }

    //Métodos públicos
    public boolean inserir(ContaBancaria conta){
        if(contas.contains(conta)){
            System.out.println("Conta já existente!");
            return false;
        }
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso!");
        return true;
    }

    public boolean remover(ContaBancaria conta){
        if(contas.contains(conta)){
            contas.remove(conta);
            System.out.println("Conta removida com sucesso!");
            return true;
        }
        System.out.println("Conta não cadastrada no Banco!");
        return false;
    }

    public ContaBancaria procurarConta(int nDaconta){
        for(ContaBancaria c : contas){
            if(c.getConta() == nDaconta){
                return c;
            }
        }
        return null;
    }

    @Override
    public String mostrarDados() {
        for(ContaBancaria c : contas){
            if(c instanceof ContaPoupança){
                System.out.println(((ContaPoupança) c).mostrarDados());
            }else {
                System.out.println(((ContaCorrente) c).mostrarDados());
            }
        }
        return "Não existem contas cadastradas!";
    }
}
