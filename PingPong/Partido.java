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
    while (puntosJota <= puntos || puntosNelman <= puntos) {
      System.out.println("while");
      if (quienParte == 1) {
        if (rachasJota == 0) {
          puntosJota += 1;
        } else {
          puntosJota += rachasJota;
        }
        quienParte = 2;
      } else {
        if (rachasNelman == 0) {
          puntosJota += 1;
        } else {
          puntosNelman += rachasNelman;
        }
        quienParte = 1;
      }
    }

    return puntosJota >= puntos ? 1 : 2;
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
