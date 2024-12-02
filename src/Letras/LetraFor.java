package Letras;
import Letras.Utilitario;

public class LetraFor {
    private int filas;
    private int columnas;

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public LetraFor() {
        while (!Utilitario.teclado.hasNextInt()) {
            System.out.println("Ingrese un numero entero");
            Utilitario.teclado.hasNextLine();
        }
        setColumnas(Utilitario.teclado.nextInt()) ;
        System.out.println("Ingrese la cantidad de filas");
        while (!Utilitario.teclado.hasNextInt()) {
            System.out.println("Ingrese un numero entero");
            Utilitario.teclado.hasNextLine();
        }
        setFilas(Utilitario.teclado.nextInt());
    }

    public void pintar() {
        for (int veces = 1; veces <= 4; veces++) {
            for (int i = 1; i <= filas; i++) {
                for (int j = 1; j <= columnas; j++) {
                    switch (veces) {
                        case 1:
                            pintar_c(j, i);
                            break;
                        case 2:
                            pintar_p(j, i);
                            break;
                        case 3:
                            pintar_c(j, i);
                            break;
                        case 4:
                            pintar_l(j, i);
                            break;
                    }
                    {

                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void pintar_c(int j, int i) {
        if (j == 1 | i == filas | i == 1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    public void pintar_seguido() {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                pintar_c(j, i);
            }
            Separar();
            for (int j = 1; j <= columnas; j++) {
                pintar_c(j, i);
            }
            System.out.println();
        }
    }

    public void pintar_p(int j, int i) {
        if (j == 1 | i == (filas + 2) / 2 | i == 1 | (j == columnas && i <= (filas / 2))) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    public void pintar_l(int j, int i) {
        if (j == 1 | i == filas) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    private void Separar() {
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
        }
    }
}