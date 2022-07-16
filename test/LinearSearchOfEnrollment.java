/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import PartA_PartE.Enrollment;
import java.util.Arrays;

/**
 *
 * @author z
 */
public class LinearSearchOfEnrollment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Course Array
        Enrollment[] _class = new Enrollment[4];
        Enrollment e1 = new Enrollment(000222111, "02/02/2021", "P", "2021S1");
        Enrollment e2 = new Enrollment(000111333, "01/07/2021", "F", "2021S2");
        Enrollment e3 = new Enrollment(011443555, "02/02/2021", "P", "2021S1");
        Enrollment e4 = new Enrollment(022113777, "02/07/2021", "F", "2021S2");

        _class[0] = e1;
        _class[1] = e2;
        _class[2] = e3;
        _class[3] = e4;

        System.out.print("Elements of original array: " + "\n");

        Arrays.sort(_class);

        for (int i = 0; i < 4; i++) {
            System.out.println(_class[i]);
        }

        Arrays.sort(_class);
        System.out.println();

        boolean isFlag = true;

        for (int i = 0; i < _class.length; i++) {

            if (e2.equals(_class[i])) {
                System.out.println("Found it: " + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("Sorry, not found it.");
        }

    }

}
