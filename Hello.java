public class Hello {
 public static void main(String[] args) {
  System.out.println("Hello, World!");
 }
}
class Choinka {
 public static void main(String[] args) {
  int size = Integer.parseInt(args[0]);

  for (int i = 1; i <= size; i++) {
   for (int j = i; j < size; j++) {
    System.out.print(" ");
   }

   for (int j = 1; j <= 2 * i - 1; j++) {
    System.out.print("*");
   }

   System.out.println();
  }
 }
}
