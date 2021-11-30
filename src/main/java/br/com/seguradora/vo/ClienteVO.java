package br.com.seguradora.vo;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteVO {

    private Long id;

    @NotBlank(message = "{nome.not.blank}")
    private String nome;

    @NotNull(message = "{cpf.not.null}")
    private String cpf;

    @NotBlank(message = "{cidade.not.blank}")
    private String cidade;

    @NotBlank(message = "{uf.not.blank}")
    private String uf;
}
