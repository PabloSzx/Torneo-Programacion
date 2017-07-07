import java.util.Scanner;
import java.util.*;

class Recorrido {
  public int n;
  public int r;
  public  int[][] grafo;
  public void printGrafo() {
    for (int i = 0; i < this.grafo.length; i++) {
      for (int j = 0; j < this.grafo[i].length; j++) {
        System.out.print(this.grafo[i][j]);
        System.out.print(" ");
      }
      System.out.println();
    }
  }


  public static void main(String[] args) {
    int cont = 0;
    Recorrido recorrido = new Recorrido();
    Scanner keyboard = new Scanner(System.in);
    recorrido.n = keyboard.nextInt();
    recorrido.r = keyboard.nextInt();
    recorrido.grafo = new int[recorrido.n][recorrido.r];
    while (true) {
      System.out.println("primer while");
      int a = keyboard.nextInt();
      int b = keyboard.nextInt();
      int c = keyboard.nextInt();
      recorrido.grafo[a][b] = c;
      cont++;
      if (cont == 2) {
        break;
      }
    }

    int inicio = keyboard.nextInt();
    int fin = keyboard.nextInt();
    // int inicial;
    //
    // int final;


    int c1 = 0;
    int c2 = 0;


    ArrayList<String> caminosDisponibles = new ArrayList<String>();

    for (int i = 0; i < recorrido.n; i++) {
      for (int j = 0; j < recorrido.r; j++) {
        if (recorrido.grafo[i][j] > 0) {
          caminosDisponibles.add(Integer.toString(i) + "-" + Integer.toString(j));
        }
      }
    }


    for(String obj:caminosDisponibles)
    System.out.println(obj);

    System.out.println("Salio del while");
    recorrido.printGrafo();

  }


}
