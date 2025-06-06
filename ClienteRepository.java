package mx.unam.aragon.repository;

import mx.unam.aragon.model.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<ClienteEntity,Long> {
    Optional<ClienteEntity> findByTelefonoIgnoreCaseOrCorreoIgnoreCase(String telefono, String correo);
    ClienteEntity findByCorreo(String correo);
    boolean existsByCorreoIgnoreCase(String correo);
    boolean existsByTelefono(String telefono);
    List<ClienteEntity> findByNombreContainingIgnoreCase(String nombre);
}
