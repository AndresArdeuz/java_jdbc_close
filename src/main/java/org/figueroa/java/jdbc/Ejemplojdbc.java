package org.figueroa.java.jdbc;

import org.figueroa.java.jdbc.modelo.Categoria;
import org.figueroa.java.jdbc.modelo.Producto;
import org.figueroa.java.jdbc.repositorio.ProductoRepositorioImplements;
import org.figueroa.java.jdbc.repositorio.Repositorio;
import org.figueroa.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Comparator;
import java.util.Date;

public class Ejemplojdbc {
    public static void main(String[] args) {



            Repositorio<Producto> repositorio = new ProductoRepositorioImplements();
            System.out.println("========LISTAR=======");
            repositorio.listar().forEach(System.out::println);
            System.out.println("========LISTAR por ID=======");

            System.out.println(repositorio.porId(1L));
            System.out.println("========insertar nuevo producto=======");
            Producto producto = new Producto();
            producto.setNombre("Teclado bonito");
            producto.setPrecio(300);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(1L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            repositorio.listar().stream().sorted(Comparator.comparing(Producto::getId)).forEach(System.out::println);





    }
}