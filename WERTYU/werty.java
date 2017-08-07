import java.util.Scanner;

class werty {
  public static char[] arreglo = {'\'', '1','2','3','4','5','6','7','8','9','0','-',
  '=','W','E',
  'R','T','Y','U','I','O','P','[',']','\\', 'A', 'S','D','F','G','H','J','K','L',';',
  '\'', 'Z','X','C','V','B','N','M',',','.','/'};
  public static int buscarIndice(char c) {
    int i = 0;
    while (i < arreglo.length) {
      if (arreglo[i] == c) {
        return i;
      }
      i++;
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String linea = "";
    String traduccion = "";
    while (true) {
      linea = keyboard.nextLine();
      for (int i = 0; i < linea.length(); i++) {
        if (buscarIndice(linea.charAt(i)) != -1) {
          traduccion = traduccion + arreglo[buscarIndice(linea.charAt(i)) - 1];
        } else {
          traduccion = traduccion + linea.charAt(i);
        }
      }
      System.out.println(traduccion);
      traduccion = "";
    }
  }
}
