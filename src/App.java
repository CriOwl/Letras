import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ingreso = new Scanner(System.in);
        LetraFor iniciales = new LetraFor();
        System.out.println("Ingrese la cantidad de columnas");
        iniciales.columnas = ingreso.nextInt();
        System.out.println("Ingrese la cantidad de filas");
        iniciales.filas = ingreso.nextInt();
        iniciales.pintar();
        iniciales.pintar_seguido();
    }
}
