package PrW_4.app;


import PrW_4.vehicles.Vehicle;
import PrW_4.vehicles.Car;
import PrW_4.vehicles.ElectricCar;


public class TestCar
{

    public static void main( String[] args )
    {
        Vehicle car = new Car( "Toyota", "А777АА", "Черный", 2020, "Михаил Комогоров", "123456789" );
        Vehicle electricCar = new ElectricCar( "Tesla", "А777МР", "Белый", 2022, "Александр Анахов", "987654321", 100 );

        System.out.println( "Информация о машине:" );
        System.out.println( car.echo() );

        System.out.println( "\nИнформация о электромобиле:" );
        System.out.println( electricCar.echo() );

        car.setOwnerName( "Матвей Блантер" );
        electricCar.setOwnerName( "Константин Бугров " );

        System.out.println( "\nИзмененная информация о машине:" );
        System.out.println( car.echo() );

        System.out.println( "\nИзмененная информация о электромобиле:" );
        System.out.println( electricCar.echo() );
    }

}
