import java.util.*;

public class Number2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(
                Arrays.asList("bella", "label", "roller"));
        ArrayList<String> list2 = new ArrayList<>(
                Arrays.asList("cook", "lock", "cool"));
        printLetters(list1);
    }

    public static void printLetters(ArrayList<String> list) {
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> output = new ArrayList<>();
        ArrayList<Character> output2 = new ArrayList<>();

        list.stream()
                .forEach(s -> s.chars()
                        .mapToObj(value -> (char) value)
                        .forEach(letters::add));

        for (Character letter : letters) {
            boolean isContaining = true;
            for (String word : list) {
                if (!word.contains(letter.toString())) {
                    isContaining = false;
                    break;
                }

            }
            if (isContaining) {
                output.add(letter);
            }
        }
        HashSet<Character> letters2 = new HashSet<>(output);
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character character : letters2) {
            int count = 0;
            for (Character character1 : output) {
                if (character.equals(character1)) {
                    count++;
                }
            }
            map.put(character, count);
        }
        for (Character character : letters2) {
            int x = map.get(character) / list.size();
            for (int i = 0; i < x; i++) {
                output2.add(character);
            }
        }
        System.out.println(output2);
    }
}
