package ckass;

public class dog {
    private int paws = 4;
    private int tail = 1;
    private String name;
    private String breed;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getPaws() {
        return paws;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
