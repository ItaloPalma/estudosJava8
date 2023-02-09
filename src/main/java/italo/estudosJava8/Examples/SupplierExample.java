package italo.estudosJava8.Examples;

import italo.estudosJava8.objectExamples.Cliente;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;

@Slf4j
public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Cliente> supplierCliente = () -> {
            return new Cliente("Julio", "Silva", "Rua das Palmeiras, 1300");
        };

        log.info("Cliente: {}", supplierCliente.get());
    }

}
