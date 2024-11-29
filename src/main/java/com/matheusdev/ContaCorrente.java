package com.matheusdev;


import java.util.Date;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }

    public ContaCorrente(TipoConta tipoConta,
                         TipoCliente tipoCliente,
                         Date dataAbertura,
                         double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }

    @Override
    public double calcularValorTarifaManutencao() {
        return 0.03 * getSaldo();
    }
}
