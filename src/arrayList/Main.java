package arrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hej");
        strings.add("med");
        strings.add("dig");

        doesArraylistContainString(strings, "hej");
        System.out.println(doesArraylistContainString(strings, "kaj"));
        doesArraylistContainString(strings, "kaj");

    }

    public static boolean doesArraylistContainString(ArrayList<String> list, String matchString) {
        if (list.contains(matchString)) {
            System.out.println("The String has been found");
            return true;
        }
        list.add(matchString);
        return false;
    }
}
