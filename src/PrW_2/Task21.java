package PrW_2;


public class Task21
{

    public static void main( String[] args )
    {
        Car car1 = new Car( "Aurus", "А777АА77", "Red", 2018 );
        car1.Echo();

        Car car2 = new Car();
        car2.Echo();

        Car car3 = new Car( "Ford", 2016 );
        car3.Echo();

        System.out.println( "Изменение года выпуска для автомобиля №3...\n" );
        car3.SetYear( 2015 );
        car3.Echo();
    }

}
