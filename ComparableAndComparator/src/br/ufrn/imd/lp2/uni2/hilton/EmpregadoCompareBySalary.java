package br.ufrn.imd.lp2.uni2.hilton;

import java.util.Comparator;

public class EmpregadoCompareBySalary implements Comparator<Empregado> {
    @Override
    public int compare(Empregado empregado, Empregado empregado2) {
        if(empregado.getSalario() == empregado2.getSalario()){
            return 0;
        }else if(empregado.getSalario() > empregado2.getSalario()){
            return 1;
        }else{
            return -1;
        }
    }
}
