package ba.smoki.one.animal;

import ba.smoki.one.Flyable;

public class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Avion leti");
    }
}
