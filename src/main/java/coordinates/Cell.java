package coordinates;

public class Cell {

    private Letter x;
    private Integer y;
    private Status status;

    public Cell(Letter x, Integer y) {
        this.x=x;
        this.y=y;
        status = Status.BLANK;
    }

    public Letter getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }


    public String getWord() {
        return x.character + y.toString();
    }

    public int getInt() {
        return x.value + y*10-10;
    }
}
