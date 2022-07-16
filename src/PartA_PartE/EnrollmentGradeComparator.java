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
public class EnrollmentGradeComparator implements Comparator<Enrollment> {

    /**
     *
     * @param e1
     * @param e2
     * @return
     */
    @Override
    public int compare(Enrollment e1, Enrollment e2) {

        if (e1.getGrade().compareToIgnoreCase(e2.getGrade()) == 0) {
            return e1.getDateEnrolled().compareTo(e2.getDateEnrolled());
        }
        return e1.getGrade().compareToIgnoreCase(e2.getGrade());
    }

}
