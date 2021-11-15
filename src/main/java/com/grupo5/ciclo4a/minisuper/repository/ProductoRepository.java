package com.grupo5.ciclo4a.minisuper.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.grupo5.ciclo4a.minisuper.model.Producto;

public class ProductoRepository extends MongoRepository<Producto, String> {
	
	List<Producto> findByCodigoproducto (Long codigoproducto);
	
	List<Producto> findByNombreproducto (String nombreproducto);
	

}
