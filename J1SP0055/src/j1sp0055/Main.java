package j1sp0055;

import java.util.Scanner;
import CatchDoc.*;
import Doctor.docinfo;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        viewDoc vc = new viewDoc();
        int choice;
        while (true) {
            System.out.println("---Doctor management program---");
            System.out.println(" 1. Add doctor.");
            System.out.println(" 2. Update doctor.");
            System.out.println(" 3. Delete doctor.");
            System.out.println(" 4. Search doctor.");
            System.out.println(" 5. Show doctor list.");
            System.out.println(" 6. Exit.");
            System.out.print("Enter your choice: ");
            choice = validinfo.validA();
            if (choice < 1 && choice > 6) {
                System.err.println("Not in Range");
                choice = validinfo.validA();
            }
            switch (choice) {
                case 1:
                    vc.aDoc();
                    break;

                case 2:
                    vc.upDoc();
                    break;
                case 3:
                    vc.delDoc();
                    break;
                case 4:
                    vc.printDocasTable();
                    vc.searchDoc();

                    break;
                case 5:
                    return;
            }
            System.out.println("");
        }
    }
}
