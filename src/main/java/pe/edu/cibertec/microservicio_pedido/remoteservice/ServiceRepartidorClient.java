package pe.edu.cibertec.microservicio_pedido.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.cibertec.microservicio_pedido.model.Repartidor;

@FeignClient(name = "microservicio-usuarios")
public interface ServiceRepartidorClient {

    @GetMapping("/api/v1/repartidor/{id}")
    Repartidor obtenerRepartidorXID(@PathVariable("id") int id);
}