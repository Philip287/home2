package Homework9;

public enum Priority {

    HIGH("High"),
    MIDDLE("Middle"),
    LOW("Low");

    private String value;

    Priority (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
