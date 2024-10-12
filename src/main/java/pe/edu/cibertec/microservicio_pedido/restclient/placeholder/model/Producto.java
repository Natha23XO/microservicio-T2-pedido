package pe.edu.cibertec.microservicio_pedido.restclient.placeholder.model;

import lombok.Data;

@Data
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
}
