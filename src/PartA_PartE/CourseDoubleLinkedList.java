/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartA_PartE;

/**
 *
 * @author z
 */
public class CourseDoubleLinkedList {

    private final CourseNode head = new CourseNode("", "", 0.00);

    /**
     *
     * @return
     */
    public CourseNode getHead() {
        return head;
    }

    /**
     *
     */
    public void list() {
        if (head.next == null) {
            System.out.println("LinkedList is null");
            return;
        }
        CourseNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    // add a node in the end 

    /**
     *
     * @param courseNode
     */
    public void add(CourseNode courseNode) {
        CourseNode temp = head;

        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = courseNode;
        courseNode.pre = temp;
    }

    // update 

    /**
     *
     * @param newNode
     */
    public void updateNode(CourseNode newNode) {

        if (head.next == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        CourseNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.courseCode == newNode.courseCode) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.courseName = newNode.courseName;
            temp.Cost = newNode.Cost;
        } else {
            System.out.printf("Can not find, can not update\n", newNode);
        }

    }

    // remove studentID
    /**
     *
     * @param CouseCode
     */
    public void delNode(String CouseCode) {

        if (head.next == null) {
            System.out.println("Null, can not delete");
            return;
        }

        CourseNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.courseCode == temp.courseCode) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.pre.next = temp.next;
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.printf("The delete node %d not exist", temp.courseCode);
        }
    }

//    
    // print linkedlist

    /**
     *
     */
    
    public void showList()
    {
        CourseNode item = head.next;
        if (item == null){
            System.out.println("Linked list is null!");
            return;
        }
        while (item != null)
        {
            System.out.println(item);
            item = item.next;
        }
    }
}
