package com.study.webflux;

import com.study.webflux.domain.BensElegiveis;
import com.study.webflux.domain.BensGarantia;
import com.study.webflux.domain.Investimento;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Mono<BensGarantia> bensGarantia = getBensElegiveis().map(i -> {
            BensGarantia bensGarantia1 = new BensGarantia();
            bensGarantia1.setIdOferta(123l);
            bensGarantia1.setIdCliente(i.getIdCliente());
            bensGarantia1.setCarenciaMaxima(i.getCarenciaMaxima());
            bensGarantia1.setCarenciaMinima(i.getCarenciaMinima());
            bensGarantia1.setInvestimentos(i.getInvestimentos());
            bensGarantia1.setPreAprovado(i.getPreAprovado());
            return bensGarantia1;
        });

        System.out.println(bensGarantia);

    }

    private static Mono<BensElegiveis> getBensElegiveis(){
        return Mono.just(
                BensElegiveis
                        .builder()
                        .idCliente("123")
                        .carenciaMaxima(12)
                        .carenciaMinima(1)
                        .investimentos(getInvestimento())
                        .preAprovado(BigDecimal.valueOf(1000))
                        .build()
        );
    }

    private static List<Investimento> getInvestimento() {
        return List.of(
                Investimento
                        .builder()
                        .id("305")
                        .descricao("Super DI")
                        .nome("Fundos")
                        .build()
        );
    }

}
