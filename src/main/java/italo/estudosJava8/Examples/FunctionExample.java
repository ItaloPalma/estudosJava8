package italo.estudosJava8.Examples;

import lombok.extern.slf4j.Slf4j;

import java.util.function.BiFunction;
import java.util.function.Function;

@Slf4j
public class FunctionExample {

    public static void main(String[] args) {

        Function<Integer, Integer> function = (x) -> x*2;

        BiFunction<Integer, Integer, Integer> biFunction = (x,y) -> x*y;

        log.info("Resultado: {} " , function.apply(2));

        log.info("Resultado BiFunction: {} " , biFunction.apply(2, 3));

    }

}
