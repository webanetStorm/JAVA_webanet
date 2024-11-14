package PrW_11;


public class Main
{

    public static void main( String[] args )
    {
        StackOnQueue stack = new StackOnQueue();

        stack.push( 10 );
        stack.push( 20 );

        System.out.println( "Текущий элемент на вершине (top): " + stack.top() );
        System.out.println( "Удаленный элемент (pop): " + stack.pop() );
        System.out.println( "Стек пуст? " + stack.empty() );
        System.out.println( stack );
    }

}
