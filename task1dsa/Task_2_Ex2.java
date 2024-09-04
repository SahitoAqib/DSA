/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab.task1dsa;

/**
 *
 * @author Super Galaxy
 */
public class Task_2_Ex2 {
    public static void main(String[] args) {
        int[] array = {100, 200, 300, 400, 500};
        int valueToInsert = 250;
        int indexToInsert = 2;

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < indexToInsert; i++) {
            newArray[i] = array[i];
        }

        newArray[indexToInsert] = valueToInsert;

        for (int i = indexToInsert; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

    

