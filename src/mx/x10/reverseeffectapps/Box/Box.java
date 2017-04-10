package mx.x10.reverseeffectapps.Box;

/**
 * Created by Robert on 4/10/2017.
 */
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public void set(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
