package mx.x10.reverseeffectapps;

import mx.x10.reverseeffectapps.BoundedTypeParameters.NaturalNumber;
import mx.x10.reverseeffectapps.Box.Box;
import mx.x10.reverseeffectapps.KVPair.KeyValuePair;
import mx.x10.reverseeffectapps.KVPair.Pair;

public class Main {

    public static void main(String[] args) {
        testBounds();
        testBoxAndPairs();
    }

    public static void testBounds() {
        NaturalNumber number = new NaturalNumber(new Integer(16));
        // NaturalNumber number = new NaturalNumber(new Double(16.0));
        System.out.println("Number is " + ((number.isEven())?"Even":"Odd"));
    }

    public static void testBoxAndPairs() {
        Box<String> testBox = new Box<>("This is a test value.");

        KeyValuePair<String, String> testPair = new KeyValuePair<>("identifier", testBox.getValue());
        System.out.println("(" + testPair.getKey() + "): " + testPair.getValue());

        KeyValuePair<String, String> testPair2 = new KeyValuePair<>("identifier", testBox.getValue());
        System.out.println("(" + String.valueOf(testPair2.getKey()) + "): " + testPair2.getValue());

        Box rawBox = new Box("String");
        rawBox.set("Another value");
        rawBox.set(136);

        if (Pair.compare(testPair, testPair2)) {
            System.out.println("Pairs are the same.");

            testPair2.setKey("identifier2");

            if (Pair.compare(testPair, testPair2)) {
                System.out.println("Pairs are still the same.");
            }
            else {
                System.out.println("Pairs are now not the same.");
            }
        }
        else {
            System.out.println("Pairs are not the same.");
        }
    }
}
