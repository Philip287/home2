package Homework4;

import Homework4.model.gemStone;
import Homework4.model.noGemStone;
import Homework4.model.Stone;

import java.util.ArrayList;
import java.util.Collections;

public class Homework4 {
    public static void main(String[] args) {

        gemStone gemStone1 = new gemStone("Diamond", 4);
        gemStone gemStone2 = new gemStone("Sapphire", 294, 25, 75, 3);
        noGemStone noGemStone1 = new noGemStone("Topaz", 5);
        noGemStone noGemStone2 = new noGemStone("Jade", 300, 45, 78, 5);
        ArrayList<Stone> necklace = new ArrayList<>();
        int carat = 200;
        if (gemStone1.fitNecklace(carat))
            necklace.add(gemStone1);
        if (gemStone2.fitNecklace(carat))
            necklace.add(gemStone2);
        if (noGemStone1.fitNecklace(carat))
            necklace.add(noGemStone1);
        if (noGemStone2.fitNecklace(carat))
            necklace.add(noGemStone2);


        int weight = 0;
        int price = 0;

        for (int i = 0; i < necklace.size(); i++) {
            weight += necklace.get(i).getCarat();
            price += necklace.get(i).getPrice();
        }

        for (int i = 0; i < necklace.size(); i++) {
            System.out.println("Before sorted :" + necklace.get(i).toString());
        }
        Collections.sort(necklace);
        for (int i = 0; i < necklace.size(); i++) {
            System.out.println("After :" + necklace.get(i).toString());
        }
        int opasiti1 = 50;
        int opasiti2 = 80;
        for (int i = 0; i < necklace.size(); i++) {
            if (necklace.get(i).checkOpacity(opasiti1, opasiti2)) {
                System.out.println("Stone is goog :" + necklace.get(i).toString());
            }
        }

    }


}


