package org.projetos;

public class Clube implements Empresario {
    private String nomeClube;
    private double valorContrato;

    public Clube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    @Override
    public String negociarContrato(Jogador jogador) {
        return "O Clube " + nomeClube + " oferece um contrato de R$" + valorContrato + " para o jogador " + jogador.getNome();
    }

    @Override
    public String negocarAumentoSalario(Jogador jogador, double novoSalario) {
        return "O Clube " + nomeClube + " concede um aumento de salário de R$" + (novoSalario - jogador.getSalario()) + " para o jogador " + jogador.getNome();
    }

    @Override
    public String negociarTransferencia(Jogador jogador, Clube novoClube) {
        return "O jogador " + jogador.getNome() + " foi transferido do Clube " + this.nomeClube + " para o Clube " + novoClube.nomeClube;
    }
}

