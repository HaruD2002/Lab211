/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp103;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author Admin
 */
public class J1sp103 {
    private static final Scanner sc  = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
    
    System.out.print("Enter Date 1:");
    String s1 = takeInput();
    System.out.print("Enter Date 2:");
    String s2= takeInput();

    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(s1);
    Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(s2);

    if(date1.before(date2))
            System.out.println("Date 1 is before date 2");
    else
                System.out.println("Date 1 is after date 2");


    }
    
    public static String takeInput(){
        String s;
        while(true){
            s = sc.nextLine().trim();
            if(s.isEmpty()) 
                System.out.print("Empty Date. Please re-enter");
            
            if(checkFormat(s) == true)
                return s; 
            else
                System.out.print("Not value answer.Please re-enter: ");
        }
    }

    public static boolean checkFormat(String s){
        String regex  = "^[0-3]{1,9}(\\/[0-9]{1})(\\/[0-9]{0,9})?$";
        
        if(s.matches(regex))
            return true;
        else 
            return false;
        
    }

}
