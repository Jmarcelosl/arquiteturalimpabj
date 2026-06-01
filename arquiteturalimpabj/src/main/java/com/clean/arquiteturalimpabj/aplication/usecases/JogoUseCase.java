package com.clean.arquiteturalimpabj.aplication.usecases;

import java.util.List;

import com.clean.arquiteturalimpabj.aplication.gateways.JogoGateway;
import com.clean.arquiteturalimpabj.domain.Jogo;

public class JogoUseCase {

    public final JogoGateway gateway;

    public JogoUseCase(JogoGateway gateway) {
        this.gateway = gateway;
    }

    public Jogo createJogo(Jogo jogo) {
        return gateway.cadastrarJogo(jogo);
    }

    public List<Jogo> listaJogos() {
        return gateway.listarJogo();
    }

}