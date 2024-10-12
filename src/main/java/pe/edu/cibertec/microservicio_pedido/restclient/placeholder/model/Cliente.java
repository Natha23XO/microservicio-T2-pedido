package pe.edu.cibertec.microservicio_pedido.restclient.placeholder.model;

import lombok.Data;

@Data
public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
}
