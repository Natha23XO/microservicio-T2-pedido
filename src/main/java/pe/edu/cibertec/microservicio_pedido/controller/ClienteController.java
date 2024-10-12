package pe.edu.cibertec.microservicio_pedido.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.microservicio_pedido.model.Cliente;
import pe.edu.cibertec.microservicio_pedido.service.PedidoService;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/cliente")
public class ClienteController {
    private final PedidoService pedidoService;

    @GetMapping("/{id}")
    public Cliente obtenerClienteXID(@PathVariable int id) {
        return pedidoService.obtenerClienteXID(id);
    }
}