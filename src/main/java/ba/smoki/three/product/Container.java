package ba.smoki.three.product;

import java.util.*;
import java.util.function.Consumer;

/**
 * Zadaca
 * Kreirati mogucnost unosa elemenata u kontejner
 * Modifikovati iterator na nacin da se moze iterirati kroz elemente
 *
 * @param <E>
 */

public class Container<E> implements Iterable<E>{

    private ArrayList<E> containerList;
    public Container(ArrayList<E> containerList) {
        this.containerList = containerList;




    }

    @Override
    public Iterator<E> iterator() {
        return new ElementIterator(0);
    }

    public void addElement(E e){
        containerList.add(e);


    }

    class ElementIterator implements Iterator<E> {
        private int currentIndex;
        public ElementIterator(int currentIndex) {
            this.currentIndex = currentIndex;
        }


        @Override
        public boolean hasNext() {
            return currentIndex<containerList.size();
                }


        @Override
        public E next() {
           return containerList.get(currentIndex++);
        }
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
