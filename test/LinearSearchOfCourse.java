/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import PartA_PartE.Course;
import java.util.Arrays;

/**
 *
 * @author z
 */
public class LinearSearchOfCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Course Array
        Course[] _class = new Course[4];

        Course c1 = new Course("4DHIH", "5DD", 390.00);
        Course c2 = new Course("5ABHE", "5TSD", 480.00);
        Course c3 = new Course("3BBDS", "3PRB", 270.00);
        Course c4 = new Course("5HJYI", "5C#W", 480.00);

        _class[0] = c1;
        _class[1] = c2;
        _class[2] = c3;
        _class[3] = c4;

        System.out.print("Elements of original array: " + "\n");

        Arrays.sort(_class);

        for (int i = 0; i < 4; i++) {
            System.out.println(_class[i]);
        }

        Arrays.sort(_class);
        System.out.println();

        boolean isFlag = true;

        for (int i = 0; i < _class.length; i++) {

            if (c1.equals(_class[i])) {
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
