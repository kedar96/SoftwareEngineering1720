package Facade;
public class VehiclePortal
{
    private  Vehicle bike,car;


    public VehiclePortal()
    {
        bike = new Bike();

        car = new Car();

    }


    public void changeBikeTyres()
    {
        bike.changeTyres();
    }


    public void changeCarTyres()
    {
        car.changeTyres();
    }


    public Vehicle getBike()
    {
        return bike;
    }


    public void setBike(Vehicle bike)
    {
        this.bike = bike;
    }


    public Vehicle getCar()
    {
        return car;
    }


    public void setCar(Vehicle car)
    {
        this.car = car;
    }

}
