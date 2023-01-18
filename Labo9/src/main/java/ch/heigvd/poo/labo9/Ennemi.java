package ch.heigvd.poo.labo9;

public class Ennemi extends Personne {

    public Ennemi(String nom, Lieu lieu){
        super(nom, lieu);
    }

    public Anneau anneauUnique(){
        Anneau anneau = new Anneau(this, "anneau unique") {};
        System.out.println(super.obtenirLieu() + ": " + "Création de l'" + anneau + " par " + this);
        anneau.definirProprietaire(this);
        return anneau;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
