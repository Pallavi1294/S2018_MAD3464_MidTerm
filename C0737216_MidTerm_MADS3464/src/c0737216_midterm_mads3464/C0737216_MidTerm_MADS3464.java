/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0737216_midterm_mads3464;





public class C0737216_MidTerm_MADS3464 {
    
 public static String reverseString(String str){  
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    return sb.toString();  
}  
    public static void main(String[] args) {
        LambtonStringTools l1= new LambtonStringTools();
        l1.getDecimal(1010);
        
        l1.getDecimal(10101);
        l1.getDecimal(11111);
        System.out.println();
       
          
    System.out.println(C0737216_MidTerm_MADS3464.reverseString("Lambton")); 
    }
    
    
}
