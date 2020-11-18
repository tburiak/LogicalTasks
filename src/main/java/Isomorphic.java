import java.util.HashMap;

public class Isomorphic {

    public boolean isIsomorphic(String string1, String string2) {
        HashMap<Character, Character> map = new HashMap<>();

        if(string1.length() != string2.length())
            return false;
        for(int i = 0; i <= string1.length()-1; i++){
            if (map.get(string1.charAt(i)) == null) {
                map.put(string1.charAt(i), string2.charAt(i));
            } else if (map.get(string1.charAt(i)) != string2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
