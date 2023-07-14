import java.io.*;
import java.security.interfaces.EdECKey;

public class MainPr {
    private static Object MiEstudiante;

    public static void main(String[] args) {
        MiEstudiante registro1 = new MiEstudiante(20201008,1726598988,"Melani Nayeli","Barrera Pilatasig");
        MiEstudiante registro2 = new MiEstudiante(20201081,1713794833,"Brandon Sebastian","Mena Piedra");
        MiEstudiante registro3 = new MiEstudiante(28328334,1278348747,"Monica Del Carmen","Pilatasig Quishpe");
        MiEstudiante registro4 = new MiEstudiante(38743274,423434224,"Maria Olga","Guaman Tixe");
        guardarRegistro(registro1);
        guardarRegistro(registro2);
        guardarRegistro(registro3);
        guardarRegistro(registro4);

        leerRegistros();
    }

    private static void guardarRegistro(MiEstudiante registro1) {
    }

    public static void guardarRegistro(MiEstudiante registro1,MiEstudiante registo2,MiEstudiante registro3, MiEstudiante registro4) {
        try {
            // Crear la salida para el archivo
            FileOutputStream archivoSalida = new FileOutputStream("data.dat", true);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(archivoSalida);

            // Escribir el registro en el archivo
            flujoSalida.writeObject(MiEstudiante);

            // Cerrar
            flujoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerRegistros() {
        try {
            // Crear  entrada para el archivo binary data.dat
            FileInputStream archivoEntrada = new FileInputStream("data.dat");
            ObjectInputStream flujoEntrada = new ObjectInputStream(archivoEntrada);

            // Leer y mostrar los registros del archivo hasta llegar al final
            while (true) {
                Estudent registro = (Estudent) flujoEntrada.readObject();
                System.out.println(registro);
            }
        } catch (EOFException e) {
            // Se alcanzó el final del archivo, terminar la lectura
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

