package PrW_13;


import java.util.ArrayList;
import java.util.List;


public class Directory implements FileComponent
{

    private final String name;

    private final List<FileComponent> components = new ArrayList<>();


    public Directory( String name )
    {
        this.name = name;
    }

    @Override
    public void add( FileComponent component )
    {
        this.components.add( component );
    }

    @Override
    public void display()
    {
        System.out.println( "Директория: " + this.name );

        for ( FileComponent component : this.components )
            component.display();
    }

}
