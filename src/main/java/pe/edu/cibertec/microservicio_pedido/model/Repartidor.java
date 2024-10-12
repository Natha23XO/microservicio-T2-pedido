package pe.edu.cibertec.microservicio_pedido.model;

import lombok.Data;

@Data
public class Repartidor {
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
    private int horas_laborales;
    private String turno;

    public Repartidor(int id, String nombre, String apellido, String dni, String telefono, String email, int horas_laborales, String turno) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.horas_laborales = horas_laborales;
        this.turno = turno;
    }

}
