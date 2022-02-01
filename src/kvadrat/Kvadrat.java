package kvadrat;

public class Kvadrat {

    public static void printKvadrat(int size ,char c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(c + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Kvadrat.printKvadrat(10, 's');
    }
}
