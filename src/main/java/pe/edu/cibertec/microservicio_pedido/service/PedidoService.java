package pe.edu.cibertec.microservicio_pedido.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.microservicio_pedido.model.Cliente;
import pe.edu.cibertec.microservicio_pedido.model.Producto;
import pe.edu.cibertec.microservicio_pedido.model.Repartidor;
import pe.edu.cibertec.microservicio_pedido.remoteservice.ServiceProductoClient;
import pe.edu.cibertec.microservicio_pedido.remoteservice.ServiceRepartidorClient;
import pe.edu.cibertec.microservicio_pedido.remoteservice.ServiceUsuariosClient;

@RequiredArgsConstructor
@Service
public class PedidoService {
    private final ServiceProductoClient serviceProductoClient;
    private final ServiceUsuariosClient serviceUsuariosClient;
    private final ServiceRepartidorClient serviceRepartidorClient;

    public Repartidor obtenerRepartidorXID(int id) {
        return serviceRepartidorClient.obtenerRepartidorXID(id);
    }
    /*public Producto obtenerProductoXID(int id) {
        return serviceProductoClient.obtenerProductoXID(id);
    }*/
    public Cliente obtenerClienteXID(int id) {
        return serviceUsuariosClient.obtenerUsuarioXID(id);
    }
}
