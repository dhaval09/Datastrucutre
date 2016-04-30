/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

/**
 *
 * @author dhaval
 */
public class factorial {
    int a;
static int  fact(int n)
{
    if (n==0)
    {
        
           return 1;     
        
    }
    else 
    {
      
    return n*fact(n-1);
    
    }
    
}
public static void main(String[] args)
{
    //factorial z = new factorial();
    int result = 1;
    int n = 7;
    result=fact(n);
  System.out.println(result);
}
}

