package com.matheusdev;


import java.util.Date;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    public ContaPoupanca(TipoConta tipoConta,
                         TipoCliente tipoCliente,
                         Date dataAbertura,
                         double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }

    @Override
    public double calcularValorTarifaManutencao() {
        return 0.05 * getSaldo();
    }
}
