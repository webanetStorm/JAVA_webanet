package PrW_3.vehicles;


public class Car
{

    private String ownerName;

    private String insuranceNumber;

    protected String engineType;


    public Car( String ownerName, String insuranceNumber, String engineType )
    {
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public String getOwnerName()
    {
        return this.ownerName;
    }

    public void setOwnerName( String ownerName )
    {
        this.ownerName = ownerName;
    }

    public String getInsuranceNumber()
    {
        return this.insuranceNumber;
    }

    public void setInsuranceNumber( String insuranceNumber )
    {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEngineType()
    {
        return this.engineType;
    }

    public void setEngineType( String engineType )
    {
        this.engineType = engineType;
    }

    public void displayInfo()
    {
        System.out.println( "Владелец: " + ownerName );
        System.out.println( "Номер страховки: " + insuranceNumber );
        System.out.println( "Тип двигателя: " + engineType );
    }

}
