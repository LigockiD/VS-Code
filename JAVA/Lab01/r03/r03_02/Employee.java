package r03.r03_02;

public class Employee implements Person, Identified, Measurable
{
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    // Brak definicji metody getID powoduje błąd kompilacji
    public int getId()
    {
        return Identified.super.getId();
    }
    @Override
    public double getMeasure(){
        return salary;
    }
    @Override
    public String getMeasureName(){
        return name;
    }

    private String name;
    private double salary;
}

