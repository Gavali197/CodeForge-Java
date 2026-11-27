package Java.Quetions;

public class ValidAnagramStr {
    public static boolean checkFrequncy(String s, String t){
       if(s == null || t == null || s.length() != t.length()){
            // System.out.println("false");
            return false;
       }

       int[] freq = new int[26];

       for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
       }

       for (int count : freq) {
            if(count != 0){
                System.out.println("false");
                return false;
            }
       }

       System.out.println("true");
       return true;
    }
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagarma";

        String str3 = "ram";
        String str4 = "cat";

        checkFrequncy(str3, str4);
    }
}
 