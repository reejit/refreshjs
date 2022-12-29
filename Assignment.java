import java.util.*;
class Main {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Bruh"); 

//Note
//Give description of all cases and their functions instead of bruh..


    double area, r, s1 = 0, s2 = 0, s3 = 0;
    int v, s, u, ch = 0;
    ch = in.nextInt();
    switch (ch) {
    case 1:
      System.out.println("Enter Final Velocity, Initial Velocitya and Distance");
      v = in.nextInt();
      u = in.nextInt();
      s = in.nextInt();
      double acc = (Math.pow(v, 2) - Math.pow(u, 2)) / 2 * s;
      System.out.println("Acceleration" + acc);
      break;
    case 2:
      System.out.println("Enter Area");
      area = in.nextDouble();
      r = Math.sqrt(7.0 * area / 22.0);
      System.out.println("Radius" + r);
      break;
    case 3:
      System.out.println("Enter the angles of traingle");
      s1 = in.nextDouble();
      s2 = in.nextDouble();
      s3 = in.nextDouble();
      if (s1 != 0.0 && s2 != 0.0 && s3 != 0.0 && (s1 + s2 + s3) == 180.0) {
        if (s1 < 90.0 && s2 < 90.0 && s3 < 90.0)
          System.out.println("Acute Triangle");
        else if (s1 == 90.0 || s2 == 90.0 || s3 == 90.0)
          System.out.println("Right Angle Triangle");
        else
          System.out.println("Obtuse Triangle");
      } else
        System.out.println("Triangleos not possible.");
      break;
    case 4:
      double d = 0.0 d;
      System.out.println("Enter the valuesof a,b and c");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      d = Math.pow(b, 2) + (4 * a * c);
      if (d > 0.0)
        System.out.println("roots are real and unequal");
      else if (d == 0.0)
        System.out.println("Roots are real and equal");
      else
        System.out.println("Roots are imaginaryand unequal");
      break;
    case 5:
      System.out.println("Enter distance travelled");
      int dist = in.nextInt();
      int fare = 0;
      if (dist <= 5)
        fare = 100;
      else if (dist <= 15)
        fare = 100 + (dist - 5) * 10;
      else if (dist <= 25)
        fare = 100 + 100 + (dist - 15) * 8;
      else
        fare = 100 + 100 + 80 + (dist - 25) * 5;
      System.out.println("Bill" + fare);
      break;
    case 6:
      System.out.println("Enter a number");
      int n = in.nextInt();
      if (n % 10 == 7 || n / 7 == 0)
        System.out.println("It is a Buzz number.");
      else
        System.out.println("It is nota buzz number.");
      break;
    case 7:
      int t;
      System.out.println("Enter two numbers.");
      a = in.nextInt();
      b = in.nextInt();
      while (b != 0) {
        t = b;
        b = (int) a % b;
        a = t;
      }
      System.out.println("GCD= " + a);
      break;
    case 8:
      int term;
      a = 0;
      b = 1;
      System.out.print((int) a + "  " + b);
      for (int i = 3; i <= 10; i++) {
        term = (int) a + b;
        System.out.print("  " + term);
        a = b;
        b = term;
      }
      break;
    case 9:
      int i;
      for (i = 5; i >= 1; i--) {
        for (b = i + 1; b <= 5; b++)
          System.out.print(" ");
        for (a = 1; a <= i; a++) {
          if ((a % 2) == 1)
            System.out.print("1");
          else
            System.out.print("0");
        }
        System.out.println();
      }
      break;
    case 10:
      int p;
      b = 1;
      for (i = 5; i >= 1; i--) {
        for (a = i; a >= 1; a--) {
          System.out.print(b);
          for (p = 0; p <= (i - 2); p++)
            System.out.print(" ");
          b++;
        }
        System.out.println();
      }
      break;
    }
  }
}
