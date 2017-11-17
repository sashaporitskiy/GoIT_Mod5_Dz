package DZ7;

import DZ7.fruit.Fruit;
import DZ7.store.Store;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Homework10 {
    public static void main(String[] args) throws ParseException, IOException {
        final String FILEPATH = "Files/Homework10/fruits.txt";

        Fruit fruitApple = new Fruit(Fruit.FruitType.Apple, 9, "21/10/2017", 14);
        Fruit fruitOrange = new Fruit(Fruit.FruitType.Orange, 5, "21/10/2017", 18);
        Fruit fruitBanana = new Fruit(Fruit.FruitType.Banana, 2, "21/10/2017", 18);


        Store store = new Store();
        store.add(fruitApple);
        store.add(fruitOrange);
        store.add(fruitBanana);
        String stringCheckDate = "21/10/2017";
        Date checkDate = new SimpleDateFormat("dd/MM/yyyy").parse(stringCheckDate);

        List<Fruit> added = store.getAddedFruits(checkDate);
        for (Fruit fruit : added) {
            System.out.println("ADDED on " + stringCheckDate + ":\n" + fruit.info());

        }
    }
}
