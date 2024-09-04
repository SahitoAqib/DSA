/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab.task1dsa;

/**
 *
 * @author Super Galaxy
 */
public class Task_4_Ex_2 {
   
    public static void main(String[] args) {
        int[] array = {4, 6, 2, 8, 10};
        int valueToFind = 8;
        int index = linearSearch(array, valueToFind);
        
        if (index != -1) {
            System.out.println("Value " + valueToFind + " found at index: " + index);
        } else {
            System.out.println("Value " + valueToFind + " not found in the array.");
        }
    }

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}


