package ba.smoki.one.animal;

import ba.smoki.one.Flyable;

public class Bird extends Animal implements Flyable {

    public Bird (String name){
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Ciju ciju ciju");

    }

    @Override
    public void fly() {
        System.out.println("Ptica leti");

    }
}
