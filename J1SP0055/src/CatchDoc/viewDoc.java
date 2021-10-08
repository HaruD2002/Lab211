package CatchDoc;

import java.util.*;

import Doctor.docinfo;

/**
 *
 * @author Admin
 */
public class viewDoc {

    ConDoc dc = new ConDoc();
    Scanner sc = new Scanner(System.in);

    public void aDoc() {
        System.out.print("Enter Doctor Code:");
        String code;

        code = validinfo.validString();
        if (dc.fCode(code) == true) {
            System.out.print("duplicate");
            return;
        }

        System.out.print("Enter Doctor Name:");
        String name = validinfo.validString();

        System.out.print("Enter Doctor Specialization:");
        String spec = validinfo.validString();
        System.out.print("Enter Avalability:");
        int a = validinfo.validA();

        dc.aDoc(new docinfo(code, name, spec, a));
        System.err.println("Add sucess");
    }

//    update the information of doctor
    public void upDoc() {
        System.out.print("Enter code of doctor you want to update information: ");
        String code = validinfo.validString();
        if (dc.fCode(code) == false) {
            System.out.print("Not found doctor");
            return;
        }
        docinfo d = dc.getCode(code);
        System.out.print("Enter code update:");
        String oldCode = d.getCode();
        String newCode = validinfo.validString();
        d.setCode(null);
        while (true) {
            if (dc.getCode(newCode) != null) {
                System.err.print("This code is duplicate!!!");
                System.out.print("Enter code update: ");
                newCode = validinfo.checkInputStringEmpty(oldCode);
                d.setCode(null);
            } else {
                break;
            }
        }
        System.out.print("Enter name of d update: ");
        String newName = validinfo.checkInputStringEmpty(d.getName());
        System.out.print("Enter specialization: ");
        String newSpecialization = validinfo.checkInputStringEmpty(d.getSpec());
        System.out.print("Enter availability: ");
        int newAvailability = validinfo.checkInputIntEmpty(d.getA());
        dc.update(d, new docinfo(newCode, newName, newSpecialization, newAvailability));
        System.out.print("Doctor is updated successful!!!");
    }

//   delete doctor by code
    public void delDoc() {
        System.out.print("Enter d code:");
        String code = validinfo.validString();
        while (true) {
            if (dc.fCode(code) == false) {
                System.err.print("Code is not exist");
                return;
            } else {
                break;
            }
        }
        dc.del(code); //delete the doctor
        System.out.print("Doctor remove");
    }

    public void searchDoc() {
        String s = null;
        System.out.println("--------------------------");
        System.out.println("Find doctor by");
        System.out.println("1:Code");
        System.out.println("2:Name");
        System.out.println("3:Specialization");
        System.out.println("4:Avalable Doctor");
        System.out.println("--------------------------");
        System.out.print("Enter Your choice:");
        while (true) {
            int choice = validinfo.validA();
            if (choice > 0 && choice < 4) {
                System.out.println("Enter The value you want to find");
                s = validinfo.validString().toLowerCase();
            } else {
                System.out.println("Invalid Option please try again");
            }
            System.out.println("Here is your doctor information" +dc.Search(choice, s));
        }

    }

//  print the doctor infomation
    public void printDocasTable() {
        System.out.println(String.format("%s", "------------------------------"
                + "----------------------------------------------------"));
        System.out.println(String.format("%10s %5s %10s %5s %5s %5s %10s",
                "Doctor Code", "|", "Doctor Name", "|", "Doctor Specilization", "|", "Doctor Avalability"));
        System.out.println(String.format("%s", "------------------------------"
                + "----------------------------------------------------"));

        for (int i = 0; i < dc.print().size(); i++) {
            System.out.println(String.format("%10s %6.5s %10s %6.5s %10s %15.5s %10s", dc.print().get(i).getCode(),
                    "|", dc.print().get(i).getName(), "|", dc.print().get(i).getSpec(), "|", dc.print().get(i).getA()));

        }
        System.out.println(String.format("%s", "------------------------------"
                + "----------------------------------------------------"));
    }

}
