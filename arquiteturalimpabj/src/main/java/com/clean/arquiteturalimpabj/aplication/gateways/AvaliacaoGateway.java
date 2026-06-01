package com.clean.arquiteturalimpabj.aplication.gateways;

import java.util.List;

import com.clean.arquiteturalimpabj.domain.Avaliacao;

public interface AvaliacaoGateway {

    Avaliacao cadastrarAvaliacao(Avaliacao avaliacao);

    List<Avaliacao> listaAvaliacao();

    Avaliacao finalizarAvaliacao(Integer id);
}
