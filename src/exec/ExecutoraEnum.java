package exec;

import br.com.yohana.enums.Meses;
import br.com.yohana.generics.Pair;

import java.util.ArrayList;
import java.util.List;

public class ExecutoraEnum {
    public static void main(String[] args) {
        System.out.println(Meses.FEBRUARY);
        System.out.println(Meses.FEBRUARY.getCode());
        System.out.println(Meses.FEBRUARY.getDescription());
        System.out.println(Meses.FEBRUARY.getZip());


        System.out.println(Meses.MARC);
        System.out.println(Meses.MARC.getCode());
        System.out.println(Meses.MARC.getDescription());
        System.out.println(Meses.MARC.getZip());

        Meses[] meses =  Meses.values();
        List<Pair> pares = new ArrayList<>();

        for(Meses mes: meses){
            System.out.println("Meses no for:  "+mes.getDescription());
            Pair<String, String> pair = new Pair<String, String>(mes.getZip(), mes.getDescription());
            pares.add(pair);
        }

        pares.stream().forEach(p-> System.out.println(p.getKey() +" - "+ p.getValue()));
    }
}
