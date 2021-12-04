package com.grupo5.ciclo4a.minisuper.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grupo5.ciclo4a.minisuper.model.Venta;


public interface VentaRepository extends MongoRepository<Venta, String> {

	List<Venta> findByCodigoventa(Long codigoventa);
	List<Venta> findByCedulacliente(Long cedulacliente);
	
	
	void deleteByCodigoventa(Long codigoventa);
	void deleteByCedulacliente(Long cedulacliente);
	
}
