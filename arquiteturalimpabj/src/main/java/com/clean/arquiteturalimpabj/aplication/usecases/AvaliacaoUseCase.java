package com.clean.arquiteturalimpabj.aplication.usecases;

import java.util.List;

import com.clean.arquiteturalimpabj.aplication.gateways.AvaliacaoGateway;
import com.clean.arquiteturalimpabj.domain.Avaliacao;

public class AvaliacaoUseCase {

    public final AvaliacaoGateway gateway;

    public AvaliacaoUseCase(AvaliacaoGateway gateway) {
        this.gateway = gateway;
    }

    public Avaliacao cadastrarAvaliacao(Avaliacao avaliacao) {
        return gateway.cadastrarAvaliacao(avaliacao);
    }

    public List<Avaliacao> listarAvaliacao() {
        return gateway.listarAvaliacao();
    }

    public Avaliacao finalizarAvaliacao(Integer id) {
        return gateway.finalizarAvaliacao(id);
    }

}
