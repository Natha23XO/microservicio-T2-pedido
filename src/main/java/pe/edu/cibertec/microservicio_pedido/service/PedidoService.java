package pe.edu.cibertec.microservicio_pedido.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.microservicio_pedido.model.Producto;
import pe.edu.cibertec.microservicio_pedido.remoteservice.ServiceProductoClient;

@RequiredArgsConstructor
@Service
public class PedidoService {
    private final ServiceProductoClient serviceProductoClient;

    /*public Producto obtenerProductoXID(int id) {
        return serviceProductoClient.obtenerProductoXID(id);
    }*/

}
