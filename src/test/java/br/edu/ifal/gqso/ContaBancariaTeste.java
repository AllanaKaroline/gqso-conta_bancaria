package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class ContaBancariaTeste {
    @Test
     public void depositoTest(double valor_dep, double saldo_inicial){
        assertEquals(valor_dep, valor_dep+saldo_inicial);
        }

    @Test
    public void saldoTest(double saldo_final, double saldo_inicial, double valor_dep, double valor_saque){
        assertEquals(saldo_final, saldo_inicial+valor_dep);
        assertEquals(saldo_final, saldo_inicial-valor_saque);
        assertEquals(saldo_final, saldo_final>=saldo_inicial);
        }
    @Test
    public void saqueTest(double valor_saque, double saldo_final, double saldo_inicial){
        assertEquals(saldo_final, saldo_inicial-valor_saque);
        assertEquals(valor_saque, valor_saque<=saldo_inicial);
    } 
    }
    

    


