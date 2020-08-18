package Homework9;

public enum Category {
    HOME("Home"),
    WORK("Work"),
    OTHER("Other");

    private String value1;

    Category (String value1) {
        this.value1 = value1;
    }

    public String getValue1() {
        return value1;
    }
}
