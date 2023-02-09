package italo.estudosJava8.Examples;

import lombok.extern.slf4j.Slf4j;

import java.util.function.BiConsumer;

@Slf4j
public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> displaySoma = (x,y) -> log.info("Somando : {} e : {}", x,y);

        BiConsumer<Integer, Integer> soma = (x,y) -> log.info("Resultado: {}", x+y);

       displaySoma.andThen(soma).accept(1,2);


    }

}
