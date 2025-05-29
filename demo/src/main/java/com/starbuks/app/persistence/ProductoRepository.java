package com.starbuks.app.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starbuks.app.entitys.bean.Categoria;
import com.starbuks.app.entitys.bean.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	long countByCategoriaId(Categoria categoriaId);
}
