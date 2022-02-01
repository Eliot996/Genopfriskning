package properCase;

import java.util.Locale;

public class ProperCase {

    public static String fixCase(String string) {
        String[] words = string.trim().split(" ");

        for (int i = 0; i < words.length; i++) {
            boolean isPurelyUppcase = true;

            for (int j = 0; j < words[i].length(); j++) {
                isPurelyUppcase = isPurelyUppcase && Character.isUpperCase(words[i].charAt(j));
            }
            if (!isPurelyUppcase) {
                if (words[i].length() <= 3) {
                    words[i] = words[i].toLowerCase();
                } else if (words[i].length() > 3) {
                    words[i] = words[i].substring(0, 1).toUpperCase(Locale.ROOT) +
                            words[i].substring(1).toLowerCase();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(ProperCase.fixCase("HELLO iM doing WeLl sUp"));
    }
}
