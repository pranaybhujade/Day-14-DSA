package com.bridgelabz.datastructure;

public class LinkedList {
    private Node head;
    private Node tail;
    private Node<K> head;
    private Node<K> tail;

    public void add(K key) {
        Node<K> node = new Node<>(key);
        @ @ -29, 11 + 29, 17 @@public void insert (K key){
            node.setNext(tail);
            head.setNext(node);
        }
        public K pop () {
            K deleteData = head.getData();
            this.head = head.getNext();
            return deleteData;
        }
        public static void main (String[]args){
            LinkedList linkedList = new LinkedList();
            linkedList.append(56);
            linkedList.append(30);
            linkedList.append(70);

            linkedList.insert(56);
            System.out.println(linkedList.pop());
        }
    }
}



