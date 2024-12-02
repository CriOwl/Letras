package Letras;

public class LetraWhile {
    private int filas;
    private int columnas;
    private int veces = 1;

    public LetraWhile() {
        System.out.println("Ingrese la cantidad de columnas");
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
        pintar();
        pintar_seguido();
    }

    private void pintar() {
        while (veces <= 4) {
            int i = 1;
            while (i <= filas) {
                int j = 1;
                while (j <= columnas) {
                    switch (veces) {
                        case 1:
                            pintar_p(j, i);
                            break;
                        case 2:
                            pintar_c(j, i);
                            break;
                        case 3:
                            pintar_l(j, i);
                            break;
                        case 4:
                            pintar_c(j, i);
                            break;
                    }
                    j++;
                }
                i++;
                System.out.println();
            }
            veces++;
            System.out.println();
        }
    }

    private void pintar_c(int j, int i) {
        if (j == 1 | i == filas | i == 1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    private void pintar_seguido() {
        int i = 1;
        while (i <= filas) {
            int j = 1;
            while (j <= columnas) {
                pintar_c(j, i);
                j++;
            }
            Separar();
            int h = 1;
            while (h <= columnas) {
                pintar_c(h, i);
                h++;
            }
            i++;
            System.out.println();
        }

    }

    private void pintar_p(int j, int i) {
        if (j == 1 | i == (filas + 2) / 2 | i == 1 | (j == columnas && i <= (filas / 2))) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    private void pintar_l(int j, int i) {
        if (j == 1 | i == filas) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    private void Separar() {
        System.out.print("   ");
    }

    private void setFilas(int filas) {
        this.filas = filas;
    }

    private void setColumnas(int columnas) {
        this.columnas = columnas;
    }
}