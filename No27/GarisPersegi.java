import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int a = input.nextInt();
     for (int i = 0; i < a; i++){
       for (int j = 0; j < a; j++){
     System.out.print ("#");
     if (i==j){
       break;
     }
       System.out.println();
     }
     }
  }
}