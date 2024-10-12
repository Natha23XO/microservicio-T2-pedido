package pe.edu.cibertec.microservicio_pedido.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.cibertec.microservicio_pedido.model.Producto;

@FeignClient(name = "microservicio-producto")
public interface ServiceProductoClient {

    @GetMapping("/api/v1/entorno-test/producto/{id}")
    Producto obtenerProductoXID(@PathVariable("id") int id);
}
