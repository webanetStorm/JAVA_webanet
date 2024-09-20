package PrW_3.vehicles;


public class ElectricCar extends Car
{

    private int batteryCapacity;


    public ElectricCar( String ownerName, String insuranceNumber, int batteryCapacity )
    {
        super( ownerName, insuranceNumber, "Electric" );
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity()
    {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity( int batteryCapacity )
    {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println( "Емкость батареи: " + batteryCapacity + " кВт*ч" );
    }

}
