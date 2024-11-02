package PrW_8;


import java.util.InputMismatchException;
import java.util.Scanner;


public class MonthDays
{

    public static void main( String[] args )
    {
        String[] months = { "январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь" };
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Scanner scanner = new Scanner( System.in );

        try
        {
            System.out.print( "Введите число от 1 до 12: " );
            int monthIndex = scanner.nextInt() - 1;

            if ( monthIndex == 1 )
            {
                System.out.print( "Введите год: " );
                int yearInp = scanner.nextInt();

                if ( yearInp <= 0 )
                {
                    throw new InputMismatchException( "Некорректный год" );
                }
                else
                {
                    daysInMonth[monthIndex] = 29;
                }
            }

            System.out.println( "Месяц: " + months[monthIndex] );
            System.out.println( "Количество дней: " + daysInMonth[monthIndex] );
        }
        catch ( ArrayIndexOutOfBoundsException e )
        {
            System.out.println( "Вы ввели недопустимое число" );
        }
        catch ( InputMismatchException e )
        {
            System.out.println( "Некорректный ввод" );
        }
    }

    public static boolean isLeapYear( int year )
    {
        return ( year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0 );
    }

}
