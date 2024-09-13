package PrW_2;


public class Car
{

    private final String _model;

    private final String _license;

    private final String _color;

    private int _year;


    public Car( String model, String license, String color, int year )
    {
        this._model = model;
        this._license = license;
        this._color = color;
        this._year = year;
    }

    public Car()
    {
        this._model = "Unknown";
        this._license = "*******";
        this._color = "#fff";
        this._year = 1970;
    }

    public Car( String model, int year )
    {
        this._model = model;
        this._year = year;
        this._license = "*******";
        this._color = "#fff";
    }

    public void SetYear( int year )
    {
        this._year = year;
    }

    public void Echo()
    {
        System.out.println( "Модель: " + _model );
        System.out.println( "Номер: " + _license );
        System.out.println( "Цвет: " + _color );
        System.out.println( "Год: " + _year );
        System.out.println();
    }

}
