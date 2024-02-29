package ba.smoki.one;

import ba.smoki.one.animal.Cat;
import ba.smoki.one.animal.Dog;
import ba.smoki.one.animal.Hamster;
import ba.smoki.one.human.Employee;
import ba.smoki.one.human.Pensioner;
import ba.smoki.one.human.Person;
import ba.smoki.one.human.Student;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        // "student1" je tipa Student, ali je i tipa Person, cak i Object. UPRAVO TO JE POLIMORFIZAM
        // moze cak i ovako     Person student3 = new Student();
       // Student student1 = new Student ("Kanita", "Bebric", LocalDate.of(2000, 1, 1));
        Student student = new Student();
        student.setName("Kanita");
        student.setSurname("Berbic");
        student.setBirthday(LocalDate.of(2000,1,1));
        Cat cat = new Cat("Cicko");
        student.setCat(cat);
        student.getCat().playSound();
        printPerson(student);

        Employee employee = new Employee();
        employee.setName("Ismet");
        employee.setSurname("Omerovic");
        employee.setBirthday(LocalDate.of(1988,1,1));
        printPerson(employee);


        Pensioner pensioner = new Pensioner();
        pensioner.setName("Mile");
        pensioner.setSurname("Vukajlovic");
        pensioner.setBirthday(LocalDate.of(1980,1,1));
        printPerson(pensioner);
 ;
        pensioner.setAnimal(new Hamster("Hrcko"));
        pensioner.setAnimal(new Dog("kuca"));
        System.out.println(pensioner.getAnimal()); // Zasto mi ovo vraca "ba.smoki.one.animal.Hamster@12edcd21" umesto "hamster" (mislim da zato sto ne vraca ime nego sam objekat
        pensioner.getAnimal().playSound();




    }

    static void printPerson(Person person){
        System.out.println(person.getName() + " " + person.getSurname() + " " + person.getBirthday());
    }

    }

