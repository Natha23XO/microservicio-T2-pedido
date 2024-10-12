package pe.edu.cibertec.microservicio_pedido.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.microservicio_pedido.model.Producto;
import pe.edu.cibertec.microservicio_pedido.service.PedidoService;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/pedido")
public class PedidoController {
    private final PedidoService pedidoService;

    @GetMapping("/{id}")
    public String obtenerInformacionDePedido(@PathVariable int id) {
        return pedidoService.informacionPedido(id);
    }

}
