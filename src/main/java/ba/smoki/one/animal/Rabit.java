package ba.smoki.one.animal;

public class Rabit extends Animal{
    public Rabit(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Rrraaabbbiittttt");
    }
}
