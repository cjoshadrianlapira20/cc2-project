package nestedif;

import java.util.Scanner;
import java.io.*;

public class NestedIf {

  
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
    
        System.out.println("What course did you choose in college?");
        
       
         String course = scan.next();
       
        if(course.equals("BSIT")){
            System.out.println("What is your major in I.T?");
            String major = scan.next();
            if(major.equals("Network Security")){
                System.out.println("What track in Network Security? ");
            }
            else if(major.equals("Web Development")){
               System.out.println("");
            }
            else if(major.equals("Enterprises Resource Planning")){
                System.out.println("So you chosed the Major Web Development");
            
                }
        }
        else if (course.equals("BSCS")){
            System.out.println("What major in Computer Science?");
            String major = scan.next();
            if(major.equals("MobileDevelopment")){
                System.out.println("So you chosed the Major Mobile Development");
            }
            else if(major.equals("DigitalArtsandAnimation")){
                System.out.println("So you chosed the Major Digital Arts and Animation");
            }
        }
        else if(course.equals("BSDA")){
            System.out.println("So your taking up BSDA");
        }
        else{
            System.out.println("Invalid Track");
            
        }
        
                      
                
                
                
           
        
    }
    
}