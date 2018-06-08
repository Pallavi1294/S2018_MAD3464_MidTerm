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
public class LambtonStringTools {
    
String s1 = "the dog jumped over the fence";
    String s2 ="the";
    String s3 ="that";
    String replaceString=s1.replace(s2,s3);
    System.out.println(replaceString);//replaces all occurrences of "is" to "was" 
    
  
    public static void main(String[] args) {
        String name = new String();
        System.out.println("Enter your name: ");
        //Scanner input = new Scanner(System.in);
        name = input.nextLine();

        System.out.println("You entered : " + name);
        String temp = new String(name.toUpperCase());

        System.out.println(temp);

        char c = name.charAt(0);
        System.out.println(c);

        for (int i = 1; i < temp.length(); i++) {
    char c1 = temp.charAt(i);

    if (c1 == ' ') {
        System.out.print(temp.charAt(i + 1));
        System.out.print(".");

            }
    
    
    
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
}

}    
  

