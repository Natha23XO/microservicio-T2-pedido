package pe.edu.cibertec.microservicio_pedido.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.microservicio_pedido.model.Cliente;
import pe.edu.cibertec.microservicio_pedido.model.Pedido;
import pe.edu.cibertec.microservicio_pedido.model.Producto;
import pe.edu.cibertec.microservicio_pedido.model.Repartidor;
import pe.edu.cibertec.microservicio_pedido.remoteservice.ServiceProductoClient;
import pe.edu.cibertec.microservicio_pedido.remoteservice.ServiceRepartidorClient;
import pe.edu.cibertec.microservicio_pedido.remoteservice.ServiceUsuariosClient;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PedidoService {
    private final ServiceProductoClient serviceProductoClient;
    private final ServiceUsuariosClient serviceUsuariosClient;
    private final ServiceRepartidorClient serviceRepartidorClient;
    private final List<Pedido> pedidos = new ArrayList<>();

    @PostConstruct
    private void inicializarPedidos() {
        pedidos.add(new Pedido(1, 1, 2, 2, 2, 50.0, "2024-10-01", "Calle Falsa 123"));
        pedidos.add(new Pedido(2, 1, 3, 3, 1, 25.0, "2024-10-02", "Avenida Siempre Viva 456"));
        pedidos.add(new Pedido(3, 2, 4, 4, 5, 120.0, "2024-10-03", "Plaza Principal 789"));
        pedidos.add(new Pedido(4, 3, 5, 5, 3, 75.0, "2024-10-04", "Calle Mayor 159"));
        pedidos.add(new Pedido(5, 4, 1, 1, 4, 90.0, "2024-10-05", "Boulevard Central 753"));
    }

    /*
    public Repartidor obtenerRepartidorXID(int id) {
        return serviceRepartidorClient.obtenerRepartidorXID(id);
    }
    public Producto obtenerProductoXID(int id) {
        return serviceProductoClient.obtenerProductoXID(id);
    }
    public Cliente obtenerClienteXID(int id) {
        return serviceUsuariosClient.obtenerUsuarioXID(id);
    }*/


    public Pedido obtenerPedido(int id){
        for (Pedido pedido : pedidos) {
            if(pedido.getId() == id){
                return pedido;
            }
        }
        return null;
    }
    public String informacionPedido(int idPedido){
        Pedido pedido = obtenerPedido(idPedido);
        Cliente cliente = serviceUsuariosClient.obtenerUsuarioXID(pedido.getIdCliente());
        Repartidor repartidor = serviceRepartidorClient.obtenerRepartidorXID(pedido.getIdRepartidor());
        Producto producto = serviceProductoClient.obtenerProductoXID(pedido.getIdProducto());
        return "Pedido: " + pedido.getId() + "\n" +
                "Cliente: " + cliente.getNombre() + "\n" +
                "Repartidor: " + repartidor.getNombre() + "\n" +
                "Producto: " + producto.getNombre() + "\n" +
                "Precio: " + pedido.getTotal() + "\n" +
                "Fecha: " + pedido.getFecha() + "\n" +
                "Dirección: " + pedido.getDireccion_entrega();
    }

}
