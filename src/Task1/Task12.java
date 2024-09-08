package Task1;

import java.util.Scanner;


public class Task12
{

    private static final double ROUBLES_PER_YUAN = 11.91;


    public static void main( String[] args )
    {
        int yuan;
        double roubles, roundRubles;
        Scanner input = new Scanner( System.in );

        System.out.print( "Введите количество юаней: " );
        yuan = input.nextInt();

        roubles = ROUBLES_PER_YUAN * yuan;
        roundRubles = RoundMoney( roubles );
        String[] endingsYuan = GetEndings( yuan );
        String[] endingsRouble = GetEndings( (int) roundRubles );

        System.out.println( "Результат: " + yuan + " китайск" + endingsYuan[0] + " юан" + endingsYuan[1] + " = " + roundRubles + " российск" + endingsRouble[0] + " рубл" + endingsRouble[1] );
    }

    private static double RoundMoney( double value )
    {
        return Math.ceil( value );
    }

    private static String[] GetEndings( double value )
    {
        String[] result = new String[2];
        int digit;
        digit = (int) value % 10;

        switch ( digit )
        {
            case 1:
            {
                result[0] = "ий";
                result[1] = "ь";
                break;
            }
            case 2, 3, 4:
            {
                result[0] = "их";
                result[1] = "я";
                break;
            }
            default:
            {
                result[0] = "их";
                result[1] = "ей";
                break;
            }
        }

        return result;
    }

}
