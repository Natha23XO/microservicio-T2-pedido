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
}
