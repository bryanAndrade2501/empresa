package empresa;

import empresa.catalogo.Cliente;
import empresa.catalogo.Factura;
import empresa.catalogo.Producto;
import empresa.catalogo.ProductoServicio;
import empresa.descuento.Descuento;
import empresa.descuento.DescuentoCero;

import java.io.Serializable;
import java.util.HashMap;

public class Empresa implements Serializable {
    private String ruc;
    private String nombre;
    private HashMap<Integer, ProductoServicio> productos;
    private HashMap<String, Cliente> clientes;
    private HashMap<Integer, Factura> facturas;
    private int numeroFactura;


    public Empresa(String ruc, String nombre, HashMap<Integer, ProductoServicio> productos) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.productos = productos;
        this.numeroFactura = 1;
        this.clientes = new HashMap<String, Cliente>();
        this.facturas = new HashMap<Integer, Factura>();
    }

    public void registrarNuevoCliente(Cliente cliente) {
        this.clientes.put(cliente.getIdentificador(), cliente);
    }

    public void agregarItemACliente(String identificadorDeCliente, int codigoDeProducto) throws Exception {
        agregarItemACliente(identificadorDeCliente, codigoDeProducto, 1);
    }

    public void agregarItemACliente(String identificadorDeCliente, int codigoDeProducto, int cantidad) throws Exception {
        Cliente cliente = clientes.get(identificadorDeCliente);
        ProductoServicio pos = productos.get(codigoDeProducto);
        if (pos instanceof Producto) {
            if (((Producto) pos).getExistencia() >= cantidad) {
                //Reducir la existencia del producto
                ((Producto) pos).restarExistencia(cantidad);
            } else {
                //Lanzar un error sobre existencias
                throw new Exception("El producto " + pos.getNombre() + " no tiene existencia de " + cantidad);
            }
        }
        cliente.agregarItemACarrito(pos, cantidad);
    }

    public String generarFactura(String identificadorDeCliente) {
        return generarFactura(identificadorDeCliente, new DescuentoCero());
    }

    public String generarFactura(String identificadorDeCliente, Descuento descuento) {
        Cliente cliente = clientes.get(identificadorDeCliente);
        Factura factura = new Factura(cliente, descuento);

        facturas.put(numeroFactura++, factura);
        return "Factura{\n" +
                nombre + "(" + ruc + ") \n"
                + factura;
    }

    public HashMap<Integer, ProductoServicio> getProductos() {
        return productos;
    }

    public HashMap<Integer, Factura> getFacturas() {
        return facturas;
    }

    public HashMap<String, Cliente> getClientes() {
        return clientes;
    }
}




