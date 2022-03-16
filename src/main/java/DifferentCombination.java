import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DifferentCombination {

    public Set<String> validEnglishCombinations (String word) {

        Map<Character, Integer> wordMap = new HashMap<Character, Integer>();
        Map<Character, Integer> dictMap = new HashMap<Character, Integer>();
        Set<String> englishWords = new HashSet<String>();
        String [] dict =  Dictionary.dictionary();
        for(char comb : word.toCharArray()) {
            if(wordMap.containsKey(comb)) {
                wordMap.put(comb, wordMap.get(comb)+1);
            }else {
                wordMap.put(comb, 1);
            }

        }
        for(String dictWord:dict) {
            dictMap = new HashMap<Character, Integer>();
            for(char c : dictWord.toCharArray()) {
                if(dictMap.containsKey(c)) {
                    dictMap.put(c, wordMap.get(c)+1);
                }else {
                    dictMap.put(c, 1);
                }

            }
            boolean flag = false;
            for(char c :dictMap.keySet()) {

                if(wordMap.containsKey(c)&&wordMap.get(c)>=dictMap.get(c)) {
                    flag = true;

                }else {
                    flag=false;
                    break;
                }

            }

            if(flag)
                englishWords.add(dictWord);
        }
        return englishWords;
    }

    public static void main(String[] args) {
        DifferentCombination dc = new DifferentCombination();
        System.out.println(dc.validEnglishCombinations("working"));
    }
}
