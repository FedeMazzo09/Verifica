public class Abitazione extends Immobile{
    private int vani;
    private float calcolo;

    public Abitazione(int superficie, int categoria, int vani){
        super(superficie, categoria);
        this.vani=vani;
    }

    public float calcolaRenditaBase() {
         calcolo= super.calcolaRenditaBase();
         calcolo=calcolo*vani;
         return calcolo;
    }

    public String toString() {
        return super.toString() + " e il numero dei vani è: " + vani;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Abitazione other = (Abitazione) obj;
        return this.getParticella() == other.getParticella();
    }
}