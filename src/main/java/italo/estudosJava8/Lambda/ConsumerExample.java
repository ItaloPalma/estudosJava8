package italo.estudosJava8.Lambda;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@Slf4j
public class ConsumerExample {

    public static void main(String[] args) {

        //Permite criar ações para serem executadas em um método
        Consumer<String> consumerImpl = s -> log.info("Valor Recebido: {}", s);
        Consumer<String> consumerImpl2 = s -> log.info("Valor Recebido em Maiúsculo: {}", s.toUpperCase());

        consumerImpl.accept("Teste");

        List<String> lista = new ArrayList<>();

        lista = Arrays.asList("1", "2", "3");

        lista.forEach(consumerImpl);

        //Criar Sequência de Ações em um Consumer para cada Elemento da Lista com andThen
        lista.forEach(consumerImpl.andThen(consumerImpl2));

    }

}
