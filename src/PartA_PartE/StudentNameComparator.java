/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartA_PartE;

import java.util.Comparator;

/**
 *
 * @author 000920418
 */
public class StudentNameComparator implements Comparator<Student> {

    /**
     *
     * @param s1
     * @param s2
     * @return
     */
    @Override
    public int compare(Student s1, Student s2) {

        if (s1.getName().compareToIgnoreCase(s2.getName()) == 0) {
            return s1.getTelNum() - s2.getTelNum();
        }
        return s1.getName().compareToIgnoreCase(s2.getName());
    }

}
