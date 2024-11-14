package PrW_11;


import java.util.LinkedList;
import java.util.Queue;


public class StackOnQueue
{

    private Queue<Integer> queue1 = new LinkedList<>();

    private Queue<Integer> queue2 = new LinkedList<>();


    public void push( int x )
    {
        this.queue2.add( x );

        while ( !this.queue1.isEmpty() )
            this.queue2.add( this.queue1.poll() );

        Queue<Integer> temp = this.queue1;
        this.queue1 = this.queue2;
        this.queue2 = temp;
    }

    public int pop()
    {
        if ( this.empty() )
            throw new IllegalStateException( "Стек пуст" );

        return this.queue1.poll();
    }

    public int top()
    {
        if ( this.empty() )
            throw new IllegalStateException( "Стек пуст" );

        return this.queue1.peek();
    }

    public boolean empty()
    {
        return this.queue1.isEmpty();
    }

    @Override
    public String toString()
    {
        return "Элементы стека: " + this.queue1.toString();
    }

}
