package PrW_9.task2;


public class GenericStack1<E>
{

    private static final int INITIAL_CAPACITY = 10;

    private E[] elements;

    private int size;


    @SuppressWarnings("unchecked")
    public GenericStack1()
    {
        elements = (E[])new Object[INITIAL_CAPACITY];
    }

    public int getSize()
    {
        return size;
    }

    public E peek()
    {
        return elements[size - 1];
    }

    public void push( E value )
    {
        if ( size == elements.length )
            resize();

        elements[size++] = value;
    }

    public E pop()
    {
        E value = elements[--size];
        elements[size] = null;

        return value;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    private void resize()
    {
        @SuppressWarnings("unchecked")
        E[] newArray = (E[])new Object[elements.length * 2];
        System.arraycopy( elements, 0, newArray, 0, elements.length );
        elements = newArray;
    }

}
