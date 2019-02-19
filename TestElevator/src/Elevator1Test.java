import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Elevator1Test {
    @Test
    public void testMoveToThirdFloorFromGroundFloor(){
        Elevator1 elevator=new Elevator1();
        elevator.goTo(3);
        assertEquals(new Integer(3),elevator.getCurrentFloor());
    }
}