/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab.task1dsa;

/**
 *
 * @author Super Galaxy
 */
public class Task_2_Ex_3 {
    public static void main(String[] args) {
        int[] array = {3, 6, 9, 12, 15};
        int newValue = 18;
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = newValue;

        // Output the new array
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }
}


