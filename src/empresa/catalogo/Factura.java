package empresa.catalogo;

import empresa.descuento.Descuento;

import java.io.Serializable;
import java.util.ArrayList;

public class Factura implements Serializable {

    private Cliente cliente;
    private ArrayList<Item> detalleFactura;
    private double iva;
    private double descuento;
    private double total;

    public Factura(Cliente cliente, Descuento descuento) {
        this.cliente = cliente;
        this.detalleFactura = cliente.getCarritoDeCompras();

        for (Item item : detalleFactura) {
            total += item.getTotal();
        }
        cliente.vaciarCarrito();
        iva = total * .12;
        this.descuento = descuento.calcular(this);
    }

    public double getTotal() {
        return total;
    }
    public ArrayList<Item> getDetalleFactura() {
        return detalleFactura;
    }

    @Override
    public String toString() {
        return "Cliente:" + cliente +
                "\n\t detalleFactura=" + detalleFactura +
                "\n\t subtotal=" + total +
                "\n\t descuento= " + descuento +
                "\n\t iva=" + iva +
                "\n\t total =" + (total + iva - descuento) +
                '}';
    }


}
