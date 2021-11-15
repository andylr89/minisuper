package com.grupo5.ciclo4a.minisuper.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.grupo5.ciclo4a.minisuper.model.*;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

	List<Usuario> findByUsername(String username);
	List<Usuario> findByNombrecompleto(String nombrecompleto);
	
	
}
