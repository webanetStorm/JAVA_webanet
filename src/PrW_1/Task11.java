package PrW_1;

import java.util.Scanner;


public class Task11
{

    private static final double ROUBLES_PER_YUAN = 11.91;


    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Введите количество юаней: " );

        int yuan = input.nextInt();
        double roubles = ROUBLES_PER_YUAN * yuan;

        System.out.println( "Результат: " + Math.ceil( roubles ) + " руб" );
    }

}