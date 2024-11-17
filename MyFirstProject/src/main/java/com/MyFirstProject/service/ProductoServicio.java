package com.MyFirstProject.service;

import com.MyFirstProject.entity.Producto;
import com.MyFirstProject.repos.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {
    @Autowired
    private ProductoRepositorio productoRepositorio;
    public List<Producto> listAll(String palabraClave){
        if(palabraClave != null){
            return productoRepositorio.findAll(palabraClave);
        }
        return productoRepositorio.findAll();
    }

    public void save (Producto producto){
        productoRepositorio.save(producto);
    }

    public Producto get(Long id){
        return productoRepositorio.findById(id).get();
    }

    public void detele (Long id){
        productoRepositorio.deleteById(id);
    }


}
