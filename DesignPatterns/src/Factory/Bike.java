package Factory;

public class Bike implements Vehicle
{
    @Override
    public void changeTyres()
    {
        System.out.println("changed bike 2 tyres");
    }
}
