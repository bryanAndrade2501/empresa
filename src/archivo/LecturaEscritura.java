package archivo;

import java.io.*;

public class LecturaEscritura<Empresa> {
    private String nombreDeArchivo;

    public LecturaEscritura(String nombreDeArchivo) {
        this.nombreDeArchivo = nombreDeArchivo;
    }

    public void escribirArchivo(Empresa objeto) throws IOException {
        //1. Referencia a un archivo
        File archivo = new File(nombreDeArchivo);
        //2. Definir el flujo de datos hacia el archivo/disco
        FileOutputStream flujoDeEscritura = new FileOutputStream(archivo);
        //3. Definir el manejador de escritura
        ObjectOutputStream manejadorDeEscritura = new ObjectOutputStream(flujoDeEscritura);
        //4. Manipular el archivo: escribir
        manejadorDeEscritura.writeObject(objeto);
        //5. Cerrar archivo
        manejadorDeEscritura.close();
    }

    public Empresa leerArchivo() throws IOException, ClassNotFoundException {
        //1. Referencia a un archivo
        File archivo = new File(nombreDeArchivo);
        //2. Definir el flujo de datos hacia el archivo/disco
        FileInputStream flujoDeEscritura = new FileInputStream(archivo);
        //3. Definir el manejador de lectura
        ObjectInputStream manejadorDeEscritura = new ObjectInputStream(flujoDeEscritura);
        //4. Manipular el archivo: leer
        Empresa objeto = (Empresa) manejadorDeEscritura.readObject();
        //5. Cerrar archivo
        manejadorDeEscritura.close();
        return objeto;
    }
}

