package com.matheusdev;


import java.util.Date;

public class ContaSalario extends Conta {

    public ContaSalario() {
    }

    public ContaSalario(TipoConta tipoConta,
                        TipoCliente tipoCliente,
                        Date dataAbertura,
                        double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }

    @Override
    public double calcularValorTarifaManutencao() {
        return 0.02 * getSaldo();
    }
}
