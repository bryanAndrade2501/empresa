package empresa.catalogo;

import java.io.Serializable;

public class Item implements Comparable<Item>, Serializable {
    private ProductoServicio producto;
    private int cantidad;
    private double total;

    public Item(ProductoServicio producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = cantidad * producto.getPrecio();
    }

    public double getTotal() {
        return total;
    }

    public ProductoServicio getProductoServicio() {
        return producto;
    }

    @Override
    public String toString() {
        return "\n\t\t" + producto + " | " + cantidad + " | " + total;
    }

    @Override
    public int compareTo(Item otroItem) {
        return Double.compare(this.producto.getPrecio(), otroItem.producto.getPrecio());
    }
}