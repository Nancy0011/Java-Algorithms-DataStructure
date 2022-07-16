
import PartA_PartE.CourseDoubleLinkedList;
import PartA_PartE.CourseNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author z
 */
public class CourseDoubleLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CourseNode c1 = new CourseNode("4DHIH", "5DD", 390.00);
        CourseNode c2 = new CourseNode("5ABHE", "5TSD", 480.00);
        CourseNode c3 = new CourseNode("3BBDS", "3PRB", 270.00);
        CourseNode c4 = new CourseNode("5HJYI", "5C#W", 480.00);

        CourseDoubleLinkedList cl = new CourseDoubleLinkedList();
        cl.add(c1);
        cl.add(c2);
        cl.add(c3);
        cl.add(c4);
        // List 
        System.out.println("DoubleLinkedList: ");
        cl.list();
        // update
        CourseNode newNode = new CourseNode("2KFDD", "2DSB", 390.00);
        cl.updateNode(newNode);
        System.out.println("Update LinkedList: ");
        cl.list();
        // delete
        cl.delNode("5ABHE");
        System.out.println("Delete LinkedList: ");
        cl.list();

    }

}
