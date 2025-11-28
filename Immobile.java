public abstract class Immobile {
    private int superficie;
    private int particella;
    private int categoria;
    private static int count=0;

    public Immobile(int superficie, int categoria){
        this.particella=count++;
        this.superficie=superficie;
        this.categoria=categoria;
    }

    public int getParticella() {
        return particella;
    }

    public float calcolaRenditaBase(){
        return superficie*categoria;
    }

    public String toString() {
        return "L'immobile ha la superficie di: " + superficie + " la sua particella è: " + particella + " e appartiene alla categoria " + categoria + " e la rendita è: " + calcolaRenditaBase();
    }

    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;

        Immobile other = (Immobile) obj;
        return this.particella == other.particella;
    }
}