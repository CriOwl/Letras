
public class LetraWhile {
    public int filas;
    public int columnas;
    public void Letra() {
    }
    public void pintar() {
        for (int veces = 0; veces < 3; veces++) {
            for (int i = 1; i <= filas; i++) {
                for (int j = 1; j <= columnas; j++) {
                    if(veces<1){
                        pintar_c(j, i);
                    }else{
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
                pintar_p(j, i);
            }
            Separar();
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

    private void Separar() {
        for (int i = 0; i < 2; i++) {
            System.out.print(" ");
        }
    }
}