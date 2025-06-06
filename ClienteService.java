package mx.unam.aragon.service.cliente;

import mx.unam.aragon.model.entity.ClienteEntity;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    ClienteEntity registrarCliente(ClienteEntity cliente);
    List<ClienteEntity> obtenerClientes();
    Optional<ClienteEntity> buscarPorCorreoOTelefono(String contacto);
    boolean correoYaRegistrado(String correo);
    boolean telefonoYaRegistrado(String telefono);


}
