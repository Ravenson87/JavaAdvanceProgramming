package ba.smoki.two;

import ba.smoki.two.generic.Box;
import ba.smoki.two.generic.Person;

import java.time.LocalDate;
import java.util.List;

/**
 * Imamo dve grupe generickih tipova:
 * 1. UNBOUNDED
 * 2. BOUNDED
 */

public class TwoExecutors {
    public static void main(String[] args) {
        //2.1 RAW (sirovi) SLOZENI TIP
        Person person1 = new Person();
        person1.setName("Nejra");
        person1.setSurname("Kadric");
        person1.setBirthday(LocalDate.of(2000,1,1));
        // 2.2 PARAMTETRIZIRANI SLOZENI TIP
        Box<Integer, Double, Person> kutija = new Box<>();
        kutija.setUltra(23);
        kutija.setVioletno(23.5);
        kutija.setZnacenje(person1);

    }
}
