package ba.smoki.three.zadatak;

import java.util.Objects;

public class Shippers implements Comparable<Shippers> {
    private Long id;
    private String name;

    public Shippers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shipper: id = " + id +
                ", Name = " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shippers shippers = (Shippers) o;
        return Objects.equals(id, shippers.id) && Objects.equals(name, shippers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Shippers o) {
        return 0;
    }
}
