package PrW_5.vehicles;


public class ElectricCar extends Car implements ElectricVehicle
{

    private String batteryCapacity;


    public ElectricCar( String model, String license, String color, int year, String ownerName, String insuranceNumber, String batteryCapacity )
    {
        super( model, license, color, year, ownerName, insuranceNumber );
        this.batteryCapacity = batteryCapacity;
        this.setEngineType( "Electric" );
    }

    public String getBatteryCapacity()
    {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity( String  batteryCapacity )
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
