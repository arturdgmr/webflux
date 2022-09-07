package com.study.webflux.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BensGarantia {

    private Long idOferta;
    private String idCliente;
    private BigDecimal valorSelecionadoUso;
    private BigDecimal preAprovado;
    private Integer carenciaMinima;
    private Integer carenciaMaxima;
    private List<Investimento> investimentos;


}
