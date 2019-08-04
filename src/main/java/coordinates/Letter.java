package coordinates;

public enum Letter {
    A(1,"A"),
    B(2,"B"),
    C(3,"C"),
    D(4,"D"),
    E(5,"E"),
    F(6,"F"),
    G(7,"G"),
    H(8,"H"),
    I(9,"I"),
    J(10,"J");

    public String character;
    public int value;

    Letter(int value, String character) {
        this.character=character;
        this.value=value;
    }
}
