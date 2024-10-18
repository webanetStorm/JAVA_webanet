package PrW_7.task12;


class GeometricObject
{

    private String color;

    private boolean isFilled;

    public GeometricObject()
    {
        this.color = "white";
        this.isFilled = false;
    }

    public GeometricObject( String color, boolean isFilled )
    {
        this.color = color;
        this.isFilled = isFilled;
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
        return isFilled;
    }

    public void setFilled( boolean isFilled )
    {
        this.isFilled = isFilled;
    }

    @Override
    public String toString()
    {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }

}



class IllegalTriangleException extends Exception
{

    public IllegalTriangleException( String message )
    {
        super( message );
    }

}



class Triangle extends GeometricObject
{

    private double side1;

    private double side2;

    private double side3;


    public Triangle() throws IllegalTriangleException
    {
        this( 1.0, 1.0, 1.0 );
    }

    public Triangle( double side1, double side2, double side3 ) throws IllegalTriangleException
    {
        if ( ( side1 + side2 <= side3 ) || ( side1 + side3 <= side2 ) || ( side2 + side3 <= side1 ) )
        {
            throw new IllegalTriangleException( "Стороны не образуют треугольник!" );
        }
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

    public double getArea()
    {
        double s = ( side1 + side2 + side3 ) / 2;
        return Math.sqrt( s * ( s - side1 ) * ( s - side2 ) * ( s - side3 ) );
    }

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



public class Task12
{

    public static void main( String[] args )
    {
        java.util.Scanner input = new java.util.Scanner( System.in );

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

        try
        {
            Triangle triangle = new Triangle( side1, side2, side3 );
            triangle.setColor( color );
            triangle.setFilled( isFilled );

            System.out.println( "Площадь треугольника: " + triangle.getArea() );
            System.out.println( "Периметр треугольника: " + triangle.getPerimeter() );
            System.out.println( "Цвет треугольника: " + triangle.getColor() );
            System.out.println( "Треугольник закрашен: " + triangle.isFilled() );
            System.out.println( triangle );
        }
        catch ( IllegalTriangleException e )
        {
            System.out.println( e.getMessage() );
        }
    }

}
