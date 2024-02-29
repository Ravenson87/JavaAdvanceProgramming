package ba.smoki.one.animal;

public abstract class Animal {
    private String name;

    public Animal (String name){
        this.name = name;
    }

    //Glavna razlika apstraktne klase u odnosu na normalnu kalsu jeste
    // Da apstraktna klasa moze imati APSTRAKTNE METODE
    // Apstraktne klase sluze da se nametne SABLON ponasanja svim klasama koje je nasledjuju
    public abstract void playSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
