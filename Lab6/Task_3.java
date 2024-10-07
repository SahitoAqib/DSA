/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab.bubblesort;

import java.util.Arrays;

/**
 *
 * @author Super Galaxy
 */
public class Task_3 {

    public static void main(String[] args) {
        String[] words = {"apple", "pie", "banana", "cat"};
        bubbleSortByLength(words);
        
    }

    public static void bubbleSortByLength(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    // swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        
    }
}