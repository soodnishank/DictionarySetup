import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dictionary {
    public static boolean isEnglishWord(String word) {

        List<String> dict = Arrays.stream(dictionary()).map(String::toLowerCase).collect(Collectors.toList());

        if(dict.contains(word))
            return true;
        else
            return false;
    }

    public static String [] dictionary() {

        String [] dict = {"working","work","king","row","ring","know"};
        return dict;
    }
}
