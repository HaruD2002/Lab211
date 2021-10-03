/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsp0057;

import java.io.*;

/**
 *
 * @author Admin
 */
public class viewUser {
    Controller cs = new Controller();
    getUser d = new getUser();
    
    
    public void createUser() throws Exception{
        System.out.println("Enter New Username: ");        
        String user = valuate.checkUserS();
        if(!cs.Uname(user)){
            System.err.print("Already Exist");  
            return;
        }         
        System.out.println("Enter new user password: ");
        String password = valuate.checkPass(); 
        System.err.println("Create success");                
        cs.createUser(new getUser(user,password));
        
    }
    
    public void SignIn() throws Exception{
        int chance; // 3 times til you out
        System.out.println("Enter Username: ");
        String user = valuate.checkUserS();        
        System.out.println("Enter password: ");
        String pass = valuate.checkPass();
        if(!cs.Uname(user) == true)
            if(!pass.equals(cs.findPass(user)))
                System.out.println("Something went wrong");
        else
                System.out.println("Log in success");
        }
                    
    }   

