package ba.smoki.one.human;

public class Pensioner extends Person{
    private double pensionAmount;

    public double getPension() {
        return pensionAmount;
    }

    public void setPension(double pension) {
        this.pensionAmount = pension;
    }
}
