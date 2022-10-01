package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR0Queue {

    public final int CAPACITY = 9;

    //private Queue<Character> queue;
    //canviam la linea amb la cua amb caràcters per una cua amb Integers
    private Queue<Integer> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public void fillQueue() {
        //for (char c = '0'; c < '9'; c++) {
            //queue.add(Character.valueOf(c));
        //}
        //canviam el valor de les lletres per un valor enter
        for (int i=0;i<9;i++){
            queue.add(i);
        }
    }


    //public String clearFullQueue() {
        //StringBuilder sb = new StringBuilder();
        //char r;
        //while (!queue.isEmpty()) {
            //sb.append(queue.poll()).append(" ");
        //}
        //return sb.toString();
    //}

    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
            }
        return sb.toString();
    }

    //public Queue<Character> getQueue() {return this.queue;}

    public Queue<Integer> getQueue() {return this.queue;}
}
