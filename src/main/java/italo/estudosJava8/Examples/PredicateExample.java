package italo.estudosJava8.Examples;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

@Slf4j
public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> p = (x) -> x.equals(4);

        Predicate<Integer> p2 = (x) -> x%2==0;

        log.info("É igual a 4? {}", p.test(4));

        log.info("É igual a 4 e Par? {}", p.or(p2).test(4));

    }

}
