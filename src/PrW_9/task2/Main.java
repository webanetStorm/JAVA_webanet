package PrW_9.task2;


import java.util.Scanner;


public class Main
{

    public static void main( String[] args )
    {
        GenericStack2<String> stack = new GenericStack2<>();
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Введите 5 строк:" );
        for ( int i = 0; i < 5; i++ )
            stack.push( scanner.nextLine() );

        System.out.println( "Строки в обратном порядке:" );
        while ( !stack.isEmpty() )
            System.out.println( stack.pop() );
    }

}
