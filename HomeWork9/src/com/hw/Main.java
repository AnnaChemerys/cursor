package com.hw;

public class Main {
    public static void main(String[] args) {

        System.out.println("Example 1");
        MyQueue<String> newMyQueue = new MyQueue<String>();
        newMyQueue.offer("6");
        System.out.println("Test method offer() " + newMyQueue.toString());
        newMyQueue.add("7");
        System.out.println("Test method isEmpty() " + newMyQueue.isEmpty());
        System.out.println("Test method isFull() " + newMyQueue.isFull());
        System.out.println("Test method add() " + newMyQueue.toString());
        newMyQueue.add("4");
        System.out.println("Test method add() " + newMyQueue.toString());
        System.out.println("Test method getElement() " + newMyQueue.getElement());
        System.out.println("Size is " + newMyQueue.size());
        newMyQueue.remove();
        System.out.println("Test method remove() " + newMyQueue.toString());
        System.out.println("Test method peek() " + newMyQueue.peek());
        newMyQueue.poll();
        System.out.println("Test method poll() " + newMyQueue.toString());

        System.out.println("");
        System.out.println("Example 2");

        MyQueue<String> newMyQueue2 = new MyQueue<String>(3);
        newMyQueue2.offer("6");
        System.out.println("Test method offer() " + newMyQueue2.toString());
        newMyQueue2.add("7");
        System.out.println("Test method isEmpty() " + newMyQueue2.isEmpty());
        System.out.println("Test method isFull() " + newMyQueue2.isFull());
        System.out.println("Test method add() " + newMyQueue2.toString());
        newMyQueue2.add("4");
        System.out.println("Test method add() " + newMyQueue2.toString());
        System.out.println("Test method getElement() " + newMyQueue2.getElement());
        System.out.println("Size is " + newMyQueue2.size());
        System.out.println("Test method isFull() " + newMyQueue2.isFull());
        newMyQueue2.remove();
        System.out.println("Test method remove() " + newMyQueue2.toString());
        System.out.println("Test method peek() " + newMyQueue2.peek());
        newMyQueue2.poll();
        System.out.println("Test method poll() " + newMyQueue2.toString());
    }
}
