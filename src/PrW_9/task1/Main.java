package PrW_9.task1;


import java.util.ArrayList;
import java.util.Arrays;


public class Main
{

    public static void main( String[] args )
    {
        ArrayList<Integer> listWithDuplicates = new ArrayList<>( Arrays.asList( 1, 2, 3, 2, 4, 1, 5, 3 ) );
        System.out.println( "Список с дубликатами: " + listWithDuplicates );
        System.out.println( "Список без дубликатов: " + Array.removeDuplicates( listWithDuplicates ) );

        String[] words = { "java", "c++", "php", "c#", "swift" };
        String target = "php";
        int index = Array.linearSearch( target, words );
        System.out.println( "\nИндекс элемента \"" + target + "\": " + ( index >= 0 ? index : "Элемент не найден" ) );

        Circle[] circles = { new Circle( 2.5 ), new Circle( 3.5 ), new Circle( 1.2 ) };
        System.out.println( "\nНаибольший круг: " + Circle.findMax( circles ) );

        Integer[][] numbers2D = { { 3, 5, 9 }, { 7, 8, 2 }, { 4, 6, 10 } };
        System.out.println( "\nНаибольшее значение в двумерном массиве: " + Array.findMax( numbers2D ) );
    }

}
