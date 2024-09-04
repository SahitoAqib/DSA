/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab.task1dsa;

import java.util.Arrays;

/**
 *
 * @author Super Galaxy
 */

public class Task_5 {
    public static int[] reversearray(int []arr){
        int n=arr.length;
        int [] rev=new int[n];
        for(int i=0; i<n; i++){
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }
    
    public static void main(String[] args) {
        int []num={1,2,3,4,5};
        int[] reversed = reversearray(num);
        for(int i=0; i<reversed.length; i++)
        System.out.print(reversed[i] + " ");
    }
  
        }