/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab.task1dsa;

/**
 *
 * @author Super Galaxy
 */
public class Task_6 {
   

    public static void main(String[] args) {
        String str = "radar";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println("Is the string \"" + str + "\" a palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


