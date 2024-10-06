package claseCalcu;

import interfaz.LOGIN;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase que contiene el método principal para iniciar la aplicación
 * y métodos relacionados con el cálculo del interés simple.
 */
public class Calculadora {

    /**
     * Método principal que inicia la ventana del login.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LOGIN(); // Crea e inicia la ventana del login
        });
    }

    /**
     * Calcula el interés simple basado en el monto inicial, tasa de interés,
     * tiempo y los tipos de interés y tiempo seleccionados.
     * 
     * @param montoInicial El monto inicial.
     * @param tasaInteres La tasa de interés.
     * @param tiempo El tiempo en años o meses, según el tipo de tiempo.
     * @param tipoInteres El tipo de interés ("mensual" o "anual").
     * @param tipoTiempo El tipo de tiempo ("años" o "meses").
     * @return El interés simple calculado.
     */
    public static double calcularInteresSimple(double montoInicial, double tasaInteres, int tiempo, String tipoInteres, String tipoTiempo) {
        if (tipoInteres.equals("mensual") && tipoTiempo.equals("años")) {
            tiempo = tiempo * 12; // convertir años a meses
        } else if (tipoInteres.equals("anual") && tipoTiempo.equals("meses")) {
            tiempo = tiempo / 12; // convertir meses a años
        }
        
        return montoInicial * tasaInteres * tiempo;
    }

    /**
     * Guarda la información de la transacción en un archivo de texto.
     * 
     * @param prestamista El nombre del prestamista.
     * @param cliente El nombre del cliente.
     * @param montoInicial El monto inicial.
     * @param tasaInteres La tasa de interés.
     * @param tipoInteres El tipo de interés ("mensual" o "anual").
     * @param tiempo El tiempo en años o meses, según el tipo de tiempo.
     * @param tipoTiempo El tipo de tiempo ("años" o "meses").
     * @param interesSimple El interés simple calculado.
     * 
     * @throws IOException Si ocurre un error durante la escritura en el archivo.
     */
    public static void guardarTxt(String prestamista, String cliente, double montoInicial, double tasaInteres, String tipoInteres, int tiempo, String tipoTiempo, double interesSimple) {
        String archivo = "DATOS DEL CLIENTE " + cliente + ".txt";
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escribir); 
            buffer.write("Prestamista: " + prestamista);
            buffer.newLine();
            buffer.write("Cliente: " + cliente);
            buffer.newLine();
            buffer.write("Monto Inicial: " + montoInicial);
            buffer.newLine();
            buffer.write("Tasa de Interés: " + tasaInteres + " " + tipoInteres);
            buffer.newLine();
            buffer.write("Tiempo: " + tiempo + " " + tipoTiempo);
            buffer.newLine();
            buffer.write("Interés Simple Calculado: " + interesSimple);
            buffer.newLine();
            buffer.write("----------------------------");
            buffer.newLine();
            buffer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}   


