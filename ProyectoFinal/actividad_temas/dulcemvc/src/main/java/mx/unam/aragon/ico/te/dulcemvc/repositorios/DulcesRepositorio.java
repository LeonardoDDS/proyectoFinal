package mx.unam.aragon.ico.te.dulcemvc.repositorios;

import mx.unam.aragon.ico.te.dulcemvc.modelos.Dulce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DulcesRepositorio extends JpaRepository<Dulce, Integer> {

}
