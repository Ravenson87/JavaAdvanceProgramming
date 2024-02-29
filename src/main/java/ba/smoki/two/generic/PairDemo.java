package ba.smoki.two.generic;
import ba.smoki.one.animal.Animal;
import ba.smoki.one.animal.Dog;
import ba.smoki.one.animal.Hamster;
import ba.smoki.one.human.Employee;
import ba.smoki.one.human.Student;

public class PairDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Muhamed");
        student.setSurname("Jarraya Salihovic");

        Dog dog = new Dog("Bethowen");

        // Employee employee = new Employee("Kanita", "Berbic"); Pitati Milicu zasto ne mogu sad ovako da kreiram Employee-a
        //Nego moram preko setersa, a gore kod Dog-a ne moram, mogu da stavim u zagrade
        Employee employee = new Employee();
        employee.setName("Kanita");
        employee.setSurname("Berbic");

        Hamster hamster = new Hamster("Toro");

        //RAW(Sirovi) TIP
        Pair pair = new Pair();
        pair.setAnimal(dog);
        pair.setPerson(student);

        // PARAMETRIZIRANI TIP
        Pair <Student, Hamster> studentHrcakPar = new Pair<>(); //mogu se fiksirati ovde na 'child class', odnosno
        // iako u klasi Pair stoji Person i Animal, ja ovde mogu specificirati da to mogu biti iskljucivo Student i Hrcak
        studentHrcakPar.setAnimal(hamster);
        studentHrcakPar.setPerson(student);






    }
}
