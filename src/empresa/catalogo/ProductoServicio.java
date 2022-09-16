package empresa.catalogo;

import java.io.Serializable;

public class ProductoServicio implements Serializable {
    private int codigo;
    private String nombre;
    private double precio;

    public ProductoServicio(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + '[' + codigo + ']';
    }
}
