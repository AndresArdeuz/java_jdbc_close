package org.figueroa.java.jdbc;

import org.figueroa.java.jdbc.modelo.Producto;
import org.figueroa.java.jdbc.repositorio.ProductoRepositorioImplements;
import org.figueroa.java.jdbc.repositorio.Repositorio;
import org.figueroa.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemplojdbcDelete {
    public static void main(String[] args) {



            Repositorio<Producto> repositorio = new ProductoRepositorioImplements();
            System.out.println("========LISTAR=======");
            repositorio.listar().forEach(System.out::println);
            System.out.println("========LISTAR por ID=======");

            System.out.println(repositorio.porId(1L));
            System.out.println("========eliminar  producto=======");

            repositorio.eliminar(6L);
            System.out.println("producto actualizado");
            repositorio.listar().forEach(System.out::println);



    }
}