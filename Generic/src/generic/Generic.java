package generic;

/**
 *
 * @author Abdullah Shublaq
 */

import java.util.ArrayList;

public class Generic<E> {

    private E object;

    public void set(E object) {
        this.object = object;
    }

    public E get() {
        return object;
    }

    public static void main(String[] args) {
        Box box1 = new Box();

        Generic<Box> g = new Generic();
        g.set(box1);

    }

}
