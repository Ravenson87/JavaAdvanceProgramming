package ba.smoki.one;

import ba.smoki.one.animal.Bird;
import ba.smoki.one.animal.Plane;

public class FlyTester {
    public static void main(String[] args) {
        Bird bird = new Bird("Tweety");
        simulateFly(bird);
        Plane plane = new Plane();
        simulateFly(plane);

        // FUnkcionalni interfejs ima jednu i samo jednu apstraktnu metodu
        // LAMDA operator - se veze SAMO ZA FUNKCIONALNI INTERFEJS
        Flyable flyable = () -> System.out.println("Helikopter sam i letim");
        flyable.fly();


    }

    static void simulateFly(Flyable flyable){
        flyable.fly();
    }

}
