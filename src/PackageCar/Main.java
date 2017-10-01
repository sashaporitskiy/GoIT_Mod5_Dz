package PackageCar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputDouble;
        int inputInt;

        displayOpshins();
    }

    static void displayOpshins() {
        System.out.println(

                "Available options:\n\n" +

                        "   1 - change current speed;\n" +
                        "   2 - add a passenger;\n" +
                        "   3 - remove a passenger;\n" +
                        "   4 - remove all passengers;\n" +
                        "   5 - remove all wheels;\n" +
                        "   6 - add new wheel(s);\n" +
                        "   7 - get current maximum speed;\n" +
                        "   8 - show all information about the car;\n\n" +

                        "   9 - renew a tire;\n" +
                        "   10 - wear a tire;\n" +
                        "   11 - get wear level of the tire;\n\n" +

                        "   12 - open a door;\n" +
                        "   13 - close a door;\n" +
                        "   14 - open/close a door;\n" +
                        "   15 - open a window;\n" +
                        "   16 - close a window;\n" +
                        "   17 - open/close a window;\n" +
                        "   18 - show all information about a car door;\n\n" +
                        "   0 - exit."
        );
    }
}
