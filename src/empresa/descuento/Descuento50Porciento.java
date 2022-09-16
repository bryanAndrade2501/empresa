package empresa.descuento;

import empresa.catalogo.Factura;

public class Descuento50Porciento extends Descuento {
    @Override
    public double calcular(Factura factura) {
        return factura.getTotal() * .5;
    }
}
