package coordinates;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {

    @Test
    public void coordinateShouldHaveStatus() {

    }

    @Test
    public void shouldHaveAtLeastOneCoordinate() {
        Cell coordinate = new Cell(Letter.A,1);
        assertEquals(Letter.A,coordinate.getX());
        int y = coordinate.getY();
        assertEquals(1,y);
    }

    @Test
    public void shouldHaveAnotherCoordinate() {
        Cell coordinate = new Cell(Letter.J,10);
        assertEquals(Letter.J,coordinate.getX());
        int y = coordinate.getY();
        assertEquals(10,y);
    }

    @Test
    public void shouldReturnTheCoordinateWord() {
        Cell coordinate = new Cell(Letter.B,7);
        assertEquals("B7",coordinate.getWord());
    }

    @Test
    public void shouldReturn1ForA1() {
        Cell coordinate = new Cell(Letter.A,1);
        assertEquals(1,coordinate.getInt());
    }

    @Test
    public void shouldReturn23forC3() {
        Cell coordinate = new Cell(Letter.C,3);
        assertEquals(23,coordinate.getInt());
    }

    @Test
    public void shouldReturn100forJ10() {
        Cell coordinate = new Cell(Letter.J,10);
        assertEquals(100,coordinate.getInt());
    }

}