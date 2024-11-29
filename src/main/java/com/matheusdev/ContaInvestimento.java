package com.matheusdev;


import java.util.Date;

public class ContaInvestimento extends Conta {

    public ContaInvestimento() {
    }

    public ContaInvestimento(TipoConta tipoConta,
                             TipoCliente tipoCliente,
                             Date dataAbertura,
                             double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }

    @Override
    public double calcularValorTarifaManutencao() {
        return 0.10 * getSaldo();
    }
}
