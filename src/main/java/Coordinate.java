public class Coordinate {

    private String x;
    private String y;

    public Coordinate(String x, String y) {
        this.x=x;
        this.y=y;

    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }


    public String getword() {
        return x + y;
    }
}
