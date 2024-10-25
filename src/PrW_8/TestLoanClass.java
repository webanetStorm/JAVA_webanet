package PrW_8;


import java.util.InputMismatchException;
import java.util.Scanner;


public class TestLoanClass
{

    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        try
        {
            System.out.print( "Введите годовую процентную ставку, например, 8.25: " );
            double annualInterestRate = input.nextDouble();

            System.out.print( "Введите срок кредита в годах: " );
            int numberOfYears = input.nextInt();

            System.out.print( "Введите сумму кредита в руб., например, 120000.95: " );
            double loanAmount = input.nextDouble();

            Loan loan = new Loan( annualInterestRate, numberOfYears, loanAmount );

            System.out.println( "Дата взятия кредита: " + loan.getLoanDate() );
            System.out.println( "Ежемесячный платеж: " + Math.round( loan.getMonthlyPayment() * 100 ) / 100.0 + " руб." );
            System.out.println( "Общая стоимость кредита: " + Math.round( loan.getTotalPayment() * 100 ) / 100.0 + " руб." );

        }
        catch ( IllegalArgumentException e )
        {
            System.out.println( "Ошибка: " + e.getMessage() );
        }
        catch ( InputMismatchException e )
        {
            System.out.println( "Ошибка ввода: введите корректные значения" );
        }
    }

}
