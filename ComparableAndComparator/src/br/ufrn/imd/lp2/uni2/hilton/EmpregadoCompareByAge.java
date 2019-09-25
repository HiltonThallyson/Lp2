package br.ufrn.imd.lp2.uni2.hilton;

import java.util.Comparator;

public class EmpregadoCompareByAge implements Comparator<Empregado> {
    @Override
    public int compare(Empregado empregado, Empregado empregado2) {
        if(empregado.getIdade() >  empregado2.getIdade()){
            return 1;
        }else if(empregado.getIdade() == empregado2.getIdade()){
            return 0;
        }else{
        return -1;
        }
    }
}
