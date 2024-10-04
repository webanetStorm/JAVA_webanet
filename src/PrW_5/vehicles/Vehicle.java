package PrW_5.vehicles;


public abstract class Vehicle
{

    private String model;

    private String license;

    private String color;

    private int year;

    private String ownerName;

    private String insuranceNumber;

    protected String engineType;


    public Vehicle( String model, String license, String color, int year, String ownerName, String insuranceNumber )
    {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    public abstract String vehicleType();

    public String getModel()
    {
        return this.model;
    }

    public void setModel( String model )
    {
        this.model = model;
    }

    public String getLicense()
    {
        return this.license;
    }

    public void setLicense( String license )
    {
        this.license = license;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor( String color )
    {
        this.color = color;
    }

    public int getYear()
    {
        return this.year;
    }

    public void setYear( int year )
    {
        this.year = year;
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

    public String echo()
    {
        return "Модель: " + this.model + ", Номер: " + this.license + ", Цвет: " + this.color +
                ", Год: " + this.year + ", Владелец: " + this.ownerName + ", Страховой номер: " + this.insuranceNumber +
                ", Тип двигателя: " + this.engineType;
    }

}
