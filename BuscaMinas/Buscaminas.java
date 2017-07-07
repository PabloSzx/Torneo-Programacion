import java.util.Scanner;

class Buscaminas {
  char[][] campo;
  
  boolean validar(int a, int b) {
    if (this.campo.length < a && this.campo[0].length < b) {
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
  public static void main(String[] args) {
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

    System.out.println("Campo insertado");

    zona.printCampo();
  }


}
