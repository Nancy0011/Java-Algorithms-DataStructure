/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import PartA_PartE.Student;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author z
 */
public class BubbleSortStudent {

    /* static int MAX = 100;*/

    /**
     *
     * @param _class
     * @param n
     */

    public static void sortStrings(Student[] _class, int n) {
        Student temp;

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

        Student[] _class = new Student[4];

        Student s1 = new Student(4565489, "John Brown", "John@gmail.com", 0420111333, "Diploma", "02/02/2021");
        Student s2 = new Student(2172849, "Summer Smith", "summer@gmail.com", 0410111333, "Diploma", "02/07/2021");
        Student s3 = new Student(2168618, "Amy Liu", "amy@gmail.com", 0420111555, "CertIV", "02/02/2021");
        Student s4 = new Student(4465489, "Dovid Black", "dovid@gmail.com", 0410111777, "CertIV", "07/07/2021");

        _class[0] = s1;
        _class[1] = s2;
        _class[2] = s3;
        _class[3] = s4;

        int n = _class.length;
        sortStrings(_class, n);
        System.out.println("Student array in sorted order are : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " is " + _class[i]);
        }
    }

}
