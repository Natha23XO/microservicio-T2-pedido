package pe.edu.cibertec.microservicio_pedido.remoteservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.cibertec.microservicio_pedido.model.Cliente;

@FeignClient(name = "microservicio-usuarios")
public interface ServiceUsuariosClient {

    @GetMapping("/api/v1/usuario/{id}")
    Cliente obtenerUsuarioXID(@PathVariable("id") int id);
}
