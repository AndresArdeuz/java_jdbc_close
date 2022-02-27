package org.figueroa.java.jdbc;

import org.figueroa.java.jdbc.modelo.Categoria;
import org.figueroa.java.jdbc.modelo.Producto;
import org.figueroa.java.jdbc.repositorio.ProductoRepositorioImplements;
import org.figueroa.java.jdbc.repositorio.Repositorio;
import org.figueroa.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemplojdbcActualizar {
    public static void main(String[] args) {



            Repositorio<Producto> repositorio = new ProductoRepositorioImplements();
            System.out.println("========LISTAR=======");
            repositorio.listar().forEach(System.out::println);
            System.out.println("========LISTAR por ID=======");

            System.out.println(repositorio.porId(6L));
            System.out.println("========editar nuevo producto=======");
            Producto producto = new Producto();

            producto.setId(13L);
            producto.setNombre("televisor grande");
            producto.setPrecio(50000);
            Categoria categoria = new Categoria();
            categoria.setId(1L);

            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("producto actualizado");
            repositorio.listar().forEach(System.out::println);



    }
}