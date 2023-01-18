package ch.heigvd.poo.labo9;

import java.util.LinkedList;
import java.util.List;

public class Personne {
    private String nom;
    private Lieu lieu;

    private static List<Personne> personnes = new LinkedList<>();

    public Personne(String nom, Lieu lieu){
        this.nom = nom;
        this.lieu = lieu;
        personnes.add(this);
    }

    public void mourir() {
        personnes.remove(this);
        System.out.printf("%s meurt!\n", nom);
    }

    public void deplacer(Lieu lieu){

    }

    public void afficherPersonnes(){
        System.out.println("Personnes en vie : ");
        for(Personne p : personnes)
            System.out.println(p);
    }

    public String obtenirLieu(){
        return lieu.toString();
    }

    @Override
    public String toString(){
        return this.nom;
    }

    @Override
    public boolean equals(Object o){
        return o == this
                || o != null
                && o.getClass() == getClass()
                && ((Personne) o).nom.equals(nom);
    }
}
