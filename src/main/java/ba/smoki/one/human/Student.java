package ba.smoki.one.human;

import ba.smoki.one.animal.Cat;

import java.time.LocalDate;

public class Student extends Person{
    private int indexNumber;
    private Cat cat;



    public Student(){

    }

    public Student(String name, String surname, LocalDate date) {
        super(name, surname, date);
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
