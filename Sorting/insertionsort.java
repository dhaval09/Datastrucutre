/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sorting;

/**
 *
 * @author dhaval
 */
public class insertionsort {
    
public  void  sort1(int[] data)
{
    int a = data.length;
    int temp ;
  for(int b = 1;b<a;b++)
  {
    for(int j=b;j>0;j--)
    {
        if(data[j]<data[j-1])
        {
                temp =data[j];
                data[j]= data[j-1];
                data[j-1]=temp;
                
    }
    }
  }
   }

public static void main(String[]args)
{
    int[] arr1 = {10,34,2,56,7,67,88,42};
      insertionsort q= new insertionsort();
      q.sort1(arr1);
      for(int i:arr1){
            System.out.print(i);
            System.out.print(", ");
        }
    
      System.out.println("insertion sort");

    
}
}

