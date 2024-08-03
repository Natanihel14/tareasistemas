import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();

            LocalTime now = LocalTime.now();
            int hour = now.getHour();

            if (hour < 12) {
                System.out.println("Buenos días, " + nombre);
            } else if (hour < 18) {
                System.out.println("Buenas tardes, " + nombre);
            } else {
                System.out.println("Buenas noches, " + nombre);
            }

            System.out.print("¿Deseas saludar a alguien más? (sí/no): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}