package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaBancariaTeste {
    @Test
    public void depositoTest(double valor, double saldo_inicial){
        assertEquals((valor+ saldo_inicial)==valor);
        }
    }

