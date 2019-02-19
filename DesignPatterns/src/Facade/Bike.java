package Facade;

import java.util.logging.Logger;
import java.util.logging.Level;
public class Bike extends Vehicle
{
    @Override
    public void changeTyres()
    {
        Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        LOGGER.log(Level.INFO,"changed bike 2 tyres");
    }
}
