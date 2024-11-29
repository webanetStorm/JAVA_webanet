package PrW_13;


public class File implements FileComponent
{

    private final String name;


    public File( String name )
    {
        this.name = name;
    }

    @Override
    public void display()
    {
        System.out.println( "Файл: " + name );
    }

}
