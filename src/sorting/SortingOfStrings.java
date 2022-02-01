package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingOfStrings {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("please enter 5 words to sort");
        for (int i = 0; i < 5; i++) {
            words.add(input.nextLine());
        }

        words.sort(((o1, o2) -> o2.compareToIgnoreCase(o1)));

        for (String word : words) {
            System.out.println(word);
        }
    }
}
