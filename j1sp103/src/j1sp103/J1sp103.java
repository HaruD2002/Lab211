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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
    Scanner sc  = new Scanner (System.in);
    System.out.print("Enter Date 1:");
    String sDate1 = sc.nextLine();
    System.out.print("Enter Date 2:");
    String sDate2= sc.nextLine();
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
    Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
    
    if(sDate1.compareToIgnoreCase(sDate2) >0)
            System.out.println("Date 1 is before date 2");
    else 
                System.out.println("Date 1 is after date 2");
   
        
    }
    
}
