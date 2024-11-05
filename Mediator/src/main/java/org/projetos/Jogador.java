package org.projetos;

public class Jogador {
    private String nome;
    private double salario;

    public Jogador(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String contratarClube(Empresario empresario) {
        return empresario.negociarContrato(this);
    }

    public String aumentarSalario(Empresario empresario, double novoSalario) {
        String mensagem = empresario.negocarAumentoSalario(this, novoSalario);
        this.salario = novoSalario;
        return mensagem;
    }

    public String transferirClube(Empresario empresario, Clube novoClube) {
        return empresario.negociarTransferencia(this, novoClube);
    }
}

