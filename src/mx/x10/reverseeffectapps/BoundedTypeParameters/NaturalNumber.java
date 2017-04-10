package mx.x10.reverseeffectapps.BoundedTypeParameters;

/**
 * Created by Robert on 4/10/2017.
 */
public class NaturalNumber<T extends Integer> {
    private T value;

    public NaturalNumber(T value) {
        this.value = value;
    }

    public boolean isEven() {
        return value.intValue() % 2 == 0;
    }
}
