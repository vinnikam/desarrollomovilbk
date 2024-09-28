package co.ucentral.bkedgame.controladores;

import co.ucentral.bkedgame.persistencia.entidades.Vehiculo;
import co.ucentral.bkedgame.servicios.VehiculoServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoControlador {
    VehiculoServicio vehiculoServicio;

    @GetMapping("/")
    public List<Vehiculo> obtenerTodos(){
        return  vehiculoServicio.obtenerTodos();
    }
    @PostMapping("/")
    public List<Vehiculo> obtenerTodos1(){
        return  vehiculoServicio.obtenerTodos();
    }
    @PostMapping("/consultar1")
    public List<Vehiculo> obtenerTodos2(){
        return  vehiculoServicio.obtenerTodos();
    }
}
