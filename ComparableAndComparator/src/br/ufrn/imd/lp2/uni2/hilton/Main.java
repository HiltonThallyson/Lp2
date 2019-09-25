package br.ufrn.imd.lp2.uni2.hilton;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Empregado e1 = new Empregado("Jorge", 26, 1200d);
        Empregado e2 = new Empregado("Hilton", 27,1400d );
        Empregado e3 = new Empregado("Maria", 26, 1400d);
        Empregado e4 = new Empregado("Augusto", 27, 1600d);
        Empregado e5 = new Empregado("Leandro", 20, 998d);
        EmpregadoCompareBySalary compareBySalary = new EmpregadoCompareBySalary();
        EmpregadoCompareByAge compareByAge = new EmpregadoCompareByAge();
        EmpregadoCompareByAgeThenSalary compareByAgeThenSalary = new EmpregadoCompareByAgeThenSalary();

        List<Empregado> empregados = new ArrayList<>();
        empregados.add(e1);
        empregados.add(e2);
        empregados.add(e3);
        empregados.add(e4);
        empregados.add(e5);
        //Original
        System.out.println("=========Original=========");
        for (Empregado e: empregados) {
            System.out.println(e);
        }
        //Ordenado por nome
        System.out.println("\n\n\n=========Ordered by Name=========");
        Collections.sort(empregados);
        for (Empregado e: empregados) {
            System.out.println(e);
        }
        //Ordenado por salário
        System.out.println("\n\n\n=========Ordered by Salary=========");
        Collections.sort(empregados, compareBySalary);
        System.out.println("xxxxxCrescentexxxxx");
        for (Empregado e: empregados) {
            System.out.println(e);
        }
        System.out.println("\nxxxxxDecrescentexxxxxx");
        for (int i= empregados.size() - 1; i >=0; i--) {
            System.out.println(empregados.get(i));
        }
        //Ordenado por Idade
        System.out.println("\n\n\n=========Ordered by Age=========");
        Collections.sort(empregados, compareByAge);
        System.out.println("xxxxxCrescentexxxxx");
        for (Empregado e: empregados) {
            System.out.println(e);
        }
        System.out.println("\nxxxxxDecrescentexxxxxx");
        for (int i= empregados.size() - 1; i >=0; i--) {
            System.out.println(empregados.get(i));
        }

    }
}
