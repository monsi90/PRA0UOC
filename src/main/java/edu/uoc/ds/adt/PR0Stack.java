package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR0Stack {

    // Capacitat màxima de la seqüència.
    public final int CAPACITY = 9;

    //canviam el tipus de dada a Integer en lloc de caràcter.
    private Stack<Integer> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Integer>(CAPACITY);
    }
    public void fillStack() {
        //en aquest bucle canviam el valor de c per un integer i eliminam les comes. També s'introdueix el valor
        //de l'enter directament a la pila
        for (int c = 0; c < 9; c++) {
            stack.push(c);
        }
    }
    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString();
    }
    //canviam el tipus de dada de Char a Integer.
    public Stack<Integer> getStack() {
        return this.stack;
    }
}
