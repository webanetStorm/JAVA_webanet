package PrW_10;


import java.util.Scanner;


public class Main
{

    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        MyStack3 stack = new MyStack3();

        System.out.println( "Введите 5 строк:" );
        for ( int i = 0; i < 5; i++ )
            stack.push( input.nextLine() );

        System.out.println( "Строки в обратном порядке:" );
        while ( !stack.isEmpty() )
            System.out.println( stack.pop() );
    }

}
