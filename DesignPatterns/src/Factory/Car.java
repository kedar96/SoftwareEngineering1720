package Factory;

public class Car implements Vehicle
{
    @Override
    public void changeTyres()
    {
        System.out.println("Changed 4 Car tyres");
    }
}