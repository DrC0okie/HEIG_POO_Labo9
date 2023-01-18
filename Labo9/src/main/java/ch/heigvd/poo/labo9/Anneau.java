package ch.heigvd.poo.labo9;

public abstract class Anneau {
    private String nom;

    private Personne propriétaire;

    private Personne créateur;

    public Anneau(Personne créateur, String nom) {
        this.créateur = créateur;
        this.nom = nom;
    }

    public void detruire() {
        System.out.printf("L'" + this + "%s est détruit.\n", nom);
    }

    public void utiliser() {
        String pouvoir = " devient invisible!";
        if (propriétaire.equals(créateur))
            pouvoir = " est surpuissant!";
        System.out.println(propriétaire + pouvoir);
    }

    public void definirProprietaire(Personne p) {
        this.propriétaire = p;
        System.out.println(p + " possède l'anneau");
    }

    @Override
    public String toString() {
        return nom;
    }
}