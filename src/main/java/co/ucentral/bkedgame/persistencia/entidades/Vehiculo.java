package co.ucentral.bkedgame.persistencia.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehiculos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {

    @Id
    private long codigo;
    private String placa;

    private int modelo;
}
