package com.clean.arquiteturalimpabj.aplication.gateways;

import java.util.List;

import com.clean.arquiteturalimpabj.domain.Categoria;

public interface CategoriaGateway {

    Categoria cadastrarCategoria(Categoria categoria);

    List<Categoria> listaCategoria();

}
