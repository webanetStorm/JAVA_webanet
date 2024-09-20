package PrW_3.app;

import PrW_3.vehicles.Car;
import PrW_3.vehicles.ElectricCar;


public class Main
{

    public static void main( String[] args )
    {
        Car car = new Car( "Матвей Блантер", "123456789", "Petrol" );
        car.displayInfo();

        System.out.println( "\n---\n" );

        ElectricCar electricCar = new ElectricCar( "Александр Анахов", "987654321", 75 );
        electricCar.displayInfo();

        System.out.println( "\n---\n" );

        car.setOwnerName( "Михаил Комогоров" );
        car.setInsuranceNumber( "1122334455" );
        car.setEngineType( "Diesel" );
        System.out.println( "Обновленная информация о машине:" );
        car.displayInfo();
    }

}
