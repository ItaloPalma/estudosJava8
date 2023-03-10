package italo.estudosJava8.Examples;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;


@Slf4j
public class LambdaExample {

    public static void main(String[] args) {

        Runnable r = () -> log.info("Testando Interface Funcional");

        r.run();

        //*Implementando o lambda diretamente no atributo do método Thread
        //*Por ser uma interface Funcional o Runnable permite isso
        new Thread(()->log.info("Lambda Diretamente na Thread - Interface Funcional")).start();

        Comparator<Integer> comparator = (Integer x, Integer y) -> x.compareTo(y);

        log.info("Comparando se 3 é maior que 2. Resultado: {}", comparator.compare(3,2));

    }


}
