public class Terreno extends Immobile{
    private boolean isFabbricabile;
    private float calcolo;

    public Terreno(int superficie, int categoria, boolean isFabbricabile){
        super(superficie, categoria);
        this.isFabbricabile=isFabbricabile;
    }

    public float calcolaRenditaBase() {
         calcolo=super.calcolaRenditaBase();
         if (isFabbricabile){
             calcolo= (float) (calcolo+(calcolo*0.3));
             return calcolo;
         }else{
             calcolo= (float) (calcolo-(calcolo*0.1));
             return calcolo;
         }
    }

    public String toString() {
        return super.toString() + " e la sua edificabilità è: " + isFabbricabile;
    }

    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;

        Terreno other = (Terreno) obj;
        return this.getParticella() == other.getParticella();
    }
}