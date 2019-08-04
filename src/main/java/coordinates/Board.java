package coordinates;

import java.util.ArrayList;
import java.util.List;

import static coordinates.Letter.A;
import static coordinates.Letter.B;
import static coordinates.Letter.C;
import static coordinates.Letter.D;
import static coordinates.Letter.E;
import static coordinates.Letter.F;
import static coordinates.Letter.G;
import static coordinates.Letter.H;
import static coordinates.Letter.I;
import static coordinates.Letter.J;

public class Board {
    List cells = new ArrayList();

    public List<Cell> getCells() {
        for (int i = 1; i <=10 ; i++) {
        cells.add(new Cell(A,i));
        }
        for (int i = 1; i <=10 ; i++) {
            cells.add(new Cell(B,i));
        }
        for (int i = 1; i <=10 ; i++) {
            cells.add(new Cell(C,i));
        }
        for (int i = 1; i <=10 ; i++) {
            cells.add(new Cell(D,i));
        }
        for (int i = 1; i <=10 ; i++) {
            cells.add(new Cell(E,i));
        }
        for (int i = 1; i <=10 ; i++) {
            cells.add(new Cell(F,i));
        }
        for (int i = 1; i <=10 ; i++) {
            cells.add(new Cell(G,i));
        }
        for (int i = 1; i <=10 ; i++) {
            cells.add(new Cell(H,i));
        }
        for (int i = 1; i <=10 ; i++) {
            cells.add(new Cell(I,i));
        }
        for (int i = 1; i <=10 ; i++) {
            cells.add(new Cell(J,i));
        }
        return  cells;
    }
}
