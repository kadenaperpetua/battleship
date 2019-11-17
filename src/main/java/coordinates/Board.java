package coordinates;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Board {

    private List<Cell> cells;
    public static final String ANSI_RED = "\u001B[31m";

    Board() {
        cells = IntStream.range(0, 100)
                .mapToObj(index -> new Cell(index))
                .collect(Collectors.toList());
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCellStatus(int cell, Status newStatus) {
        cells.get(cell).setStatus(newStatus);
    }

    public String drawBoard() {
        String board = drawHeading();
        for (int i = 1; i <= 10; i++) {
            board += drawLine(i);
        }

        return board;
    }

    private String drawHeading() {
        return "   "
                + "\u035FA\u035F "
                + "\u035FB\u035F "
                + "\u035FC\u035F "
                + "\u035FD\u035F "
                + "\u035FE\u035F "
                + "\u035FF\u035F "
                + "\u035FG\u035F "
                + "\u035FH\u035F "
                + "\u035FI\u035F "
                + "\u035FJ\u035F \n";
    }

    private String drawLine(int line) {
        String textline = line == 10 ? "" + line : " " + line;
        for (int i = (line - 1) * 10; i < line * 10; i++)
            textline += drawCell(i);
        return textline + "| \n";
    }

    public String drawCell(int i) {
        switch (this.cells.get(i).getStatus()) {
            case IDLE:
                return "|\u035F \u035F";
            case HIT:
                return "|\u035F\u2715\u035F";
            case MISS:
                return "|\u035F\u25cb\u035F";
            case SUNK:
                return "|\u035F\u2588\u035F";
            default:
                return "   ";
        }
    }
}
