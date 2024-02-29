package ba.smoki.one;

/**
 * Interfejs ne moze imati polja i funkcije koje VEZEMO ZA OBJEKAT
 * Znaci, ne moze imati konstruktor
 * Moze imati samo polja koja su `public, static, final`
 * String name = "Proba" (cak iako ne napisemo public, static, final, interfejs ga podrazumeva
 * Osim statickih polja, funkcija interfejs ne moze imati instancna polja ili funkcije koje nisu aptraktne
 * osim ako nisu default(ovo je uvela Java 8)
 */

/**
 * <p>
 *     FUNKCIONALNI INTERFEJS (to uvodi Java 8)
 *     Potreban i dovoljan uslov da interfejs bude funkcionalni jeste
 *     da ima jednu i samo jednu apstraktnu metodu
 * </p>
*/
@FunctionalInterface
public interface Flyable {
    // public abstract se ne pise, jer se podrazumeva
    // u interfejsu su sve metode "PUBLIC ABSTRACT"
    public abstract void fly();

    // Primer za default iz komentara, posto je "flyable" instanca interfejsa Flyable

    /**default void simulateFly(Flyable flyable){
        flyable.fly();
    }*/

}
