package ba.smoki.two.generic;

import ba.smoki.one.animal.Animal;
import ba.smoki.one.human.Person;

public class Pair<K extends Person, V extends Animal> {
    private K person;
    private V animal;

    public K getPerson() {
        return person;
    }

    public void setPerson(K person) {
        this.person = person;
    }

    public V getAnimal() {
        return animal;
    }

    public void setAnimal(V animal) {
        this.animal = animal;
    }
}
