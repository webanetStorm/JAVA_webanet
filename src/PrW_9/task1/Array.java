package PrW_9.task1;


import java.util.ArrayList;


public abstract class Array
{

    public static <T> ArrayList<T> removeDuplicates( ArrayList<T> array )
    {
        ArrayList<T> uniqueList = new ArrayList<>();

        for ( T element : array )
            if ( !uniqueList.contains( element ) )
                uniqueList.add( element );

        return uniqueList;
    }

    public static <T> int linearSearch( T needle, T[] haystack )
    {
        for ( int i = 0; i < haystack.length; i++ )
            if ( haystack[i].equals( needle ) )
                return i;

        return -1;
    }

    public static <T extends Comparable<T>> T findMax( T[][] array )
    {
        T max = array[0][0];

        for ( T[] row : array )
            for ( T element : row )
                if ( element.compareTo( max ) > 0 )
                    max = element;

        return max;
    }

}
