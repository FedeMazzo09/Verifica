public class Attico extends Abitazione{
    private int superficieTerrazzo;
    private float calcolo;
    private float percentuale;

    public Attico(int superficie, int categoria, int vani, int superficieTerrazzo) {
        super(superficie, categoria, vani);
        this.superficieTerrazzo=superficieTerrazzo;
    }

    public float calcolaRenditaBase() {
        calcolo= super.calcolaRenditaBase();
        percentuale= superficieTerrazzo * 2;
        calcolo= calcolo + (calcolo * percentuale / 100);
        return calcolo;
    }

    public String toString() {
        return super.toString() + " e la superficie del terrazzo è: " + superficieTerrazzo;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Attico other = (Attico) obj;
        return this.getParticella() == other.getParticella();
    }
}