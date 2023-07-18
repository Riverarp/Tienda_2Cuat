
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Metodo para consultar las categorias. El parametro define si se muestran solo las activas o todas
    
    public List<Categoria> getCategorias(boolean activos);
    
    //se obtine una categoria por su id
    public Categoria getCategoria(Categoria categoria);
    //insertar:se inserta cunado el id categoria est vacio (valor 0 o null) 
    //modificar: se modi cuando cateegoria no esta vacia
    public void save(Categoria categoria);
    
    //Se elimina un registro por su Id:
    public void delete(Categoria categoria);
    //ejemplo de metodo apmleado
    public List<Categoria> getPorDescripcion(String descripcion);
}
