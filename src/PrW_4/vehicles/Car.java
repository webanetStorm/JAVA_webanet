package PrW_4.vehicles;


public class Car extends Vehicle
{

    public Car( String model, String license, String color, int year, String ownerName, String insuranceNumber )
    {
        super( model, license, color, year, ownerName, insuranceNumber );
        this.setEngineType( "Petrol" );
    }

    public String vehicleType()
    {
        return "Car";
    }

}

