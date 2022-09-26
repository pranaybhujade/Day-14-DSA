package com.bridgelabz.datastructure;

public class LinkedList {
    public class LinkedList<K> {
        private Node head;
        private Node tail;

        public void add(K key) {
            Node<K> node = new Node<>(key);
            if (head == null) {
                this.head = node;
                this.tail = node;
            } else {
                node.setNext(head);
                head = node;
            }
        }

        public static void main(String[] args) {
            Node<Integer> node1 = new Node<>(56);
            Node<Integer> node2 = new Node<>(30);
            Node<Integer> node3 = new Node<>(70);
            node1.setNext(node2);
            node2.setNext(node3);

            LinkedList linkedList = new LinkedList();
            linkedList.add(56);
            linkedList.add(30);
            linkedList.add(70);
        }
    }
}


