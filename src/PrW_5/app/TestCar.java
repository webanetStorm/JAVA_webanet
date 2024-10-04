package PrW_5.app;


import PrW_5.vehicles.Car;
import PrW_5.vehicles.ElectricCar;
import PrW_5.vehicles.Vehicle;


public class TestCar
{

    public static void main( String[] args )
    {
        Vehicle car = new Car( "Toyota", "A123BC", "Red", 2020, "Иван Иванов", "123456789" );
        ElectricCar electricCar = new ElectricCar( "Tesla", "B987YZ", "White", 2022, "Петр Петров", "987654321", "100" );

        car.setYear( 2021 );
        car.setOwnerName( "Матвей Блантер" );
        electricCar.setYear( 2023 );
        electricCar.setOwnerName( "Александр Анахов" );

        car.setInsuranceNumber( "1122334455" );
        electricCar.setInsuranceNumber( "5544332211" );

        System.out.println( "Емкость батареи электромобиля: " + electricCar.getBatteryCapacity() + " кВт*ч" );

        System.out.println( "\nИнформация о машине:" );
        System.out.println( car.echo() );

        System.out.println( "\nИнформация о электромобиле:" );
        System.out.println( electricCar.echo() );
    }

}
