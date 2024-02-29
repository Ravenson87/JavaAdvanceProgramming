package ba.smoki.two.collection;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Container<E> implements Iterable<E> {
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return Iterable.super.spliterator();
    }
}
