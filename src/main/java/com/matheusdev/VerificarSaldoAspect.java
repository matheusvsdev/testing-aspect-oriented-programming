package com.matheusdev;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class VerificarSaldoAspect {
    @Pointcut("execution(void Conta.sacar(double))")
    public void sacar() {}

    @Before("sacar() && target(conta) && args(valor)")
    public void verificarSaldo(Conta conta, double valor) {
        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente!");
        }
    }
}
