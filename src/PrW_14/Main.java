package PrW_14;


abstract class Logger
{

    protected Logger nextLogger;


    public void setNextLogger( Logger nextLogger )
    {
        this.nextLogger = nextLogger;
    }

    public void logMessage( String level, String message )
    {
        if ( this.nextLogger != null )
        {
            this.nextLogger.logMessage( level, message );
        }
    }

}



class InfoLogger extends Logger
{

    @Override
    public void logMessage( String level, String message )
    {
        if ( level.equalsIgnoreCase( "INFO" ) )
        {
            System.out.println( "INFO: " + message );
        }
        else if ( nextLogger != null )
        {
            nextLogger.logMessage( level, message );
        }
    }

}

class WarningLogger extends Logger
{

    @Override
    public void logMessage( String level, String message )
    {
        if ( level.equalsIgnoreCase( "WARNING" ) )
        {
            System.out.println( "WARNING: " + message );
        }
        else if ( nextLogger != null )
        {
            nextLogger.logMessage( level, message );
        }
    }

}



class ErrorLogger extends Logger
{

    @Override
    public void logMessage( String level, String message )
    {
        if ( level.equalsIgnoreCase( "ERROR" ) )
        {
            System.out.println( "ERROR: " + message );
        }
        else if ( nextLogger != null )
        {
            nextLogger.logMessage( level, message );
        }
    }

}



class CriticalLogger extends Logger
{

    @Override
    public void logMessage( String level, String message )
    {
        if ( level.equalsIgnoreCase( "CRITICAL" ) )
        {
            System.out.println( "CRITICAL: " + message );
        }
        else if ( nextLogger != null )
        {
            nextLogger.logMessage( level, message );
        }
    }

}

class DebugLogger extends Logger
{

    @Override
    public void logMessage( String level, String message )
    {
        if ( level.equalsIgnoreCase( "DEBUG" ) )
        {
            System.out.println( "DEBUG: " + message );
        }
        else if ( nextLogger != null )
        {
            nextLogger.logMessage( level, message );
        }
    }

}



public class Main
{

    public static void main( String[] args )
    {
        Logger infoLogger = new InfoLogger();
        Logger warningLogger = new WarningLogger();
        Logger errorLogger = new ErrorLogger();
        Logger criticalLogger = new CriticalLogger();
        Logger debugLogger = new DebugLogger();

        infoLogger.setNextLogger( warningLogger );
        warningLogger.setNextLogger( errorLogger );
        errorLogger.setNextLogger( criticalLogger );
        criticalLogger.setNextLogger( debugLogger );

        infoLogger.logMessage( "INFO", "This is an info message." );
        infoLogger.logMessage( "WARNING", "This is a warning message." );
        infoLogger.logMessage( "ERROR", "This is an error message." );
        infoLogger.logMessage( "CRITICAL", "This is a critical message." );
        infoLogger.logMessage( "DEBUG", "This is a debug message." );
    }

}

