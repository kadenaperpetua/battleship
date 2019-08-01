public class Hello {


    public String getFirstLine(){
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

    public String getSecondLine(){
        return    "|\u035F \u035F"
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

    public String getEmptyLine(String index){
        return  index
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

    public String getTestHitLine(String index){
        return  index
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

    public String getTestMissLine(String index){
        return  index
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

    public String getMessage(){
        return getFirstLine()
                +getEmptyLine(" 1")
                +getEmptyLine(" 2")
                +getTestHitLine(" 3")
                +getTestHitLine(" 4")
                +getTestHitLine(" 5")
                +getTestMissLine(" 6")
                +getEmptyLine(" 7")
                +getTestMissLine(" 8")
                +getEmptyLine(" 9")
                +getEmptyLine("10");
    }
}