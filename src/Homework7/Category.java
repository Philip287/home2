package Homework7;

public enum Category {

    Philosophy("Philosophy"),
    Science("Science"),
    History("History");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
