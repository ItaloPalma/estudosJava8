package italo.estudosJava8.Examples.methodReference;

import italo.estudosJava8.objectExamples.Cliente;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Slf4j
public class MethodReference {

    public static void main(String[] args) {

        //*Function<String, String> toUpperCase = (s) -> s.toUpperCase();
        Function<String, String> toUpperCase = String::toUpperCase;

        log.info("Resultado: {}", toUpperCase.apply("teste"));

        Supplier<Cliente> clienteSupplier = Cliente::new;

        var cliente = new Cliente("Julio", "Silva", "Rua das Palmeiras, 1300");

        Consumer<Cliente> retornaNomeESobrenome = Cliente::retornaNomeCompleto;

        retornaNomeESobrenome.accept(cliente);

    }

}
