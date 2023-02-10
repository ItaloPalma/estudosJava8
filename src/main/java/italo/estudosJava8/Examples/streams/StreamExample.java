package italo.estudosJava8.Examples.streams;

import italo.estudosJava8.objectExamples.Cliente;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StreamExample {

    public static void main(String[] args) {

        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(Cliente.builder()
                        .nome("Teste")
                        .sobrenome("Lista")
                        .endereco("Rua do Teste")
                .build());
        listaClientes.add(Cliente.builder()
                .nome("Teste2")
                .sobrenome("Lista2")
                .endereco("Rua do Teste2")
                .build());
        listaClientes.add(Cliente.builder()
                .nome("Teste3")
                .sobrenome("Lista3")
                .endereco("Rua do Teste3")
                .build());


        List<String> nomeClienteList = listaClientes.stream().map(Cliente::getNome).collect(Collectors.toList());

        List<Cliente> nomeClienteEspecifico = listaClientes.stream().filter(cliente -> cliente.getNome().equals("Teste")).collect(Collectors.toList());

        log.info("Lista de Nomes {}", nomeClienteList);

        log.info("Lista de Nomes Especificos {}", nomeClienteEspecifico);

    }


}
