package br.com.yohana.consumer;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import br.com.yohana.repository.*;

public class BiFunctionExample {
    static BiFunction<String, String, String>  bf1 = (a, b) -> (a+" - "+b);
    static Predicate<Company> p3 = (p) -> p.getLocation().equals("USA");
    static Predicate<Company> p4 = (p) -> p.getPositionRanking() < 3 ;


    static BiFunction<List<Company>, Predicate<Company>, Map<String, Integer>> bf2 = (listCompany, predicate) -> {
        Map<String, Integer> map = new LinkedHashMap<>();
        listCompany.stream().filter(p-> predicate.test(p)).forEach(p2 -> {
            map.putIfAbsent(p2.getName(), p2.getQtyEmployee());
        });
        return map;
    };

    public static void main(String[] args) {
        System.out.println(bf1.apply("java17", "features"));
        List<Company> companyList = CompanyRepository.getAllCompanies();
        Map<String, Integer> result = bf2.apply(companyList, p3);
        System.out.println(result);
    }
}
