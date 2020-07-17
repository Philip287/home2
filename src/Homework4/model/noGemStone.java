package Homework4.model;

public class noGemStone extends Stone{

    int type;

    public noGemStone(String name, int carat, int price, int opacity, int type) {
        super(name, carat, price, opacity);
        this.type = type;
    }

    public noGemStone(String name, int type) {
        super(name);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "type=" + type;
    }
}
