package Homework8.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Model {
    String field;

    public Model(String field) {
        this.field = field;
    }

    public Model() {
    }

    public List<Model> getModels(String forList, int number) {
        List<Model> models = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            models.add(new Model("For list: " + forList + " number " + number + " i=" + 5));
        }
        return models;
    }

}
