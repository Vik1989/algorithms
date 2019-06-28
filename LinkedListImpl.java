package com.vikash.practice.LinkedList;

public class LinkedListImpl {

    Node head;

    class Node{

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public Node getFront() {
            return front;
        }

        public void setFront(Node front) {
            this.front = front;
        }

        public Node getBack() {
            return back;
        }

        public void setBack(Node back) {
            this.back = back;
        }

        Integer data;
        Node front;
        Node back;

        public Node(){

        }

        public Node(int d){

            this.data = d;
            this.front = null;
            this.back = null;
        }
    }

    private LinkedListImpl insertFirst(LinkedListImpl linkedList, Integer data){

        Node node = new Node(data);

        if(linkedList.head == null){
            head = node;
        }else {
            head.back = node;
            head.front = null;
            node.front = head;
            node.back = null;
            head = node;
        }
        return linkedList;
    }

    private LinkedListImpl insertLast(LinkedListImpl linkedList, Integer data) {

        Node new_node = new Node(data);
        if (linkedList.head == null) {

            head = new_node;
            return linkedList;
        }
        Node node = head;

        while(node.front != null){

            node = node.front;
        }

        node.front = new_node;
        new_node.back = node;

        return linkedList;
    }

    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedListImpl list = new LinkedListImpl();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = list.insertFirst(list, 1);
        list = list.insertFirst(list, 2);
        list = list.insertFirst(list, 3);

    }



}
