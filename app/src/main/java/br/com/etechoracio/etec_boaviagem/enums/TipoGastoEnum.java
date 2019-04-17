package br.com.etechoracio.etec_boaviagem.enums;

import android.widget.Spinner;

public enum TipoGastoEnum {
    ALIMENTACAO("Alimentação"),
    COMBUSTIVEL("Combustível"),
    TRANSPORTE("Transporte"),
    HOSPEDAGEM("Hospedagem"),
    OUTROS("Outros");

    TipoGastoEnum(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String toString(){
        return descricao;
    }
}
