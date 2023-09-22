package br.com.bfelix.crudwiththymeleaf.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EscolaridadeEnum {

    FUNDAMENTAL_INCOMPLETO(0, "Fundamental Incompleto"),
    FUNDAMENTAL_COMPLETO(1, "Fundamento Completo"),
    MEDIO_COMPLETO(2, "Medio Completo"),
    TECNICO(3, "Tecnico"),
    SUPERIOR_CURSANDO(4, "Superior Cursando"),
    SUPERIOR_COMPLETO(5, "Superior Cimpleto"),
    POS_GRADUACAO(6, "Pos Graduação");

    private final int code;
    private final String descricao;
}
