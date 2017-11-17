package DZ5_3;


import DZ5_3.flower.Flower;
import DZ5_3.flower.FlowersLoader;
import DZ5_3.flower.FlowersSaver;
import DZ5_3.store.FlowerStore;
import SnowMan.methods;

public class Homework {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        int roses = methods.getPositiveIntInput("Enter number of roses:");
        int chamomiles = methods.getPositiveIntInput("Enter number of chamomiles:");
        int tulips = methods.getPositiveIntInput("Enter number of tulips:");
        String filename = "Files/FlowerStoreFiles/bouquet.txt";

        System.out.println("Wallet: " + flowerStore.getWallet());
        System.out.println();
        System.out.println("Selling straight bouquet:");
        flowerStore.sell(roses, chamomiles, tulips);
        System.out.println("Selling organized bouquet:");
        flowerStore.sellSequence(roses, chamomiles, tulips);

        Flower[] randomBouquet = flowerStore.randomBouquet(methods.getPositiveIntInput
                ("Enter number of flowers for randomized bouquet:"));
        System.out.println("Random bouquet:");
        flowerStore.printBouquet(randomBouquet);

        System.out.println("Saving random bouquet to a file...");
        FlowersSaver.save(filename, randomBouquet);
        System.out.println("Saved to " + filename);
        System.out.println();

        System.out.println("Press Enter to read bouquet from a file.\n" +
                "(At this point something may happen to the file)");
        methods.readEmptyLine();

        System.out.println("Reading a bouquet from " + filename + "...");
        Flower[] restoredBouquet = FlowersLoader.load(filename);
        if (restoredBouquet != null) {
            System.out.println("Restored bouquet:");
            flowerStore.printBouquet(restoredBouquet);
        }
    }
}