package Letras;

public class LetraDoWhile {
    private int filas;
    private int columnas;
    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    private int veces = 1;

    private LetraDoWhile() {
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
        do {
            int i = 1;
            do {
                int j = 1;
                do {
                    switch (veces) {
                        case 1:
                            pintar_l(j, i);
                            break;
                        case 2:
                            pintar_c(j, i);
                            break;
                        case 3:
                            pintar_p(j, i);
                            break;
                        case 4:
                            pintar_c(j, i);
                            break;
                    }
                    j++;
                } while (j <= columnas);
                i++;
                System.out.println();
            } while (i <= filas);
            veces++;
            System.out.println();
        } while (veces <= 4);
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
        do {
            int j = 1;
            do {
                pintar_c(j, i);
                j++;
            } while (j <= columnas);
            Separar();
            int h = 1;
            do {
                pintar_c(h, i);
                h++;
            } while (h <= columnas);
            i++;
            System.out.println();
        } while (i <= filas);

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
}