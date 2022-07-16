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
public class CourseCodeComparator implements Comparator<Course> {

    /**
     *
     * @param c1
     * @param c2
     * @return
     */
    @Override
    public int compare(Course c1, Course c2) {

        if (c1.getCourseCode().compareToIgnoreCase(c2.getCourseCode()) == 0) {
            return c1.getCourseName().compareTo(c2.getCourseName());
        }
        return c1.getCourseCode().compareToIgnoreCase(c2.getCourseCode());
    }

}
