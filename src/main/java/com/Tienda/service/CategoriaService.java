
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Metodo para consultar las categorias. El parametro define si se muestran solo las activas o todas
    
    public List<Categoria> getCategorias(boolean activos);
    
}
