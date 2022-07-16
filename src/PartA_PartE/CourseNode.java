package PartA_PartE;


import java.util.Objects;

/**
 *
 * @author z
 */
public class CourseNode {
  
    /**
     *
     */
    public String courseCode;

    /**
     *
     */
    public String courseName;

    /**
     *
     */
    public Double Cost;

    /**
     *
     */
    public CourseNode next;

    /**
     *
     */
    public CourseNode pre;

    /**
     *
     * @param courseCode
     * @param courseName
     * @param Cost
     * @param next
     * @param pre
     */
    public CourseNode(String courseCode, String courseName, Double Cost, CourseNode next, CourseNode pre) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.Cost = Cost;
        this.next = next;
        this.pre = pre;
    }

    /**
     *
     * @param courseCode
     * @param courseName
     * @param Cost
     */
    public CourseNode(String courseCode, String courseName, Double Cost) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.Cost = Cost;
    }

    /**
     *
     * @return
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     *
     * @param courseCode
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     *
     * @return
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     *
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     *
     * @return
     */
    public Double getCost() {
        return Cost;
    }

    /**
     *
     * @param Cost
     */
    public void setCost(Double Cost) {
        this.Cost = Cost;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.courseCode);
        hash = 53 * hash + Objects.hashCode(this.courseName);
        hash = 53 * hash + Objects.hashCode(this.Cost);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.courseCode, other.courseCode)) {
            return false;
        }
        if (!Objects.equals(this.courseName, other.courseName)) {
            return false;
        }
        if (!Objects.equals(this.Cost, other.Cost)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName=" + courseName + ", Cost=" + Cost + '}';
    }

    /**
     *
     * @param c
     * @return
     */
    public int compareTo(Course c) {
        return this.getCourseCode().compareTo(getCourseCode());
    }
    
    
}
