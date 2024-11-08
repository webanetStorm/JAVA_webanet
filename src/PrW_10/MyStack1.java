package PrW_10;


import java.util.ArrayList;


public class MyStack1
{

    private ArrayList<Object> list = new ArrayList<>();


    public boolean isEmpty()
    {
        return this.list.isEmpty();
    }

    public int getSize()
    {
        return this.list.size();
    }

    public Object peek()
    {
        return this.list.get( getSize() - 1 );
    }

    public Object pop()
    {
        return this.list.remove( getSize() - 1 );
    }

    public void push( Object o )
    {
        this.list.add( o );
    }

}
