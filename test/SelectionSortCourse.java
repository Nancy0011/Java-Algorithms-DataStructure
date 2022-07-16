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
public class SelectionSortCourse {

    /**
     *
     * @param _class
     */
    public static void SelectionSort(Course _class[]) {
        for (int i = 0; i < _class.length - 1; i++) {
            int menor = i;

            for (int j = menor + 1; j < _class.length; j++) {
                if (_class[j].compareTo(_class[menor]) < 0) {
                    menor = j;

                }
            }

            if (menor != i) {
                Course aux = _class[i];
                _class[i] = _class[menor];
                _class[menor] = aux;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course[] _class = new Course[4];

        Course c1 = new Course("4DHIH", "5DD", 390.00);
        Course c2 = new Course("5ABHE", "5TSD", 480.00);
        Course c3 = new Course("3BBDS", "3PRB", 270.00);
        Course c4 = new Course("5HJYI", "5C#W", 480.00);

        _class[0] = c1;
        _class[1] = c2;
        _class[2] = c3;
        _class[3] = c4;

        SelectionSort(_class);
        System.out.println(Arrays.toString(_class) + "\n");

    }

}
