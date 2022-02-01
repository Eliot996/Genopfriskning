package bog;

import java.util.ArrayList;

public class Bibliotek {
    ArrayList<Bog> books = new ArrayList<>();

    public boolean hasBog(Bog bog) {
        for (Bog book : books) {
            if (book.sameISBN(bog)){
                return true;
            }
        }
        return false;
    }

    public void addBog(Bog bog) {
        books.add(bog);
    }

    public static void main(String[] args) {
        Bibliotek bibliotek = new Bibliotek();
        Bog bog = new Bog("test", "test", "test");
        Bog bog2 = new Bog("1", "1", "1");
        bibliotek.addBog(new Bog("1", "1", "1"));
        bibliotek.addBog(new Bog("2", "2", "2"));
        bibliotek.addBog(new Bog("3", "3", "3"));

        System.out.println("Should be false: " + bibliotek.hasBog(bog));
        System.out.println("Should not be false: " + bibliotek.hasBog(bog2));
    }
}
