package Factory;
import java.util.logging.Logger;
import java.util.logging.Level;
public class Car implements Vehicle
{
    @Override
    public void changeTyres()
    {
        Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        LOGGER.log(Level.INFO,"Changed 4 Car tyres");
    }
}