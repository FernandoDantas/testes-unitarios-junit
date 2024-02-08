package com.fernandojr.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void assercaoAgrupada(){
        Pessoa pessoa = new Pessoa("Fernando", "Dantas");
        assertAll("Asserções de pessoa",
                ()-> assertEquals("Fernando", pessoa.getNome()),
                ()-> assertEquals("Dantas", pessoa.getSobrenome())
                );
    }
}