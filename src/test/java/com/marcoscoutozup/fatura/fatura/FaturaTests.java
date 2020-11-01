package com.marcoscoutozup.fatura.fatura;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FaturaTests {

    private Fatura fatura;

    @BeforeEach
    public void setup(){
        fatura = new Fatura();
    }

    @Test
    @DisplayName("Deve lançar exceção ao adicionar transação nula")
    public void deveLancarExcecaoAoAdicionarTransacaoNula(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> fatura.adicionarTransacaoNaFatura(null));
    }

    @Test
    @DisplayName("Deve lançar exceção ao calcular total da fatura com transações nulas")
    public void deveLancarExcecaoAoCalcularTotalDaFaturaComTransacoesNulas(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> fatura.calcularTotalDaFatura());
    }

}
