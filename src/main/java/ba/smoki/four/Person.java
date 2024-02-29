package ba.smoki.four;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate birthDay;

    public Person(){

    }

    public Person(String name, String surname, Gender gender, LocalDate birthDay) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void printPerson(){
        System.out.println(name + " " + surname + " rodjen/a " + birthDay + " pol: " + getGender() + " i imam " + getAge() + " godina" );
    }

    public int getAge(){
        // return LocalDate.now().getYear() - birthDay.getYear(); - ovako sam ja uradio
        LocalDate now = LocalDate.now();
        Period period = birthDay.until(now);
        return period.getYears();
    }

}
