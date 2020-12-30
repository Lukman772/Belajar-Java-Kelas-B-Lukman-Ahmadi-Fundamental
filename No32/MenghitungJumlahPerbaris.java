import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int i, j, m, n;
    int matriksnyajagokali[][] = new int[10][10];
    int hasil[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
    m = 5;
    n = 5;
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriksnyajagokali[i][j] = scan.nextInt();
      }
    }
    
        System.out.println(matriksnyajagokali[0][0] + matriksnyajagokali[0][1] + matriksnyajagokali[0][2] + matriksnyajagokali[0][3] + matriksnyajagokali[0][4]);
        System.out.println(matriksnyajagokali[1][0] + matriksnyajagokali[1][1] + matriksnyajagokali[1][2] + matriksnyajagokali[1][3] + matriksnyajagokali[1][4]);
        System.out.println(matriksnyajagokali[2][0] + matriksnyajagokali[2][1] + matriksnyajagokali[2][2] + matriksnyajagokali[2][3] + matriksnyajagokali[2][4]);
        System.out.println(matriksnyajagokali[3][0] + matriksnyajagokali[3][1] + matriksnyajagokali[3][2] + matriksnyajagokali[3][3] + matriksnyajagokali[3][4]);
        System.out.println(matriksnyajagokali[4][0] + matriksnyajagokali[4][1] + matriksnyajagokali[4][2] + matriksnyajagokali[4][3] + matriksnyajagokali[4][4]);



  }
}