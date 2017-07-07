import java.util.Scanner;

class Buscaminas {
  char[][] campo;

  int[][] calcular() {
    int[][] pn = new int[this.campo.length][this.campo[0].length];
    for (int i= 0; i < this.campo.length; i++){
    	for (int j = 0; j < this.campo[i].length; j++){
    		if (this.campo[i][j] == '*'){
    			pn[i][j] = -999;
          if (validar(i, j - 1)) {
            pn[i][j-1]++;
          }
          if (validar(i, j + 1)) {
            pn[i][j+1]++;
          }
          if (validar(i + 1, j)) {
            pn[i+1][j]++;
          }
          if (validar(i - 1, j)) {
            pn[i-1][j]++;
          }
          if (validar(i - 1, j - 1)) {
            pn[i-1][j-1]++;
          }
          if (validar(i - 1, j + 1)) {
            pn[i-1][j+1]++;
          }
          if (validar(i + 1, j - 1)) {
            pn[i+1][j-1]++;
          }
          if (validar(i + 1, j + 1)) {
            pn[i+1][j+1]++;
          }
    		}
    	}
    }

    return pn;
  }


  boolean validar(int a, int b) {

    if (this.campo.length > a && a >= 0  && b >= 0 &&  this.campo[0].length > b) {
      return true;
    }
    return false;
  }
  void printCampo() {
    for (int i = 0; i < campo.length; i++) {
      for (int j = 0; j < campo[i].length; j++) {
        System.out.print(campo[i][j]);
      }
      System.out.println();
    }
  }

  void printCampo(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] >= 0) {
          System.out.print(matriz[i][j]);
        } else {
          System.out.print("*");
        }
        if (j < matriz[i].length) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int contador = 0;

    while (true) {
      Buscaminas zona = new Buscaminas();
      String linea;
      Scanner keyboard = new Scanner(System.in);
      int n = keyboard.nextInt();
      int m = keyboard.nextInt();
      zona.campo = new char[n][m];
      for (int c = 0; c < n; c++) {
        linea = keyboard.next();
        for (int i = 0; i < m; i++) {
          zona.campo[c][i] = linea.charAt(i);
        }
      }

      System.out.print("\n\nField #");
      System.out.print(contador);
      System.out.print("\n");

      int[][] aux = new int[n][m];
      aux = zona.calcular();
      zona.printCampo(aux);
    }
  }


}
