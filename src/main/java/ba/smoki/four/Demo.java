package ba.smoki.four;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * LAMDA OPERATOR (->) SE KORISTI KDA KREIRAMO OBJEKTE TIPA FUNKCIONALNOG INTERFEJSA (kao shortcut za ono "new"...
 * a i zato sto interfejs ne moze kreirati objekat);
 * Sta lamda radi? Lamda
 *
 *
 * FUNKCIONALNI INTERFEJSI
 * Cetri najvaznija funkcionalna interfejsa:
 * <li> 1. Predicate<E> - tester element tipa E
 * boolean test(E element); </li>
 *
 * <li> 2. Supplier<E> - dobavlja element tipa E
 * E get()</li>
 *
 *  <li> 3. Consumer<E> - on kozumira element tipa E
 *  void accept(E element); </li>
 *
 *  <li> 4. Function<T, R> - Tramsformer, uzima element tipa E i transformise ga u element tipa R
 *  R applay (T taken); </li>
 */

public class Demo {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.selectAll();
        // konzumiramo person varijablu
        Predicate<Person> tester = p -> p.getGender().equals(Gender.MALE);
        Consumer<Person> consumer = p -> p.printPerson();
        procesPerson(personList, p -> p.getGender().equals(Gender.FEMALE),  p -> p.printPerson());


        }
        static void procesPerson(List<Person> persons, Predicate<Person> tester, Consumer<Person> consumer){
        for( Person person: persons){
            if(tester.test(person)){
                consumer.accept(person);
            }
        }
        }
    }

