package pkg2interactive;

import java.util.Scanner;

public class Interactive {
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("What is your name: ");
    String yourName = input.nextLine();
    System.out.print("How old are you: ");
    int age = input.nextInt();
    System.out.print("What is your GPA: ");
    double gpa = input.nextDouble(); 
    
    //String yourName = "Chenson";
    //int age = 27;
    //double gpa = 3.3;
    // System.out.println(yourName);
   // System.out.println(age);
   // System.out.println(gpa);
    
        
    System.out.printf("%s is %d years old. %s has a GPA of %s\n",yourName, age, yourName, gpa);
    //                                    \n (means next line)   
  
        }}
