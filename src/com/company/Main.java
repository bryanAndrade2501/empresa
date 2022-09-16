package com.company;

import archivo.LecturaEscritura;
import empresa.Empresa;
import empresa.catalogo.Cliente;
import empresa.catalogo.Producto;
import empresa.catalogo.ProductoServicio;
import empresa.catalogo.Servicio;
import empresa.descuento.Descuento100AlProductoMasCaro;

import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // write your code here

        /*HashMap<Integer, ProductoServicio> pys = new HashMap<Integer, ProductoServicio>();
        pys.put(1, new Producto(1, "Toalla", 15, 20));
        pys.put(2, new Producto(2, "Agua", 1.60, 200));
        pys.put(5, new Producto(5, "Barra energetica", 6, 200));
        pys.put(6, new Producto(6, "Grano seco", 45, 100));
        pys.put(7, new Servicio(7, "Suscripcion basic", 60));


        Empresa miEmpresa = new Empresa("129820938", "Mi gym", pys);
        {
            miEmpresa.registrarNuevoCliente(new Cliente("124", "Carlos"));
            miEmpresa.registrarNuevoCliente(new Cliente("456", "Ibeth"));
            miEmpresa.registrarNuevoCliente(new Cliente("789", "Daniel"));

        }
        try {
            //miEmpresa.agregarItemACliente("124", 7);
            miEmpresa.agregarItemACliente("456", 1, 4);
            miEmpresa.agregarItemACliente("456", 5);
            miEmpresa.agregarItemACliente("456", 7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //System.out.println(miEmpresa.generarFactura("456",new DescuentoPorcentual(50)));
        System.out.println(miEmpresa.generarFactura("456", new Descuento100AlProductoMasCaro()));
        //System.out.println(miEmpresa.generarFactura("789"));
        System.out.println(miEmpresa.getClientes());
        System.out.println(miEmpresa.getProductos());
        System.out.println(miEmpresa.getFacturas());



        try {
            le.escribirArchivo(miEmpresa);
        } catch (IOException e) {
            e.printStackTrace();
        }
                 */
        LecturaEscritura<Empresa> le = new LecturaEscritura<Empresa>("empresa.data");


        try {
            Empresa miEmpresa = le.leerArchivo();
            System.out.println(miEmpresa.getClientes());
            System.out.println(miEmpresa.getProductos());
            System.out.println(miEmpresa.getFacturas());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
