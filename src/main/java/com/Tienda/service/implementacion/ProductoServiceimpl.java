
package com.Tienda.service.implementacion;

import com.Tienda.dao.ProductoDao;
import com.Tienda.domain.Producto;
import com.Tienda.service.ProductoService;
import java.security.spec.NamedParameterSpec;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //siempre poner esta notacion,es quien tiene la logica
public class ProductoServiceimpl implements ProductoService{
    
    
    
    @Autowired 
    ProductoDao productoDao;
    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos(boolean activos) {
       List<Producto> productos= productoDao.findAll();
      
       if(activos){
         productos.removeIf(e -> !e.isActivo());
       }
       
       return productos;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup) {
        return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
    }

     @Override
    @Transactional(readOnly=true)    
    public List<Producto> metodoJPQL(double precioInf, double precioSup) {
        return productoDao.metodoJPQL(precioInf, precioSup);
    }
     @Override
    @Transactional(readOnly=true)    
    public List<Producto> metodoNativo(double precioInf, double precioSup) {
        return productoDao.metodoNativo(precioInf, precioSup);
    }

}
