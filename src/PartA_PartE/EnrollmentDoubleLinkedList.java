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
public class EnrollmentDoubleLinkedList {

    private final EnrollmentNode head = new EnrollmentNode(0, "", "", "");

    /**
     *
     * @return
     */
    public EnrollmentNode getHead() {
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
        EnrollmentNode temp = head.next;
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
     * @param enrollmentNode
     */
    public void add(EnrollmentNode enrollmentNode) {
        EnrollmentNode temp = head;

        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = enrollmentNode;
        enrollmentNode.pre = temp;
    }

    // update 

    /**
     *
     * @param newNode
     */
    public void updateNode(EnrollmentNode newNode) {

        if (head.next == null) {
            System.out.println("LinkedList is null");
            return;
        }
        EnrollmentNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.id == newNode.id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.Grade = newNode.Grade;
            temp.Semester = newNode.Semester;
            temp.dateEnrolled = newNode.dateEnrolled;
        } else {
            System.out.printf("Can not find, can not update\n", newNode);
        }

    }

    /**
     *
     * @param id
     */
    public void delNode(int id) {

        if (head.next == null) {
            System.out.println("Null, can not delete");
            return;
        }

        EnrollmentNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.id == temp.id) {
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
            System.out.printf("The delete node %d not exist", temp.id);
        }
    }

}
