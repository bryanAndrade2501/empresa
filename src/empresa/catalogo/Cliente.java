package empresa.catalogo;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable {


    private String identificador;
    private String nombre;
    private ArrayList<Item> carritoDeCompra;

    public Cliente(String identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.carritoDeCompra = new ArrayList<Item>();
    }

    public String getIdentificador() {
        return identificador;
    }

    public void agregarItemACarrito(ProductoServicio pos, int cantidad) {
        carritoDeCompra.add(new Item(pos, cantidad));
    }

    public ArrayList<Item> getCarritoDeCompras() {
        return carritoDeCompra;
    }

    public void vaciarCarrito() {
        this.carritoDeCompra = new ArrayList<Item>();
    }

    @Override
    public String toString() {
        return nombre + '(' + identificador + ')';
    }
}