package com.fernandojr.junit.utilidade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static com.fernandojr.junit.utilidade.SaudacaoUtil.saudar;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Teste no utilitário de saudação")
class SaudacaoUtilTest {

    @Test
    @DisplayName("Deve saudar com bom dia")
    public void saudarComBomDia() {
        //Arrange - Variaveis que precisa preparar para executar seu cenário de teste
        int horaValida = 9;

        //Act -Executando o cenário
        String saudacao = saudar(horaValida);

        //Assert - Asserções para verificar, validar se o cenário está correto ou não com o que se epsera
        assertEquals("Bom dia", saudacao);
    }

    @Test
    @DisplayName("Deve saudar com bom dia as 5 horas")
    public void saudarComBomDiaAPartir5h() {
        int horaValida = 5;
        String saudacao = saudar(horaValida);
        assertEquals("Bom dia", saudacao);
    }

    @Test
    @DisplayName("Deve saudar com boa tarde")
    public void saudarComBoaTarde() {
        int horaValida = 15;
        String saudacao = saudar(horaValida);
        assertEquals("Boa tarde", saudacao);
    }

    @Test
    @DisplayName("Deve saudar com boa noite")
    public void saudarComBoaNoite() {
        int horaValida = 22;
        String saudacao = saudar(horaValida);
        assertEquals("Boa noite", saudacao);
    }

    @Test
    @DisplayName("Deve saudar com boa noite as 4 horas")
    public void saudarComBoaNoiteAs4h() {
        int horaValida = 4;
        String saudacao = saudar(horaValida);
        assertEquals("Boa noite", saudacao);
    }

    @Test
    @DisplayName("Deve Lançar uma exceção")
    public void deveLancarException() {
        int horaInvalida = -10;
        Executable chamadaInvalidaDeMetodo = () -> saudar(horaInvalida);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, chamadaInvalidaDeMetodo);
        assertEquals("Hora inválida", e.getMessage());
    }

    @Test
    @DisplayName("Não deve Lançar uma exceção")
    public void naoDeveLancarException() {
        int horaValida = 0;
        Executable chamadaValidaDeMetodo = () -> saudar(horaValida);
        assertDoesNotThrow(()-> chamadaValidaDeMetodo);
    }


}