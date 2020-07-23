package Homework5.innerclasses;

public enum DisplayStatus {

    ON("Dislay is on"),
    OFF("Dislay is off"),
    BLOCK("Dislay is block");

    private String value;

    DisplayStatus (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
