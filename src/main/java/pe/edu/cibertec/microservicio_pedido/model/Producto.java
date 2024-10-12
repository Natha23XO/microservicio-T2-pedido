package pe.edu.cibertec.microservicio_pedido.model;

import lombok.Data;

@Data
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    public Producto(int id, int stock, double precio, String descripcion, String nombre) {
        this.id = id;
        this.stock = stock;
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
}
