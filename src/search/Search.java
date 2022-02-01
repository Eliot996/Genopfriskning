package search;

public class Search {

    public static int arrayContainsString(String[] array, String toMatch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(toMatch)) return i;
        }

        throw new StringNotInArrayException();
    }

    public static void main(String[] args) {
        String[] array = {"word1", "word2", "word3", "word4", "word5"};

        System.out.println(Search.arrayContainsString(array, "word6"));
    }
}
