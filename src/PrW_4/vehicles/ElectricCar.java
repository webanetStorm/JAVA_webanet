package PrW_4.vehicles;


public class ElectricCar extends Car
{

    private int batteryCapacity;


    public ElectricCar( String model, String license, String color, int year, String ownerName, String insuranceNumber, int batteryCapacity )
    {
        super( model, license, color, year, ownerName, insuranceNumber );
        this.batteryCapacity = batteryCapacity;
        this.setEngineType( "Electric" );
    }

    public int getBatteryCapacity()
    {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity( int batteryCapacity )
    {
        this.batteryCapacity = batteryCapacity;
    }

    public String vehicleType()
    {
        return "Electric Car";
    }

    @Override
    public String echo()
    {
        return super.echo() + ", Емкость батареи: " + this.batteryCapacity + " кВт*ч";
    }

}
