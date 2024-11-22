package PrW_12;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class AppSettings
{

    private static volatile AppSettings instance;

    private ConcurrentHashMap<String, String> settings;


    private AppSettings()
    {
        settings = new ConcurrentHashMap<>();
    }

    public static AppSettings getInstance()
    {
        if ( instance == null )
        {
            synchronized ( AppSettings.class )
            {
                if ( instance == null )
                {
                    instance = new AppSettings();
                }
            }
        }

        return instance;
    }

    public void setSetting( String key, String value )
    {
        settings.put( key, value );
    }

    public String getSetting( String key )
    {
        return settings.get( key );
    }

    public static void main( String[] args )
    {
        ExecutorService executor = Executors.newFixedThreadPool( 3 );

        Runnable task1 = () ->
        {
            AppSettings settings = AppSettings.getInstance();
            settings.setSetting( "Theme", "Dark" );
            System.out.println( "Task1 - Theme: " + settings.getSetting( "Theme" ) );
        };

        Runnable task2 = () ->
        {
            AppSettings settings = AppSettings.getInstance();
            settings.setSetting( "Language", "English" );
            System.out.println( "Task2 - Language: " + settings.getSetting( "Language" ) );
        };

        Runnable task3 = () ->
        {
            AppSettings settings = AppSettings.getInstance();
            System.out.println( "Task3 - Theme: " + settings.getSetting( "Theme" ) );
            System.out.println( "Task3 - Language: " + settings.getSetting( "Language" ) );
        };

        executor.submit( task1 );
        executor.submit( task2 );
        executor.submit( task3 );

        executor.shutdown();
    }

}
