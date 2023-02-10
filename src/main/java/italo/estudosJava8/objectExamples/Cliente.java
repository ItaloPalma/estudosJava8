package italo.estudosJava8.objectExamples;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Slf4j
@Builder
public class Cliente {

    String nome;

    String sobrenome;
    String endereco;

    public void retornaNomeCompleto(){
        System.out.println(nome + " " + sobrenome);
    }

}
