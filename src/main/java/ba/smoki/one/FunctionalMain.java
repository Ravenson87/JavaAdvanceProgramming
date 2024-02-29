package ba.smoki.one;

import ba.smoki.one.human.Person;

import java.time.LocalDate;

public class FunctionalMain {
    public static void main(String[] args) {

        Person person = new Person("Ismet", "Omerovic", LocalDate.of(1988,1,1));
        PersonTester testZaPunoljetnost = (p) -> p.getAge() >= 18;
        boolean ismetPunoljetan = testZaPunoljetnost.test(person);
        System.out.println(ismetPunoljetan ? "Jeste": "Nije");

    }
}
