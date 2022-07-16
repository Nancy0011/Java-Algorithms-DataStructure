/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import PartA_PartE.Course;
import PartA_PartE.Enrollment;
import PartA_PartE.Student;
import java.util.Arrays;

/**
 *
 * @author 000920418
 */
public class TestOfPartAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Test of  Part A Equality/Hashing
        // Student

        Student s1 = new Student(000111000, "John Brown", "John@gmail.com",
                0420111222, "Diploma", "02/02/2021");
        Student s2 = new Student(000222111, "Summer Smith", "summer@gmail.com",
                0410111333, "Diploma", "02/07/2021");
        Student s3 = new Student(011222333, "Amy Liu", "amy@gmail.com",
                0420111555, "CertIV", "02/02/2021");
        Student s4 = s1;
        Student s5 = null;
        Student s6 = new Student(000111000, "John Brown", "John@gmail.com",
                0420111222, "Diploma", "02/02/2021");

        //  Student Equals
        System.out.println("Student Equals:");
        System.out.println(s1.equals(s2));  //false
        System.out.println(s1.equals(s3));  //false
        System.out.println(s2.equals(s3));  //false
        System.out.println(s1.equals(s4));  //true
        System.out.println(s1.equals(s5));  //false
        System.out.println(s1.equals(s6));  //true

        // Student HashCode
        System.out.println("Student HashCode:");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s6.hashCode());

//         Test of Course
        Course c1 = new Course("4DHIH", "5DD", 390.00);
        Course c2 = new Course("5ABHE", "5TSD", 480.00);
        Course c3 = new Course("3BBDS", "3PRB", 270.00);
        Course c4 = c1;
        Course c5 = null;
        Course c6 = new Course("4DHIH", "5DD", 390.00);

        //  Course Equals
        System.out.println("Course Equals:");
        System.out.println(c1.equals(c2));  //false
        System.out.println(c1.equals(c3));  //false
        System.out.println(c2.equals(c3));  //false
        System.out.println(c1.equals(c4));  //true
        System.out.println(c1.equals(c5));  //false
        System.out.println(c1.equals(c6));  //true
//       
//       // Course HashCode
        System.out.println("Course HashCode:");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c6.hashCode());

//         Test of Enrollment Class
        Enrollment e1 = new Enrollment(000222111, "02/02/2021", "P", "2021S1");
        Enrollment e2 = new Enrollment(000111333, "01/07/2021", "F", "2021S2");
        Enrollment e3 = new Enrollment(011443555, "02/02/2021", "P", "2021S1");
        Enrollment e4 = new Enrollment(022113777, "02/07/2021", "F", "2021S2");
        Enrollment e5 = null;
        Enrollment e6 = new Enrollment(000222111, "02/02/2021", "P", "2021S1");

        //  Enrollment Equals
        System.out.println("Enrollment Equals:");
        System.out.println(e1.equals(e2));  //false
        System.out.println(e1.equals(e3));  //false
        System.out.println(e2.equals(e3));  //false
        System.out.println(e1.equals(e4));  //true
        System.out.println(e1.equals(e5));  //false
        System.out.println(e1.equals(e6));  //true
//       
//       // Enrollment HashCode
        System.out.println("Ernollment HashCode:");
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e4.hashCode());
        System.out.println(e6.hashCode());

        // Test of Part B Comparator
        // Student
//     
//        Student[] _class = new Student[4];
//        Student s1 = new Student(000111000, "John Brown", "John@gmail.com", 0420111222,"Diploma", "02/02/2021");
//        Student s2 = new Student(000222111, "Summer Smith", "summer@gmail.com", 0410111333,"Diploma", "02/07/2021");
//        Student s3 = new Student(011222333, "Amy Liu", "amy@gmail.com", 0420111555,"CertIV", "02/02/2021");
//        Student s4 = new Student(022333555, "Dovid Black", "dovid@gmail.com", 0410111777,"CertIV", "07/07/2021");
//        
//        _class[0] = s1;
//        _class[1] = s2;
//        _class[2] = s3;
//        _class[3] = s4;
//        
//        System.out.println("---------------------Befor sorting student---------------------");
//        
//        for(Student s : _class)
//        {
//            System.out.println(s);
//        }
//         
//            System.out.println("---------------------After sorting student-----------------------");
//            StudentNameComparator sac = new StudentNameComparator();
//            Arrays.sort(_class,sac);
//             for(Student s : _class)
//        {
//            System.out.println(s);
//        }   
        // Test for Course
//        Course[] _class = new Course[4];
//        Course c1 = new Course("4DHIH", "5DD", 390.00);
//        Course c2 = new Course("5ABHE", "5TSD", 480.00);
//        Course c3 = new Course("3BBDS", "3PRB", 270.00);
//        Course c4 = new Course("5HJYI", "5C#W", 480.00);
//        
//        _class[0] = c1;
//        _class[1] = c2;
//        _class[2] = c3;
//        _class[3] = c4;
//        
//        System.out.println("--------------------- Befor sorting course -------------------------");
//        for(Course c : _class)
//        {
//            System.out.println(c);
//        }
//        
//        System.out.println("--------------------- After sorting Course Code ---------------------------");
//            CourseCodeComparator snc = new CourseCodeComparator();
//            Arrays.sort(_class,snc);
//             for(Course c : _class)
//        {
//            System.out.println(c);
//        }   
        // Test for Enrollment
//        Enrollment[] _class = new Enrollment[4];
//        Enrollment e1 = new Enrollment(000222111, "02/02/2021", "P", "2021S1");
//        Enrollment e2 = new Enrollment(000111333, "01/07/2021", "F", "2021S2");
//        Enrollment e3 = new Enrollment(011443555, "02/02/2021", "P", "2021S1");
//        Enrollment e4 = new Enrollment(022113777, "02/07/2021", "F", "2021S2");
//        
//        _class[0] = e1;
//        _class[1] = e2;
//        _class[2] = e3;
//        _class[3] = e4;
//        
//        System.out.println("------------------------- Befor sorting enrollment -------------------------");
//        
//        for(Enrollment e : _class)
//        {
//            System.out.println(e);
//        }
//        
//            System.out.println("------------------------- After sorting enrollment Grade ---------------------------");
//            EnrollmentGradeComparator sac = new EnrollmentGradeComparator();
//            Arrays.sort(_class,sac);
//             for(Enrollment e : _class)
//        {
//            System.out.println(e);
//        }   
    }

}
