package coordinates;

public class Cell {

    private Letter x;
    private Integer y;
    private Status status;
    private int index;

    public Cell(Letter x, Integer y) {
        this.x = x;
        this.y = y;
        status = Status.IDLE;
    }

    public Cell(int index) {
        this.index = index;
        this.status = Status.IDLE;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status newStatus) {
        status = newStatus;
    }
}
