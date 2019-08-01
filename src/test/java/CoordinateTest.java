import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinateTest {

    @Test
    public void shouldHaveAtLeastOneCoordinate() {
        Coordinate coordinate = new Coordinate("A","1");
        assertEquals("A",coordinate.getX());
        assertEquals("1",coordinate.getY());
    }

    @Test
    public void shouldHaveAnotherCoordinate() {
        Coordinate coordinate = new Coordinate("J","10");
        assertEquals("J",coordinate.getX());
        assertEquals("10",coordinate.getY());
    }

    @Test
    public void shouldReturnTheCoordinateWord() {
        Coordinate coordinate = new Coordinate("B","7");
        assertEquals("B7",coordinate.getword());
    }

}