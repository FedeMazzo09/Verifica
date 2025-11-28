public class RegistroImmobili {
    public Immobile[] registro;
    private int counter;

    public RegistroImmobili(int maxSize) {
        registro = new Immobile[maxSize];
        counter = 0;
    }

    public void aggiungiImmobile(Immobile casa) {
        if (counter < registro.length) {
            registro[counter] = casa;
            counter++;
        }

    }

    public float sommaRenditeCatastali() {
        float somma = 0;
        for (int i = 0; i < counter; i++) {
            somma = somma + registro[i].calcolaRenditaBase();
        }
        return somma;
    }

    public float renditaMassima() {
        float max = 0;
        for (int i = 0; i < counter; i++) {
            if (registro[i].calcolaRenditaBase() > max) {
                max = registro[i].calcolaRenditaBase();
            }
        }
        return max;
    }

    public float renditaMinima() {
        float min = registro[0].calcolaRenditaBase();
        for (int i = 0; i < counter; i++) {
            if (registro[i].calcolaRenditaBase() < min) {
                min = registro[i].calcolaRenditaBase();
            }
        }
        return min;
    }

    public Immobile[] stampa() {
        return java.util.Arrays.copyOf(registro, counter);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        RegistroImmobili other = (RegistroImmobili) obj;
        return java.util.Arrays.equals(registro, other.registro);
    }
}