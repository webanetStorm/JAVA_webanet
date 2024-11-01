package PrW_9.task1;


class Circle implements Comparable<Circle>
{

    private double radius;


    public Circle( double radius )
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    @Override
    public int compareTo( Circle other )
    {
        return Double.compare( this.radius, other.radius );
    }

    @Override
    public String toString()
    {
        return "Circle(radius=" + radius + ")";
    }

    public static <T extends Comparable<T>> T findMax( T[] array )
    {
        T max = array[0];

        for ( T element : array )
            if ( element.compareTo( max ) > 0 )
                max = element;

        return max;
    }

}
