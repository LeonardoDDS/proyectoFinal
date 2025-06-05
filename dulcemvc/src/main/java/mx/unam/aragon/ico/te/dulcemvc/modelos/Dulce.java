package mx.unam.aragon.ico.te.dulcemvc.modelos;

import java.util.Objects;

public class Dulce {
    private int id;
    private String nombre;
    private String clasificacion;
    private int caducidad;
    private String descripcion;
    private String imagen;

    public Dulce() {
    }

    public Dulce(int id, String nombre, String clasificacion, int caducidad, String descripcion, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.caducidad = caducidad;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(int caducidad) {
        this.caducidad = caducidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dulce dulce = (Dulce) o;
        return id == dulce.id && caducidad == dulce.caducidad && Objects.equals(nombre, dulce.nombre) && Objects.equals(clasificacion, dulce.clasificacion) && Objects.equals(descripcion, dulce.descripcion) && Objects.equals(imagen, dulce.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, clasificacion, caducidad, descripcion, imagen);
    }

    @Override
    public String toString() {
        return "Dulce{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", caducidad=" + caducidad +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
