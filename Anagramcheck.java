
    import java.util.Arrays;

public class Anagramcheck {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // Step 1: Check length
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Step 2: Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Step 3: Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}


