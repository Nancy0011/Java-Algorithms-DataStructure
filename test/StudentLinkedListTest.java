
import PartA_PartE.StudentLinkedList;
import PartA_PartE.StudentNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author z
 */
public class StudentLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentNode s1 = new StudentNode(4565489, "John Brown", "John@gmail.com", 0420111333, "Diploma", "02/02/2021");
        StudentNode s2 = new StudentNode(2172849, "Summer Smith", "summer@gmail.com", 0410111333, "Diploma", "02/07/2021");
        StudentNode s3 = new StudentNode(2168618, "Amy Liu", "amy@gmail.com", 0420111555, "CertIV", "02/02/2021");

        // Create a LinkedList
        StudentLinkedList sl = new StudentLinkedList();

        sl.addByOrder(s3);
        sl.addByOrder(s2);
        sl.addByOrder(s1);

        System.out.println("=================== Add by Order ===================");
        sl.showList();
        System.out.println("=================== Update Node ===================");
        sl.updateNode(new StudentNode(4565489, "Dovid Black", "dovid@gmail.com", 0410111777, "CertIV", "07/07/2021"));
        sl.showList();
        System.out.println("=================== Del Node ===================");
        sl.delNode(2168618);
        sl.showList();

    }

}
