package org.projetos;

public interface Empresario {
    String negociarContrato(Jogador jogador);
    String negocarAumentoSalario(Jogador jogador, double novoSalario);
    String negociarTransferencia(Jogador jogador, Clube novoClube);
}