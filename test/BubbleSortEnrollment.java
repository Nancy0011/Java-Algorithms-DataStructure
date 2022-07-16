/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import PartA_PartE.Enrollment;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author z
 */
public class BubbleSortEnrollment {

    /* static int MAX = 100;*/

    /**
     *
     * @param _class
     * @param n
     */

    public static void sortStrings(Enrollment[] _class, int n) {
        Enrollment temp;

        // Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (_class[j].compareTo(_class[i]) > 0) {
                    temp = _class[j];
                    _class[j] = _class[i];
                    _class[i] = temp;
                }
            }
        }
    }

    // Driver code

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Enrollment[] _class = new Enrollment[4];
        Enrollment e1 = new Enrollment(000222111, "02/02/2021", "P", "2021S1");
        Enrollment e2 = new Enrollment(000111333, "01/07/2021", "F", "2021S2");
        Enrollment e3 = new Enrollment(011443555, "02/02/2021", "P", "2021S1");
        Enrollment e4 = new Enrollment(022113777, "02/07/2021", "F", "2021S2");

        _class[0] = e1;
        _class[1] = e2;
        _class[2] = e3;
        _class[3] = e4;

        int n = _class.length;
        sortStrings(_class, n);
        System.out.println("Enrollment array in sorted order are : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enrollment " + (i + 1) + " is " + _class[i]);
        }
    }

}
