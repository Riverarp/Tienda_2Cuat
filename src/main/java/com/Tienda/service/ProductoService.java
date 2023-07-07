
package com.Tienda.service;

import com.Tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    //Metodo para consultar las categorias. El parametro define si se muestran solo las activas o todas
    
    public List<Producto> getProductos(boolean activos);
    
    //se obtine una categoria por su id
    public Producto getProducto(Producto producto);
    //insertar:se inserta cunado el id categoria est vacio (valor 0 o null) 
    //modificar: se modi cuando cateegoria no esta vacia
    public void save(Producto producto);
    
    //Se elimina un registro por su Id:
    public void delete(Producto producto);
}