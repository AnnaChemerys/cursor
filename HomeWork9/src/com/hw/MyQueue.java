package com.hw;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyQueue<T> implements Iterable<T> {


    private Node<T> head = null;
    private Node<T> tail = null;
    private int currentCapacity;
    private int size;

    private static class Node<T> {
        private T element;
        private Node<T> nextElement;
    }

    public MyQueue(int capacity) {
        currentCapacity = capacity;
        size = 0;
    }

    public MyQueue() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return currentCapacity == size && size != 0;
    }

    public boolean add(T element) {
        Node<T> oldTail = tail;
        tail = new Node<T>();
        tail.element = element;
        tail.nextElement = null;
        if (isFull()) {
            throw new IllegalStateException("The MyQueue is full");
        }
        if (isEmpty()) {
            head = tail;
        } else {
            oldTail.nextElement = tail;
        }
        size++;
        return true;
    }

    public boolean offer(T element) {
        Node<T> oldTail = tail;
        tail = new Node<T>();
        tail.element = element;
        tail.nextElement = null;
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            head = tail;
        } else {
            oldTail.nextElement = tail;
        }
        size++;
        return true;
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("The MyQueue is empty");
        }
        T element = head.element;
        head = head.nextElement;
        size--;
        return element;
    }

    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T element = head.element;
        head = head.nextElement;
        size--;
        return element;
    }

    public T getElement() {
        if (isEmpty()) {
            throw new NoSuchElementException("The MyQueue is empty");
        }
        return head.element;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return head.element;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(head);
    }

    private static class MyIterator<T> implements Iterator<T> {

        private Node<T> currentElement;

        public MyIterator(Node<T> head) {
            currentElement = head;
        }

        @Override
        public boolean hasNext() {
            return currentElement != null;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException("There is no next element");
            T element = currentElement.element;
            currentElement = currentElement.nextElement;
            return element;
        }
    }

    @Override
    public String toString() {
        StringBuilder newString = new StringBuilder();
        for (T element : this) {
            newString.append(element);
            newString.append(", ");
        }
        return newString.toString();
    }
}
