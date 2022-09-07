package com.study.webflux.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class Investimento {
    private String id;
    private String nome;
    private String descricao;
}
