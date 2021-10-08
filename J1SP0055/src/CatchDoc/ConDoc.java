/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatchDoc;

import java.util.ArrayList;
import Doctor.docinfo;

/**
 *
 * @author Admin
 */
public class ConDoc {

    private ArrayList<docinfo> doc = new ArrayList<>();

    public ArrayList<docinfo> print() {
        return doc;
    }

    public void aDoc(docinfo d) {
        doc.add(d);
    }

    public void update(docinfo d, docinfo nd) {
        int n = 0;
        for (int i = 0; i < doc.size(); i++) {
            if (doc.get(i) == d) {
                n = i;
            }
        }
        doc.set(n, nd);
    }

    public void del(String s) {
        for (int i = 0; i < doc.size(); i++) {
            if (s.equalsIgnoreCase(doc.get(i).getCode())) {

            }
        }

    }

    public docinfo Search(int choice, String s) {
        if (fCode(s) != true) {
            return null;
        }

        for (int i = 0; i < 10; i++) {

            switch (choice) {
                case 1:
                    if (s.equalsIgnoreCase(doc.get(i).getCode())) {
                        return doc.get(i);
                    }
                    break;

                case 2:
                    if (s.equalsIgnoreCase(doc.get(i).getName())) {
                        return doc.get(i);
                    }
                    break;

                case 3:
                    if (s.equalsIgnoreCase(doc.get(i).getSpec())) {
                        break;
                    }
             
                default:
                    break;

            }
        }
        return null;
    }

    public boolean fCode(String s) {

        for (int i = 0; i < doc.size(); i++) {
            if (s.equalsIgnoreCase(doc.get(i).getCode())) {
                return true;
            } else {
                break;
            }
        }
        return false;
    }

    public docinfo getCode(String s) {
        for (int i = 0; i < doc.size(); i++) {
            if (s.equalsIgnoreCase(doc.get(i).getCode())) {
                return doc.get(i);
            } else {
                break;
            }
        }
        return null;
    }

}
