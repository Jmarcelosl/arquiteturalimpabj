package com.clean.arquiteturalimpabj.aplication.gateways;

import java.util.List;

import com.clean.arquiteturalimpabj.domain.Jogo;

public interface JogoGateway {

    Jogo cadastrarJogo(Jogo jogo);

    List<Jogo> listaJogo();
}
