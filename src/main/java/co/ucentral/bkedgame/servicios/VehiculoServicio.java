package co.ucentral.bkedgame.servicios;

import co.ucentral.bkedgame.persistencia.entidades.Vehiculo;
import co.ucentral.bkedgame.persistencia.repositorios.VehiculoRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VehiculoServicio {

    VehiculoRepositorio vehiculoRepositorio;

    public List<Vehiculo> obtenerTodos(){
        return (List<Vehiculo>)vehiculoRepositorio.findAll();
    }
}
