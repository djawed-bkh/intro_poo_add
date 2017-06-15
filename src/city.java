import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created by djawed on 06/06/17.
 */
public class city {
    protected String nomVille;
    protected String nomPays;
    protected int nbHabitant;
    protected char categorie ;
    public city(){
        System.out.print("creation d'une ville\n\n");
        nomVille="inconnu";
        nomPays="inconnu";
        nbHabitant=0;
       this.setCategorie();
    }


   public city(String nVille ,String nPays,int ntete,char cat){
     nomVille=nVille;
     nomPays=nPays;
     nbHabitant=ntete;
    this.setCategorie();
    }


                   /**getters**/
    public String getNomVille(){
        return nomVille;
    }
    public String getNomPays(){
        return nomPays;
    }
    public int getnbHabitants(){
        return nbHabitant;
    }
    public char getcategorie(){ return categorie;}
    /** getters **/
                        /**setters**/
    public void setNomVille(String nVille){
        nomVille= nVille;
    }
    public void setNomPays(String nPays){
        nomVille=nPays;
    }
    public void setNbHabitant(int ntete){
        nbHabitant=ntete;
        this.setCategorie();
    }
    public void setCategorie(){
        int i=0;
        int sup[]={0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
        char cat[]={'?', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        while(i<=sup.length && nbHabitant>sup[i] ){
            i++;
            char categorie = this.categorie;
        }


    }

    /**setters**/
    protected String decrisToi(){
        return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbHabitant+" habitant(s) => elle est donc de catégorie : "+this.categorie;
    }

    //Retourne une chaîne de caractères selon le résultat de la comparaison
    public String comparer(city ville1){
        String str = new String();

        if (ville1.getnbHabitants() > this.nbHabitant)
            str = getNomPays()+" est une ville plus peuplée que "+this.nomVille;

        else
            str = this.nomVille+" est une ville plus peuplée que "+getNomPays();

        return str;
    }


}


