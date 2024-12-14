package PrW_15;


import java.io.*;
import java.net.*;


public class CalculatorHttpServer
{

    private static final int PORT = 3131;


    public static void main( String[] args )
    {
        try ( ServerSocket serverSocket = new ServerSocket( PORT ) )
        {
            System.out.println( "Calculator HTTP Server запущен на порту " + PORT );

            while ( true )
            {
                try ( Socket clientSocket = serverSocket.accept() )
                {
                    handleClient( clientSocket );
                }
            }
        }
        catch ( IOException e )
        {
            System.err.println( "Ошибка запуска сервера: " + e.getMessage() );
        }
    }

    private static void handleClient( Socket clientSocket ) throws IOException
    {
        BufferedReader in = new BufferedReader( new InputStreamReader( clientSocket.getInputStream(), "UTF-8" ) );
        PrintWriter out = new PrintWriter( new OutputStreamWriter( clientSocket.getOutputStream(), "UTF-8" ) );

        String line = in.readLine();
        if ( line == null ) return;

        String[] requestParts = line.split( " " );
        String method = requestParts[0];
        String path = requestParts[1];

        if ( method.equals( "GET" ) && path.startsWith( "/calculate" ) )
        {
            handleCalculation( path, out );
        }
        else
        {
            sendHttpResponse( out, 404, "Not Found" );
        }

        out.flush();
    }

    private static void handleCalculation( String path, PrintWriter out )
    {
        try
        {
            String query = path.split( "\\?" )[1];
            String[] params = query.split( "&" );
            double a = Double.parseDouble( getParamValue( params, "a" ) );
            double b = Double.parseDouble( getParamValue( params, "b" ) );
            String op = getParamValue( params, "op" );

            double result = switch ( op )
            {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" ->
                {
                    if ( b == 0 ) throw new ArithmeticException( "Деление на ноль" );
                    yield a / b;
                }
                default -> throw new IllegalArgumentException( "Недопустимая операция" );
            };

            sendHttpResponse( out, 200, "Результат: " + result );
        }
        catch ( Exception e )
        {
            sendHttpResponse( out, 400, "Ошибка: " + e.getMessage() );
        }
    }

    private static String getParamValue( String[] params, String key )
    {
        for ( String param : params )
        {
            String[] keyValue = param.split( "=" );
            if ( keyValue[0].equals( key ) )
            {
                return keyValue[1];
            }
        }
        throw new IllegalArgumentException( "Параметр " + key + " отсутствует" );
    }

    private static void sendHttpResponse( PrintWriter out, int statusCode, String body )
    {
        out.println( "HTTP/1.1 " + statusCode + " OK" );
        out.println( "Content-Type: text/plain; charset=UTF-8" );
        out.println( "Content-Length: " + body.getBytes().length );
        out.println();
        out.println( body );
    }

}
