package com.study.webflux.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Data
@Getter
@Setter
@Builder
public class BensElegiveis {

    private String idCliente;
    private BigDecimal preAprovado;
    private Integer carenciaMinima;
    private Integer carenciaMaxima;
    private List<Investimento> investimentos;

}
