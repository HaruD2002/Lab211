/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsp0057;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JSp0057 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        viewUser use = new viewUser();
       
        while(true){
           int choice;
           System.out.println("1-Create an accout");
           System.out.println("2-Log in");
           System.out.println("3-Quit");
          do{
           choice =sc.nextInt();
           if(choice <1 & choice >3)
                  System.out.println("Invalid option");
          }while(choice <1 && choice >3);
          
          switch(choice){
              case 1: 
                  use.createUser();
                  break;
              case 2: 
                  use.SignIn();
                  break;
              case 3:
                  return;
              default:
                  System.out.println();
          }
       }
    }
}
