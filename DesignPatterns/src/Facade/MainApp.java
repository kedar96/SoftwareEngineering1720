package Facade;
public class MainApp
{
    public static void main(String[] args)
    {
        VehiclePortal vp = new VehiclePortal();

        vp.changeBikeTyres();

        vp.changeCarTyres();
    }
}
