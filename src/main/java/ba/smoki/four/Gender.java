package ba.smoki.four;

public enum Gender {
    MALE("MALE", ""), // ovo je ekvivaletno MALE = new Gender ("MALE", "");

    FEMALE("FEMALE", "Vazniji pol"); // ekvivalent FEMAL = new Gender ("FEMALE", "Vazniji pol")
    private String name;
    private String description;

// Enum ne moze imati "public" konttruktor
// Njegovi konstruktori su uvek "private"
// Ne moramo pisati "private" jer je po "deafault-u" private
// Konstruktor ne moze biti pozvan nigde, osim u telu enuma

    private Gender(String name, String description) {
        this.name = name;
        this.description = description;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
