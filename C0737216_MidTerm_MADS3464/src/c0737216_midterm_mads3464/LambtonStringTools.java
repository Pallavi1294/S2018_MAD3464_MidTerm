/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0737216_midterm_mads3464;

/**
 *
 * @author hp
 */
class LambtonStringTools {
    public static int getDecimal(int binary){  
    int decimal = 0;  
    int n = 0;  
    while(true){  
      if(binary == 0){  
        break;  
      }
      else  {  
          int temp = binary%10;  
          decimal += temp*Math.pow(2, n);  
          binary = binary/10;  
          n++;  
       }  
    }  
    return decimal;  
}  public static void main(String args[]){    
System.out.println("Decimal of 1010 is: "+getDecimal(1010));  
System.out.println("Decimal of 10101 is: "+getDecimal(10101));  
System.out.println("Decimal of 11111 is: "+getDecimal(11111));  
}}    
  

