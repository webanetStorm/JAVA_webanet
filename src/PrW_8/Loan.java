package PrW_8;


import java.util.Date;


public class Loan
{

    private double annualInterestRate;

    private double loanAmount;

    private int numberOfYears;

    private Date loanDate;


    public Loan()
    {
        this( 2.5, 1, 1000 );
    }

    public Loan( double annualInterestRate, int numberOfYears, double loanAmount )
    {
        if ( annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0 )
        {
            throw new IllegalArgumentException( "Значения процентной ставки, срока или суммы кредита должны быть больше 0" );
        }

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate( double annualInterestRate )
    {
        if ( annualInterestRate <= 0 )
        {
            throw new IllegalArgumentException( "Процентная ставка должна быть больше 0" );
        }

        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears()
    {
        return this.numberOfYears;
    }

    public void setNumberOfYears( int numberOfYears )
    {
        if ( numberOfYears <= 0 )
        {
            throw new IllegalArgumentException( "Срок должен быть больше 0" );
        }

        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount()
    {
        return this.loanAmount;
    }

    public void setLoanAmount( double loanAmount )
    {
        if ( loanAmount <= 0 )
        {
            throw new IllegalArgumentException( "Сумма кредита должна быть больше 0" );
        }

        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment()
    {
        double monthlyInterestRate = this.annualInterestRate / 1200;

        return this.loanAmount * monthlyInterestRate / ( 1 - ( 1 / Math.pow( 1 + monthlyInterestRate, this.numberOfYears * 12 ) ) );
    }

    public double getTotalPayment()
    {
        return this.getMonthlyPayment() * this.numberOfYears * 12;
    }

    public Date getLoanDate()
    {
        return this.loanDate;
    }

}
