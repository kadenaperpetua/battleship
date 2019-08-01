import org.junit.Test;

import static org.junit.Assert.*;

public class BoatTest {

    @Test
    public void shouldHaveACoordinate() {
        Boat boat = new Boat("A",1);
        Coordinate coordinate = boat.getCoordinate();
        assertEquals("A",coordinate.getX());
    }
}