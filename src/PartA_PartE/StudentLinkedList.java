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
public class StudentLinkedList {

    private final StudentNode head = new StudentNode(0, "", "", 0, "", "");

    /**
     *
     * @param node
     */
    public void addNode(StudentNode node) {
        StudentNode item = head;
        while (item.next == null) {
            item = item.next;
        }
        item.next = node;
    }

    /**
     *
     * @param node
     */
    public void addByOrder(StudentNode node) {
        StudentNode item = head;
        StudentNode item1 = item.next;
        while (item1 != null) {
            if (item1.getId() <= node.getId()) {
                break;
            } else if (item.getId() == node.getId()) {
                System.out.println("Node id already here");
                return;
            }
            item = item.next;
            item1 = item.next;
        }
        node.next = item.next;
        item.next = node;
    }
    // update likedlist by studentId

    /**
     *
     * @param newnode
     */
    public void updateNode(StudentNode newnode) {
        StudentNode item = head.next;
        if (item == null) {
            System.out.println("LinkedList null");
            return;
        }
        while (item != null) {
            if (item.getId() == newnode.getId()) {
                item.Program = newnode.Program;
                item.DateRegistered = newnode.DateRegistered;
                return;
            }
            item = item.next;
        }
        System.out.printf("Can not find student id is %d. \n", newnode.getId());

    }

    // remove studentID

    /**
     *
     * @param id
     */
    public void delNode(int id) {
        StudentNode item0 = head;
        StudentNode item = head.next;

        if (item == null) {
            System.out.println("LinkedList null");
            return;
        }
        while (item != null) {
            if (item.getId() == item.getId()) {
                item.Program = item.Program;
                item.DateRegistered = item.DateRegistered;
                return;
            }
            item0 = item0.next;
            item = item0.next;
        }
        System.out.printf("Can not find student id is %d. \n", item.getId());

    }

    // print linkedlist

    /**
     *
     */
    public void showList() {
        StudentNode item = head.next;
        if (item == null) {
            System.out.println("Linked list is null!");
            return;
        }
        while (item != null) {
            System.out.println(item);
            item = item.next;
        }
    }

}
