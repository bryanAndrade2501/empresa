package empresa.descuento;

import empresa.catalogo.Factura;

public class DescuentoCero extends Descuento {
    @Override
    public double calcular(Factura factura) {
        return 0;
    }
}
