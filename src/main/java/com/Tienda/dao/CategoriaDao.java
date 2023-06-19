
package com.Tienda.dao;
import com.Tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    //mas adelante vamos a crear metodos ampliados
}
