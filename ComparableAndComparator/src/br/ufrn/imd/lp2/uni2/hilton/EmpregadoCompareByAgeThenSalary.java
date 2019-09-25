package br.ufrn.imd.lp2.uni2.hilton;

import java.util.Comparator;

public class EmpregadoCompareByAgeThenSalary implements Comparator <Empregado> {
    @Override
    public int compare(Empregado empregado, Empregado empregado2) {
        EmpregadoCompareByAge comparadorPorIdade = new EmpregadoCompareByAge();
        EmpregadoCompareBySalary comparadorPorSalario = new EmpregadoCompareBySalary();
        if((comparadorPorIdade.compare(empregado, empregado2)) == 0){
            return comparadorPorSalario.compare(empregado, empregado2);
        }else{
            return comparadorPorIdade.compare(empregado, empregado2);
        }
    }
}
