/*Given a string paragraph and a string array of the banned words banned, return 
the most frequent word that is not banned. It is guaranteed there is at least
one word that is not banned, and that the answer is unique.
The words in paragraph are case-insensitive and the answer should be returned 
in lowercase. */

import java.util.*;

public class mostCommonWord {
    public static void main(String[] args) {
        String para = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = { "hit" };
        String ans = mostCommonWord(para, banned);
        System.out.println(ans);

    }

    public static String mostCommonWord(String para, String[] banned) {
        HashSet<String> bannedWords = new HashSet<>();
        
        for (String st : banned) {
            bannedWords.add(st);
        }
        
        HashMap<String, Integer> hm = new HashMap<>();
        String[] paragraph = para.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ");
        
        for (String word : paragraph) {
            if (!bannedWords.contains(word)) {
                if (hm.containsKey(word)) {
                    int val = hm.get(word);
                    hm.put(word, val + 1);
                } else {
                    hm.put(word, 1);
                }
            }
        }

        String res = "";
        
        for (String key : hm.keySet()) {
            if (res.equals("") || hm.get(key) > hm.get(res)) {
                res = key;
            }
        }

        return res;
        
        
        

    }
}
