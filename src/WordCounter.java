import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {

        final String TEXT_IN_FILE = "Привет пока привет привет, привет\n" +
                "всем хороших выходных\n" +
                "пока";
        String clearText = TEXT_IN_FILE.replace("\n", " ");
        String[] words = clearText.split(" ");

        counter(words);
    }


    static void counter(String[] words) {
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        System.out.println(words.length);

        for (int item = 0; item < words.length; item++) {

            String word = words[item].toLowerCase().replace(",", "");


            if (!wordMap.containsKey(word)) {
                wordMap.put(word, 1);
            }
            else {
                wordMap.put(word, wordMap.get(word) + 1);
            }
        }

        for (Map.Entry<String, Integer> mapElement : wordMap.entrySet()) {
            System.out.println(mapElement.getKey() + " "+ mapElement.getValue());
        }

    }

}

