/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab.task1dsa;

/**
 *
 * @author Super Galaxy
 */
public class Task_3 {
    public static void main(String[] args) {
        int[] array = {8, 16, 24, 32, 40};
        int indexToDelete = 2;

        if (indexToDelete < 0 || indexToDelete >= array.length) {
            System.out.println("Index out of bounds");
            return;
        }

        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToDelete) {
                newArray[j++] = array[i];
            }
        }

        // Output the new array
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}


