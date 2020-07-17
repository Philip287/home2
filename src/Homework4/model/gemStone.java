package Homework4.model;

public class gemStone extends Stone{

    int gem;

    public gemStone(String name, int gem) {
        super(name);
        this.gem = gem;
    }

    public gemStone(String name, int carat, int price, int opacity, int gem) {
        super(name, carat, price, opacity);
        this.gem = gem;
    }

    public int getGem() {
        return gem;
    }

    public void setGem(int gem) {
        this.gem = gem;
    }

    @Override
    public String toString() {
        return super.toString() +
                " gem=" + gem;

    }
}
