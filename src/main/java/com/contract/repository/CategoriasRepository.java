package com.contract.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.contract.model.Categoria;

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
	
}
