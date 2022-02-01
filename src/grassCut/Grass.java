package grassCut;

import java.util.Scanner;

public class Grass {
    final static double DAILYGROWTH = 0.8;

    public static int howLongTillCut(double start, double limit) {
        // Days till the grass is too long, and needs a cut
        double amountToGrow = limit - start;
        return (int) Math.floor(amountToGrow / DAILYGROWTH) + 1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get current length
        System.out.print("How long is the grass now? ");
        double currentLength = scanner.nextDouble();
        scanner.nextLine();

        // get length limit
        System.out.print("How long is too long? ");
        double limit = scanner.nextDouble();

        System.out.println("days until the grass is too long: " + Grass.howLongTillCut(currentLength, limit));
    }
}
