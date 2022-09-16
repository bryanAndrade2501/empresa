package empresa.descuento;

import empresa.catalogo.Factura;
import empresa.catalogo.Item;

import java.util.Collections;

public class Descuento100AlProductoMasCaro extends Descuento {


    @Override
    public double calcular(Factura factura) {
        Item productoMasCaro = Collections.max(factura.getDetalleFactura());
        System.out.println(productoMasCaro);
        return productoMasCaro.getTotal();
    }
}
