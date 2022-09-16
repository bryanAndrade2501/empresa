package empresa.descuento;

import empresa.catalogo.Factura;

public class DescuentoPorcentual extends Descuento {
    private double porcentaje;

    public DescuentoPorcentual(double porcentaje) {
        super();
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcular(Factura factura) {
        return factura.getTotal() * (porcentaje / 100);
    }
}
