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
public class fibonaci {
    
int a = 0;
int b = 1;

int current = 0;
void  compute(int count)
{
   while(count>=0)
   {
    int prev = b+a;
   System.out.println(prev);
    a=b;
    b=prev;
    count --;      
}
}
public static void main(String[] args)
{
    fibonaci h = new fibonaci();
h.compute(10);
System.out.println("hello");
}

}

