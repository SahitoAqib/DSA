/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab.task1dsa;

/**
 *
 * @author Super Galaxy
 */
import java.util.Arrays;
public class Task7 {
     public static boolean areAnagrams(String str1, String str2) {
        if ((str2.length()) != (str1.length())) {
            return false; }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";
        System.out.println("Are the two strings anagrams? " + areAnagrams(string1, string2));
    }
}




