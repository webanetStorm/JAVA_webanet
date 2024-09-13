package PrW_1;

import java.util.Scanner;


public class Task12
{

    private static final double ROUBLES_PER_YUAN = 11.91;


    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Введите количество юаней: " );

        int yuan = input.nextInt();
        double roubles = ROUBLES_PER_YUAN * yuan, roundRubles = Math.ceil( roubles );
        String[] endingsYuan = GetEndings( yuan ), endingsRouble = GetEndings( (int)roundRubles );

        System.out.println( "Результат: " + yuan + " китайск" + endingsYuan[0] + " юан" + endingsYuan[1] + " = " + roundRubles + " российск" + endingsRouble[0] + " рубл" + endingsRouble[1] );
    }

    private static String[] GetEndings( double value )
    {
        String[] result = new String[2];
        int lastDigit = (int)value % 10, lastTwoDigits = (int)value % 100;

        if ( lastTwoDigits >= 11 && lastTwoDigits <= 14 )
        {
            result[0] = "их";
            result[1] = "ей";
        }
        else
        {
            switch ( lastDigit )
            {
                case 1:
                    result[0] = "ий";
                    result[1] = "ь";
                    break;
                case 2, 3, 4:
                    result[0] = "их";
                    result[1] = "я";
                    break;
                default:
                    result[0] = "их";
                    result[1] = "ей";
                    break;
            }
        }

        return result;
    }

}
