public class RegistroImmobili {
    public Immobile[] registro;
    private int counter;

    public RegistroImmobili(int maxSize){
        registro = new Immobile[maxSize];
        counter = 0;
    }

    public void aggiungiImmobile(Immobile casa){
        if (counter<registro.length){
            registro[counter]=casa;
            counter++;
        }

    }

    public float sommaRenditeCatastali(){
        float somma=0;
        for (int i=0;i< counter;i++){
            somma= somma + registro[i].calcolaRenditaBase();
        }
        return somma;
    }

    public Immobile[] stampa(){
        return java.util.Arrays.copyOf(registro, counter);
    }
}
