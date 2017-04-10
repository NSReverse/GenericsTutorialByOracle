package mx.x10.reverseeffectapps.KVPair;

/**
 * Created by Robert on 4/10/2017.
 */
public interface Pair<K, V> {
    public void setKey(K key);
    public void setValue(V value);
    public K getKey();
    public V getValue();

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        /*
        if (p1.getKey().equals(p2.getKey())) {
            System.out.println("Keys are the same. (" + p1.getKey() + "), (" + p2.getKey() + ")");

            if (p1.getValue().equals(p2.getValue())) {
                System.out.println("Values are the same. (" + p1.getValue() + "), (" + p2.getValue() + ")");
                return true;
            }
        }
        else {
            System.out.println("Keys are different. (" + p1.getKey() + "), (" + p2.getKey() + ")");
        }

        return false;
        */

        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
}
