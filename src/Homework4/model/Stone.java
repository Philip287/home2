package Homework4.model;


import Homework4.Interface.Donated;


public abstract class Stone implements Donated, Comparable<Stone> {

    private String name;
    private int carat;
    private int price;
    private int opacity;

    public Stone(String name, int carat, int price, int opacity) {
        this.name = name;
        this.carat = carat;
        this.price = price;
        this.opacity = opacity;
    }

    public Stone(String name) {
        this.name = name;
        this.carat = (int) (Math.random() * (0 - 500 + 1) + 500);
        this.price = (int) (Math.random() * (0 - 50 + 1) + 50);
        this.opacity = (int) (Math.random() * (0 - 100 + 1) + 100);

    }

    @Override
    public boolean fitNecklace(int carat) {
        if (this.carat > carat) {
            System.out.println("I am include " + name);
            return true;

        }
        return false;
    }

    @Override
    public boolean checkOpacity(int opacity1, int opacity2) {
        if (this.opacity > opacity1 & this.opacity < opacity2) {
            System.out.println("I am good znd include " + name);
            return true;

        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarat() {
        return carat;
    }

    public void setCarat(int carat) {
        this.carat = carat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOpacity() {
        return opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }

    @Override
    public int compareTo(Stone d) {
        if (price > d.price) {
            return 1;
        } else if (price < d.price) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Stone: " +
                "name = '" + name + '\'' +
                ", carat=" + carat + " price = " + price + " opacity = " + opacity;
    }

}
