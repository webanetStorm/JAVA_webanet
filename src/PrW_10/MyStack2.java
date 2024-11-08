package PrW_10;


import java.util.ArrayList;


public class MyStack2 extends ArrayList<Object>
{

    public boolean isEmpty()
    {
        return super.isEmpty();
    }

    public int getSize()
    {
        return super.size();
    }

    public Object peek()
    {
        return this.get( getSize() - 1 );
    }

    public Object pop()
    {
        return this.remove( getSize() - 1 );
    }

    public void push( Object o )
    {
        this.add( o );
    }

}
