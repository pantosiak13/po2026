package agh.po.lab1;

public class Choinka {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Podaj wysokość choinki jako argument!");
            return;
        }

        int h = Integer.parseInt(args[0]);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}