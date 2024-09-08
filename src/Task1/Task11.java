package Task1;

import java.util.Scanner;


public class Task11
{

    private static final double ROUBLES_PER_YUAN = 11.91;


    public static void main( String[] args )
    {
        int yuan;
        double roubles;
        Scanner input = new Scanner( System.in );

        System.out.print( "Введите количество юаней: " );
        yuan = input.nextInt();
        roubles = ConvertYuanToRubles( yuan );
        System.out.println( "Результат: " + RoundMoney( roubles ) + " руб" );
    }

    private static double ConvertYuanToRubles( int yuan )
    {
        return ROUBLES_PER_YUAN * yuan;
    }

    private static double RoundMoney( double value )
    {
        return Math.ceil( value );
    }

}
