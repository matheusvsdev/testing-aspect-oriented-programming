package com.matheusdev;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(
                TipoConta.POUPANCA,
                TipoCliente.PESSOA_FISICA,
                new Date(),
                1000.00
        );
        contaPoupanca.sacar(500.0); // Saldo suficiente, saque realizado com sucesso!
        contaPoupanca.sacar(600.0); // Saldo insuficiente!

        ContaInvestimento contaInvestimento = new ContaInvestimento(
                TipoConta.INVESTIMENTO,
                TipoCliente.PESSOA_JURIDICA,
                new Date(),
                2000.0
        );
        contaInvestimento.sacar(1000.0); // Saldo suficiente, saque realizado com sucesso!
        contaInvestimento.sacar(1500.0); // Saldo insuficiente!

        ContaCorrente contaCorrente = new ContaCorrente(TipoConta.CORRENTE,
                TipoCliente.PESSOA_FISICA,
                new Date(),
                1500.0);
        contaCorrente.sacar(700.0); // Saldo suficiente, saque realizado com sucesso!
        contaCorrente.sacar(900.0); // Saldo insuficiente!

        ContaSalario contaSalario = new ContaSalario(TipoConta.SALARIO,
                TipoCliente.PESSOA_FISICA,
                new Date(),
                1200.0);
        contaSalario.sacar(600.0); // Saldo suficiente, saque realizado com sucesso!
        contaSalario.sacar(800.0); // Saldo insuficiente!
    }
}