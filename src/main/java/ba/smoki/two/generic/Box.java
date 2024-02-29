package ba.smoki.two.generic;

public class Box<U, V, Z> {

    private U ultra;
    private V violetno;
    private Z znacenje;

    public Box(){

    }

    public U getUltra() {
        return ultra;
    }

    public void setUltra(U ultra) {
        this.ultra = ultra;
    }

    public V getVioletno() {
        return violetno;
    }

    public void setVioletno(V violetno) {
        this.violetno = violetno;
    }

    public Z getZnacenje() {
        return znacenje;
    }

    public void setZnacenje(Z znacenje) {
        this.znacenje = znacenje;
    }
}
