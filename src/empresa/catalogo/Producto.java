package empresa.catalogo;

public class Producto extends ProductoServicio {
    private int existencia;

    public Producto(int codigo, String nombre, double precio, int existencia) {
        super(codigo, nombre, precio);
        this.existencia = existencia;
    }

    public int getExistencia() {
        return existencia;
    }

    public void restarExistencia(int cantidad) {
        this.existencia -= cantidad;
    }
}
