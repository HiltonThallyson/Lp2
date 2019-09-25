package br.ufrn.imd.lp2.uni2.hilton;

public class Empregado implements Comparable<Empregado> {
    private String nome;
    private int idade;
    private double salario;

    //Métodos Especiais

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Empregado empregado) {
        return this.getNome().compareTo(empregado.getNome());
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}
