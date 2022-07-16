
import PartA_PartE.Student;
import java.util.Arrays;
import static java.util.Collections.list;

/**
 *
 * @author z
 */
public class BinarySearchOfStudent {

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

        Arrays.sort(_class);
        System.out.println("Binary Search of Student Class by ID:");
        for (int i = 0; i < 4; i++) {
            System.out.println(_class[i]);
        }

        int result = Arrays.binarySearch(_class, s3);

        System.out.println("result = " + result);

    }

}
