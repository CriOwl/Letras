
public class Bonus {
    public int filas;
    public int columnas;

    public void Letra() {
    }

    public void pintar() {
        for (int veces = 0; veces < 3; veces++) {
            for (int i = 1; i <= filas; i++) {
                for (int j = 1; j <= columnas; j++) {
                    if (veces < 1) {
                        pintar_c(j, i);
                    } else {
                        pintar_p(j, i);
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
                pintar_r(j, i);
            }
            Separar();
            for (int j = 1; j <= columnas; j++) {
                pintar_i(j, i);
            }
            Separar();
            for (int j = 1; j <= columnas; j++) {
                pintar_s(j, i);
            }
            Separar();
            for (int j = 1; j <= columnas; j++) {
                pintar_c(j, i);
            }
            Separar();
            for (int j = 1; j <= columnas; j++) {
                pintar_c(j, i);
            }
            Separar();
            for (int j = 1; j <= columnas; j++) {
                pintar_m(j, i);
            }
            Separar();
            for (int j = 1; j <= columnas; j++) {
                pintar_r(j, i);
            }
            Separar();
            for (int j = 1; j <= columnas; j++) {
                pintar_h(j, i);
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

    public void pintar_j(int j, int i) {
        if (i == 1 | j == (columnas + 1) / 2 | (i == filas && j <= (columnas / 2))) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    public void pintar_s(int j, int i) {
        if (i == 1 | (j == 1 && i <= (filas / 2)) | i == (filas + 1) / 2 | (j == columnas && i >= ((filas + 1) / 2))
                | i == filas) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    public void pintar_m(int j, int i) {
        if (j == 1 | j == (columnas - 1) | ((j == i | j == columnas - i) && i <= ((filas + 1) / 2))) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    public void pintar_r(int j, int i) {
        if (j == 1 | ((i == (filas + 2)/2|| i == 1) && j <= (columnas / 2))  | (j == (columnas/2) && i <= (filas / 2)) | j == i - ((filas + 1) / 2)) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    public void pintar_h(int j, int i) {
        if (j==1|j==columnas|i==(filas/2)) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    public void pintar_i(int j, int i) {
        if (i==1|j==(columnas/2)|i==filas) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    public void pintar_t(int j, int i) {
        if (i==(filas/2)|j==(columnas/2)|i==filas) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }

    private void Separar() {
        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
        }
    }
}