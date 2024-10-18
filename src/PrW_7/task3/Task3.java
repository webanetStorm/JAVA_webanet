package PrW_7.task3;


import java.util.Scanner;


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



class Rectangle extends GeometricObject
{

    private double width;

    private double height;

    public Rectangle( double width, double height )
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return width * height;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * ( width + height );
    }

    @Override
    public String toString()
    {
        return "Прямоугольник: ширина = " + width + ", высота = " + height;
    }

}



public class Task3
{

    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Введите первую сторону треугольника: " );
        double side1 = input.nextDouble();

        System.out.print( "Введите вторую сторону треугольника: " );
        double side2 = input.nextDouble();

        System.out.print( "Введите третью сторону треугольника: " );
        double side3 = input.nextDouble();

        System.out.print( "Введите цвет треугольника: " );
        String color = input.next();

        System.out.print( "Треугольник закрашен? (true/false): " );
        boolean isFilled = input.nextBoolean();

        Triangle triangle = new Triangle( side1, side2, side3 );
        triangle.setColor( color );
        triangle.setFilled( isFilled );

        System.out.println( "\nТреугольник:" );
        System.out.println( "Площадь: " + triangle.getArea() );
        System.out.println( "Периметр: " + triangle.getPerimeter() );
        System.out.println( "Цвет: " + triangle.getColor() );
        System.out.println( "Закрашен: " + triangle.isFilled() );
        System.out.println( triangle );

        ComparableCircle circle1 = new ComparableCircle( 3.0 );
        ComparableCircle circle2 = new ComparableCircle( 4.0 );
        System.out.println( "\nНаибольший круг: " + GeometricObject.max( circle1, circle2 ) );

        Rectangle rect1 = new Rectangle( 2.0, 3.0 );
        Rectangle rect2 = new Rectangle( 4.0, 5.0 );
        System.out.println( "Наибольший прямоугольник: " + GeometricObject.max( rect1, rect2 ) );

        System.out.println( "\nСравнение круга и прямоугольника: " );
        System.out.println( "Наибольший объект: " + GeometricObject.max( circle1, rect1 ) );
    }

}
