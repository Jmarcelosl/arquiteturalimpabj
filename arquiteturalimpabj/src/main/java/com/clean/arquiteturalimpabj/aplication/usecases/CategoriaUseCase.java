package com.clean.arquiteturalimpabj.aplication.usecases;

import java.util.List;

import com.clean.arquiteturalimpabj.aplication.gateways.CategoriaGateway;
import com.clean.arquiteturalimpabj.domain.Categoria;

public class CategoriaUseCase {

    public final CategoriaGateway gateway;

    public CategoriaUseCase(CategoriaGateway gateway) {
        this.gateway = gateway;
    }

    public Categoria createCategoria(Categoria categoria) {
        return gateway.cadastrarCategoria(categoria);
    }

    public List<Categoria> listaCategorias() {
        return gateway.listarCategoria();
    }

}
