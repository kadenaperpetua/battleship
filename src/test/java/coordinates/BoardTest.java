package coordinates;

import org.junit.Test;

import static coordinates.Status.*;
import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void shouldContainListOf100Cells() {
        Board board = new Board();
        int count = board.getCells().size();
        assertEquals(100, count);
    }

    @Test
    public void shouldDrawEmptyBoard() {
        Board board = new Board();
        BoardTestHelper helper = new BoardTestHelper();
        assertEquals(helper.getEmptyBoard(), board.drawBoard());
    }

    @Test
    public void shouldDrawCustomBoard() {
        Board board = new Board();
        board.setCellStatus(25, HIT);
        board.setCellStatus(35, HIT);
        board.setCellStatus(45, HIT);
        board.setCellStatus(58, SUNK);
        board.setCellStatus(68, SUNK);
        board.setCellStatus(76, MISS);
        board.setCellStatus(86, MISS);
        board.setCellStatus(96, MISS);
        BoardTestHelper helper = new BoardTestHelper();
        assertEquals(helper.getBoard(), board.drawBoard());
    }
}