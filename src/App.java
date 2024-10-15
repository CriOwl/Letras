import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ingreso = new Scanner(System.in);
        Letra iniciales = new Letra();
        System.out.println("Ingrese la cantidad de columnas");
        iniciales.columnas = ingreso.nextInt();
        System.out.println("Ingrese la cantidad de filas");
        iniciales.filas = ingreso.nextInt();
        iniciales.pintar();
        iniciales.pintar_seguido();
        LetraDoWhile iniciales_alrevez = new LetraDoWhile();
        System.out.println("Ingrese la cantidad de columnas");
        iniciales_alrevez.columnas = ingreso.nextInt();
        System.out.println("Ingrese la cantidad de filas");
        iniciales_alrevez.filas = ingreso.nextInt();
        iniciales_alrevez.pintar();
        iniciales_alrevez.pintar_seguido();
        LetraWhile iniciales_2 = new LetraWhile();
        System.out.println("Ingrese la cantidad de columnas");
        iniciales_2.columnas = ingreso.nextInt();
        System.out.println("Ingrese la cantidad de filas");
        iniciales_2.filas = ingreso.nextInt();
        iniciales_2.pintar();
        iniciales_2.pintar_seguido();
    }
}
