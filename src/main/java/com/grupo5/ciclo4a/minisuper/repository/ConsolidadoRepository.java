package com.grupo5.ciclo4a.minisuper.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grupo5.ciclo4a.minisuper.model.Consolidado;


public interface ConsolidadoRepository  extends MongoRepository<Consolidado, String>{
	
	List<Consolidado> findByCiudad(String ciudad);
}
