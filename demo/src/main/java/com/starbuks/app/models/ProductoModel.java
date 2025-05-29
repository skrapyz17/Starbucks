package com.starbuks.app.models;

import org.springframework.stereotype.Service;

import com.starbuks.app.entitys.bean.Categoria;
import com.starbuks.app.entitys.bean.Producto;
import com.starbuks.app.persistence.ProductoRepository;
import com.starbuks.app.usecase.ProductoUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoModel implements ProductoUseCase {

    private final ProductoRepository _productoRepository;

}
