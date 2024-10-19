package PrW_7.task4;


interface Colorable
{
    void howToColor();
}

abstract class GeometricObject implements Comparable<GeometricObject>
{

    private String color;

    private boolean filled;


    public GeometricObject()
    {
        this.color = "white";
        this.filled = false;
    }

    public GeometricObject( String color, boolean filled )
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor( String color )
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled( boolean filled )
    {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo( GeometricObject o )
    {
        return Double.compare( this.getArea(), o.getArea() );
    }

    public static GeometricObject max( GeometricObject obj1, GeometricObject obj2 )
    {
        return ( obj1.compareTo( obj2 ) > 0 ) ? obj1 : obj2;
    }

    @Override
    public String toString()
    {
        return "Цвет: " + color + ", Закрашен: " + filled;
    }

}



class Square extends GeometricObject implements Colorable
{

    private double side;


    public Square()
    {
        this.side = 0;
    }

    public Square( double side )
    {
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide( double side )
    {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return side * side;
    }

    @Override
    public double getPerimeter()
    {
        return 4 * side;
    }

    @Override
    public void howToColor()
    {
        System.out.println( "Раскрасьте все четыре стороны." );
    }

    @Override
    public String toString()
    {
        return "Квадрат со стороной: " + side;
    }

}

class ComparableCircle extends GeometricObject
{

    private double radius;


    public ComparableCircle( double radius )
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius( double radius )
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return "Круг с радиусом: " + radius;
    }

}



class Triangle extends GeometricObject
{

    private double side1;

    private double side2;

    private double side3;


    public Triangle()
    {
        this( 1.0, 1.0, 1.0 );
    }

    public Triangle( double side1, double side2, double side3 )
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }

    @Override
    public double getArea()
    {
        double s = ( side1 + side2 + side3 ) / 2;
        return Math.sqrt( s * ( s - side1 ) * ( s - side2 ) * ( s - side3 ) );
    }

    @Override
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    @Override
    public String toString()
    {
        return "Треугольник: сторона1 = " + side1 + ", сторона2 = " + side2 + ", сторона3 = " + side3;
    }

}



public class Task4
{

    public static void main( String[] args )
    {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square( 4.0 );
        objects[1] = new ComparableCircle( 3.0 );
        objects[2] = new Triangle( 3.0, 4.0, 5.0 );
        objects[3] = new Square( 5.0 );
        objects[4] = new ComparableCircle( 2.0 );

        for ( GeometricObject obj : objects )
        {
            System.out.println( obj );
            System.out.println( "Площадь: " + obj.getArea() );

            if ( obj instanceof Colorable )
            {
                ( (Colorable)obj ).howToColor();
            }

            System.out.println();
        }
    }

}

