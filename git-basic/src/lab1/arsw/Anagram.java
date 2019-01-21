package lab1.arsw;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        boolean res = false;
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','v','w','x','y','z'};
        int[] countsA = new int[letters.length];
        int[] countsB = new int[letters.length];
        
        count(a.toLowerCase(), countsA, letters);
        count(b.toLowerCase(), countsB, letters);
        if (Arrays.equals(countsA, countsB)) res = true;
        
        return res;
    }
    
    /**
     * 
     * @param a string for count the number of each letter
     * @param count array that contains the number of repetitive of each letter
     * @param l array that contains the elements to compare
     */
    private static void count(String a, int[] count, char[] l){
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < count.length; j++) {
                if (a.charAt(i) == l[j])
                    count[j] += 1;
            }            
        }
    }
    
    

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        //System.out.println(a+b);
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}