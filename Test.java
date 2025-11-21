import java.util.Arrays;

public class Test {
    static void main() {
        Abitazione i1= new Abitazione(150, 3, 6);
        Terreno i2= new Terreno(200, 3, true);
        Attico i3= new Attico(100, 4, 7, 30);
        Immobile i4= new Immobile(120,2);

        RegistroImmobili r1 = new RegistroImmobili(10);

        r1.aggiungiImmobile(i1);
        r1.aggiungiImmobile(i2);
        r1.aggiungiImmobile(i3);
        r1.aggiungiImmobile(i4);

        i1.calcolaRenditaBase();
        i2.calcolaRenditaBase();
        i3.calcolaRenditaBase();
        i4.calcolaRenditaBase();

        System.out.println(Arrays.toString(r1.stampa()));

        System.out.println("La somma delle rendite totale è: " + r1.sommaRenditeCatastali());
    }
}
