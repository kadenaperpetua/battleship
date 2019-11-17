package coordinates;

class BoardTestHelper {

    private String getFirstLine() {
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

    private String getEmptyLine(String index) {
        return index
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "| \n";
    }

    private String getHitLine(String index) {
        return index
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F\u2715\u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "| \n";
    }

    private String getMissLine(String index) {
        return index
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F\u25cb\u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "| \n";
    }


    private String getSunkLine(String index) {
        return index
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F \u035F"
                + "|\u035F\u2588\u035F"
                + "|\u035F \u035F"
                + "| \n";
    }

    String getBoard() {
        return getFirstLine()
                + getEmptyLine(" 1")
                + getEmptyLine(" 2")
                + getHitLine(" 3")
                + getHitLine(" 4")
                + getHitLine(" 5")
                + getSunkLine(" 6")
                + getSunkLine(" 7")
                + getMissLine(" 8")
                + getMissLine(" 9")
                + getMissLine("10");
    }

    String getEmptyBoard() {
        return getFirstLine()
                + getEmptyLine(" 1")
                + getEmptyLine(" 2")
                + getEmptyLine(" 3")
                + getEmptyLine(" 4")
                + getEmptyLine(" 5")
                + getEmptyLine(" 6")
                + getEmptyLine(" 7")
                + getEmptyLine(" 8")
                + getEmptyLine(" 9")
                + getEmptyLine("10");
    }
}