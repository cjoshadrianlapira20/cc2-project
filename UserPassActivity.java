package UserPassActivity;

import java.util.Scanner;
import java.io.*;




public class UserPassActivity {

 public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     
     String eName;
     String ePass;
     String bPass;
     
     System.out.println("LOG IN");
     System.out.println("Username: ");
     eName = scan.nextLine();
     System.out.println("Password: ");
     ePass = scan.nextLine();
     System.out.println("Confirm Password: ");
     bPass = scan.nextLine();
     
     if(!bPass.equals (ePass)){
         System.out.println("Correct Password: ");
     }
     else if(!ePass.equals (bPass)) {
         System.out.println("Invalid Password");
 } 
 }
}
     