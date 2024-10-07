/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsalab.bubblesort;

/**
 *
 * @author Super Galaxy
 */
public class BubbleSort {
    public static void main(String[] args) {
        int []arr={5,1,3,4,6,2};
        
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length; j++){
            if(arr[i]<arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
 }
