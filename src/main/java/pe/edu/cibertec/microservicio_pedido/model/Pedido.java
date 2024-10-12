package pe.edu.cibertec.microservicio_pedido.model;

import lombok.Data;

@Data
public class Pedido {
    private int id;
    private int idCliente;
    private int idProducto;
    private int idRepartidor;
    private int cantidad;
    private double total;
    private String fecha;
    private String direccion_entrega;

    public Pedido(int id, int idCliente, int idProducto, int idRepartidor, int cantidad, double total, String fecha, String direccion_entrega) {
        this.id = id;
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.idRepartidor = idRepartidor;
        this.cantidad = cantidad;
        this.total = total;
        this.fecha = fecha;
        this.direccion_entrega = direccion_entrega;
    }
}
