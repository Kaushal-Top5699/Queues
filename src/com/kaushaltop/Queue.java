package com.kaushaltop;

/**
 * Algorithm------
 * step 1) create front = 0, rear = -1, an array named queue, and a variable for holding maxSize of array.
 * step 2) first create isFull() method of boolean type, if(rear == maxSize-1) then queue is full.
 * step 3) second create isEmpty() method of boolean type, if(front<0 || front >rear) then queue is empty.
 * step 4) create an insert(int item) method for inserting, check whether queue is full then insert the item.
 * step 5) to insert increment rear and insert item, rear++ and queue[rear] = item.
 * step 6) create an remove() method that removes the first in item in queue, first check whether queue is empty.
 * step 7) get the item located at start index or front index and then increment front, int data = queue[front]; then front++;
 * step 8) create two more methods named peak() and rear(), that usually get first and last item in the queue.
 * step 9) happy coding!! :)
 */
public class Queue {

    private int front = 0;
    private int rear = -1;
    private int[] queue;
    private int maxSize;

    public Queue(int size) {

        this.maxSize = size;
        this.queue = new int[maxSize];
    }

    public boolean isFull() {

        if (rear == maxSize-1) {

            return true;
        } else {

            return false;
        }
    }

    public boolean isEmpty() {

        if (front<0 || front>rear) {

            return true;
        } else {

            return false;
        }
    }

    public int peak() {

        return queue[front];
    }

    public int rear() {

        return queue[rear];
    }

    public void insert(int item) {

        if (isFull()) {

            System.out.println("Queue is full");

        } else {

            rear++;
            queue[rear] = item;
        }
    }

    public int remove() {

        if (isEmpty()) {

            System.out.println("Queue is already empty");
            return -1;

        } else {

            int data = queue[front];
            front++;
            return data;
        }
    }
}
