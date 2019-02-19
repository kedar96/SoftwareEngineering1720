package Factory;

public class Main
{
    public static void main(String[] args)
    {
        Vehicle v1=VehicleFactory.createVehicle("car");
        v1.changeTyres();
        Vehicle v2=VehicleFactory.createVehicle("bike");
        v2.changeTyres();
    }
}
