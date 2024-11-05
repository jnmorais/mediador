package org.projetos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {
    @Test
    void deveContratarClube() {
        Clube clubeA = new Clube("Clube A");
        clubeA.setValorContrato(1000000.0);

        Jogador jogador1 = new Jogador("Jogador 1", 800000.0);
        String mensagem = jogador1.contratarClube(clubeA);

        assertEquals("O Clube Clube A oferece um contrato de R$1000000.0 para o jogador Jogador 1", mensagem);
    }

    @Test
    void deveAumentarSalario() {
        Clube clubeA = new Clube("Clube A");
        Jogador jogador1 = new Jogador("Jogador 1", 800000.0);

        String mensagem = jogador1.aumentarSalario(clubeA, 900000.0);

        assertEquals("O Clube Clube A concede um aumento de salário de R$100000.0 para o jogador Jogador 1", mensagem);
        assertEquals(900000.0, jogador1.getSalario(), 0.001);
    }

    @Test
    void deveTransferirJogador() {
        Clube clubeA = new Clube("Clube A");
        Clube clubeB = new Clube("Clube B");
        Jogador jogador1 = new Jogador("Jogador 1", 800000.0);

        String mensagem = jogador1.transferirClube(clubeA, clubeB);

        assertEquals("O jogador Jogador 1 foi transferido do Clube Clube A para o Clube Clube B", mensagem);
    }
}