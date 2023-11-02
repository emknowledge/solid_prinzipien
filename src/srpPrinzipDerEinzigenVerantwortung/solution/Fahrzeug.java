package srpPrinzipDerEinzigenVerantwortung.solution;

public class Fahrzeug {

    // Die Hauptverantwortung dieser Klasse besteht darin, Informationen über den
    // Kraftstoffstand eines Fahrzeugs zu speichern (maxKraftstoff und verbleibenderKraftstoff).

    private final int maxKraftstoff;
    private int verbleibenderKraftstoff;

    public Fahrzeug(final int maxKraftstoff) {
        this.maxKraftstoff = maxKraftstoff;
        verbleibenderKraftstoff = maxKraftstoff;
    }

    // Die Methoden getMaxKraftstoff(), getVerbleibenderKraftstoff(), setVerbleibenderKraftstoff(),
    // und beschleunigen() arbeiten ausschließlich mit diesen Kraftstoffinformationen und beeinflussen den Kraftstoffstand des Fahrzeugs.

    public int getMaxKraftstoff() {
        return maxKraftstoff;
    }

    public int getVerbleibenderKraftstoff() {
        return verbleibenderKraftstoff;
    }

    public void setVerbleibenderKraftstoff(final int verbleibenderKraftstoff) {
        this.verbleibenderKraftstoff = verbleibenderKraftstoff;
    }

    public void beschleunigen() {
        verbleibenderKraftstoff-=20;
    }

}
/* S.O.L.I.D.-Prinzipien (Java-Beispiele)

   *** Single responsibility principle - Das Prinzip der einzigen Verantwortung bedeutet,
                                         eine Klasse sollte nur einen Grund haben, sich zu ändern.

       Open/Closed-Prinzip - Softwareeinheiten (Klassen, Module, Funktionen usw.) sollten offen für Erweiterungen,
                             aber geschlossen für Änderungen sein.

       Liskov-Substitutionsprinzip - Untergeordnete Klassen sollten niemals die Typdefinitionen der übergeordneten Klasse brechen.
                                     Anders gesagt eine Subklasse muss nur die Schnittstelle der Superklasse übernehmen,
                                     wenn sie neue Sachen hinzufügen darf, aber die Schnittstelle der Superklasse nicht verändern darf.
                                     -Schnittstelle: Die Schnittstelle einer Klasse ist die Menge der Methoden und Attribute,
                                      die von der Klasse zur Verfügung gestellt werden.
                                     -Veränderung der Schnittstelle: Eine Veränderung der Schnittstelle einer Klasse ist eine Änderung
                                      der Methoden oder Attribute, die von der Klasse zur Verfügung gestellt werden.

       Interface Segregation Principle - Ist dass Prinzip der Schnittstellentrennung. Kein Client sollte gezwungen werden,
                                         von Methoden abhängig zu sein, die er nicht verwendet.

       Dependency inversion principle - Im Prinzip der Abhängigkeitsinversion sollten High-Level-Module nicht von Low-Level-Modulen abhängen.
                                        Beide sollten von Abstraktionen abhängen.
                                        Abstraktionen sollten nicht von Details abhängen.
                                        Details sollten von Abstraktionen abhängen.*/
