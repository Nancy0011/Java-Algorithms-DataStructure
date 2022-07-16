
import PartA_PartE.EnrollmentDoubleLinkedList;
import PartA_PartE.EnrollmentNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author z
 */
public class EnrollmentDoubleLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        EnrollmentNode e1 = new EnrollmentNode(000222111, "02/02/2021", "P", "2021S1");
        EnrollmentNode e2 = new EnrollmentNode(000111333, "01/07/2021", "F", "2021S2");
        EnrollmentNode e3 = new EnrollmentNode(011443555, "02/02/2021", "P", "2021S1");
        EnrollmentNode e4 = new EnrollmentNode(022113777, "02/07/2021", "F", "2021S2");

        EnrollmentDoubleLinkedList el = new EnrollmentDoubleLinkedList();
        el.add(e1);
        el.add(e2);
        el.add(e3);
        el.add(e4);
        // List 
        System.out.println("DoubleLinkedList: ");
        el.list();
        // update
        EnrollmentNode newNode = new EnrollmentNode(02012212, "02/07/2020", "P", "2020S1");
        el.updateNode(newNode);
        System.out.println("Update LinkedList: ");
        el.list();
        // delete
        el.delNode(011443555);
        System.out.println("Delete LinkedList: ");
        el.list();

    }

}
