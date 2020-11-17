public class Polindrome {
    public boolean isPolindromeViaLoop(String original) {
        String reversed = "";
        int length = original.length();
        for(int i = length-1; i >= 0; i--){
            reversed += original.charAt(i);
        }
        return original.equals(reversed);
    }

    public boolean isPolindromeViaBuilder(String original) {
        StringBuilder reversed = new StringBuilder(original).reverse();
        return original.equals(reversed.toString());
    }
}
