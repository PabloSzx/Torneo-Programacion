import java.util.Scanner;

class Partido {
  private int quienParte;
  private int puntos;
  private int rachasJota;
  private int rachasNelman;
  private int puntosJota = 0;
  private int puntosNelman = 0;
  public Partido(int puntos, int quienParte, int rachasJota, int rachasNelman) {
    this.quienParte = quienParte;
    this.puntos = puntos;
    this.rachasJota = rachasJota;
    this.rachasNelman = rachasNelman;
  }

  public int quienGana() {
    int i = 0;
    while (puntosJota < puntos && puntosNelman < puntos) {
      if (quienParte == 1) {
        if (rachasJota == 0) {
          puntosNelman += 1;
        } else {
          i = 0;
          while (i < (rachasJota)) {
            puntosJota += 1;
            if (puntosJota == puntos) {
              break;
            }
            i++;
          }
          if (puntosJota != puntos) {
            puntosNelman += 1;
          }
        }
        quienParte = 2;
      } else if (quienParte == 2) {
        if (rachasNelman == 0) {
          puntosJota += 1;
        } else {
          i = 0;
          while (i < (rachasNelman)) {
            puntosNelman += 1;
            if (puntosNelman == puntos) {
              break;
            }
            i++;
          }
          if (puntosNelman != puntos) {
            puntosJota += 1;
          }
        }
        quienParte = 1;
      }
    }

    return puntosJota == puntos ? 1 : 2;
  }
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Ingrese primera linea: ");
    int N = keyboard.nextInt();
    int P = keyboard.nextInt();
    System.out.print("Ingrese segunda linea: ");
    int A = keyboard.nextInt();
    int B = keyboard.nextInt();
    Partido partido = new Partido(N, P, A, B);

    System.out.println(partido.quienGana());
  }
}
