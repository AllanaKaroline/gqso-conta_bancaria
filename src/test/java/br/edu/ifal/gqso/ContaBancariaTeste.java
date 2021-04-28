package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;

public class ContaBancariaTeste {
    @Test
    public void depositoTest(double valor_dep, double saldo_inicial){
        assertEquals((valor_dep+ saldo_inicial)==valor_dep);
        }

    @Test
    public void saldoTest(){
        assertEquals(saldo>=(saldo_inicial));
        }
    @Test
    public void saqueTest(double valor){
        assertEquals(valor<(saldo));
    }
    }
        
    }

    


