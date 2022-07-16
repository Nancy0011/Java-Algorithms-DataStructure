package PartA_PartE;

import java.util.Objects;

/**
 *
 * @author z
 */
public class EnrollmentNode {

    /**
     *
     */
    public int id;

    /**
     *
     */
    public String dateEnrolled;

    /**
     *
     */
    public String Grade;

    /**
     *
     */
    public String Semester;

    /**
     *
     */
    public EnrollmentNode next;

    /**
     *
     */
    public EnrollmentNode pre;

    /**
     *
     * @param id
     * @param dateEnrolled
     * @param Grade
     * @param Semester
     * @param next
     * @param pre
     */
    public EnrollmentNode(int id, String dateEnrolled, String Grade, String Semester, EnrollmentNode next, EnrollmentNode pre) {
        this.id = id;
        this.dateEnrolled = dateEnrolled;
        this.Grade = Grade;
        this.Semester = Semester;
        this.next = next;
        this.pre = pre;
    }

    /**
     *
     * @param id
     * @param dateEnrolled
     * @param Grade
     * @param Semester
     */
    public EnrollmentNode(int id, String dateEnrolled, String Grade, String Semester) {
        this.id = id;
        this.dateEnrolled = dateEnrolled;
        this.Grade = Grade;
        this.Semester = Semester;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getDateEnrolled() {
        return dateEnrolled;
    }

    /**
     *
     * @param dateEnrolled
     */
    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    /**
     *
     * @return
     */
    public String getGrade() {
        return Grade;
    }

    /**
     *
     * @param Grade
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     *
     * @return
     */
    public String getSemester() {
        return Semester;
    }

    /**
     *
     * @param Semester
     */
    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.dateEnrolled);
        hash = 29 * hash + Objects.hashCode(this.Grade);
        hash = 29 * hash + Objects.hashCode(this.Semester);
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
        final EnrollmentNode other = (EnrollmentNode) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.dateEnrolled, other.dateEnrolled)) {
            return false;
        }
        if (!Objects.equals(this.Grade, other.Grade)) {
            return false;
        }
        if (!Objects.equals(this.Semester, other.Semester)) {
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
        return "Enrollment{" + "id=" + id + ", dateEnrolled=" + dateEnrolled + ", Grade=" + Grade + ", Semester=" + Semester + '}';
    }

    /**
     *
     * @param e
     * @return
     */
    public int compareTo(Enrollment e) {
        return this.getId() - e.getId();
    }

}
