package empresa.descuento;

import empresa.catalogo.Factura;

public abstract class Descuento {

    public abstract double calcular(Factura factura);
}
