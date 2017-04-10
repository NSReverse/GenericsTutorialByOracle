package mx.x10.reverseeffectapps.KVPair;

/**
 * Created by Robert on 4/10/2017.
 */
public class KeyValuePair<K, V> implements Pair<K, V>{
    private K currentKey;
    private V currentValue;

    public KeyValuePair(K key, V value) {
        currentKey = key;
        currentValue = value;
    }

    @Override
    public void setKey(K key) {
        currentKey = key;
    }

    @Override
    public void setValue(V value) {
        currentValue = value;
    }

    @Override
    public K getKey() {
        return currentKey;
    }

    @Override
    public V getValue() {
        return currentValue;
    }
}
