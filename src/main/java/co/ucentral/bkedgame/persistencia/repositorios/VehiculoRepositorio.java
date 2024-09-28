package co.ucentral.bkedgame.persistencia.repositorios;

import co.ucentral.bkedgame.persistencia.entidades.Vehiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepositorio extends CrudRepository<Vehiculo,Long> {
}
