// Calculadora en Java que contiene las 4 operaciones básicas (+, -, *, /)
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Creamos la variable que nos permite ingresar datos en la consola
        Scanner consola = new Scanner(System.in);

        while (true){
            System.out.println("***** Aplicación calculadora GusgosDev *****");
            // Mostramos el menu
            mostrarMenu();

            try {
                // Recibimos el número de la opción de operación a realizar
                var operacion = Integer.parseInt(consola.nextLine());

                // Revisar que esté dentro de las opciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    // Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto..");
                    break;
                } else {
                    System.out.println("Opción errónea: Opción " + operacion + " no existe.");
                }
                // Imprimimos un salto antes de repetir el ciclo
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }

    // Función del menú de opciones
    private static void mostrarMenu() {
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.print("Operación a realizar: ");
    }

    private static void ejecutarOperacion(int operador, Scanner consola) {
        System.out.println("Ingresa un valor: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Ingresa otro valor: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;

        switch (operador) {
            case 1 -> { // SUMA
                resultado = operando1 + operando2;
                System.out.println("El resultado de la SUMA es: " + resultado);
            }
            case 2 -> { // RESTA
                resultado = operando1 - operando2;
                System.out.println("El resultado de la RESTA es: " + resultado);
            }
            case 3 -> { // MULTIPLICACION
                resultado = operando1 * operando2;
                System.out.println("El resultado de la MULTIPLICACION es: " + resultado);
            }
            case 4 -> { // DIVISION
                resultado = operando1 / operando2;
                System.out.println("El resultado de la DIVISION es: " + resultado);
            }
            default -> System.out.println("Opción errónea:");
        }
    }
}