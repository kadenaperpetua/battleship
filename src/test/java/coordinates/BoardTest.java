package coordinates;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void shouldContainListOf100Cells() {
        Board board = new Board();
        int count = board.getCells().size();
        assertEquals(100,count);
    }

    @Test
    public void shouldContainACellA10() {
        Board board = new Board();
        List listOfCells = board.getCells();
        Cell lastCell = (Cell) listOfCells.get(9);
        assertEquals("A10", lastCell.getWord());
    }

    @Test
    public void shouldContainACellJ10() {
        Board board = new Board();
        List listOfCells = board.getCells();
        Cell lastCell = (Cell) listOfCells.get(99);
        assertEquals("J10", lastCell.getWord());
    }
}