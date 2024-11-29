package PrW_13;


public interface FileComponent
{

    void display();

    default void add( FileComponent component )
    {
        throw new UnsupportedOperationException( "Невозможно добавить в файл" );
    }

}
