package PrW_9.task2;


import java.util.ArrayList;


public class GenericStack2<E> extends ArrayList<E>
{

    public E peek()
    {
        return get( size() - 1 );
    }

    public void push( E value )
    {
        add( value );
    }

    public E pop()
    {
        return remove( size() - 1 );
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public int getSize()
    {
        return size();
    }

    @Override
    public String toString()
    {
        return "Стек: " + super.toString();
    }

}
