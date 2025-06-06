package mx.unam.aragon.ico.te.dulcemvc.servicios;

import mx.unam.aragon.ico.te.dulcemvc.modelos.Dulce;
import mx.unam.aragon.ico.te.dulcemvc.repositorios.DulcesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DulceServices {
    @Autowired
    private DulcesRepositorio dulcesRepositorio;

    public boolean guardarDulce(Dulce dulce){
        Dulce result = dulcesRepositorio.save(dulce);
        return result!=null;
    }
}
