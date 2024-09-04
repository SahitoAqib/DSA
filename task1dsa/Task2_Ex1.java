/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab.task1dsa;

/**
 *
 * @author Super Galaxy
 */
public class Task2_Ex1 {
    public static void main(String[] args) {
        
        int[] originalArray = {12, 24, 36, 48, 60};
        int valueToInsert = 6;
        int[] newArray = new int[originalArray.length + 1];

        newArray[0] = valueToInsert;
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
        }

        // Output the new array
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

  
    

