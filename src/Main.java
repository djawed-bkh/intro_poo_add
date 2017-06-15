/**
 * Created by djawed on 06/06/17.
 */
public class Main {

    public static void main(String[] args){
        /**objets**/
        city ville= new city();
      city ville1= new city("marseille","france",200,'a');
       city ville2= new city("nice","france",23000000,'b');
       capitale cap= new capitale();
        System.out.println("\n\n"+ville1.decrisToi());
        System.out.println(ville.decrisToi());
        System.out.println(ville2.decrisToi()+"\n\n");
        System.out.println(ville1.comparer(ville2));
                                   /**objets**/

  /** System.out.print("\n ville ="+ville.getNomVille()+"nom pays"+ville.getNomPays()+"   le nombre dhabitants   "+ville.getnbHabitants()+"  categorie  "+ville.getcategorie());
        System.out.print("\n ville ="+ville1.getNomVille()+"   nom pays  "+ville1.getNomPays()+"  le nombre dhabitants  "+ville1.getnbHabitants()+"  categorie  "+ville1.getcategorie());
        System.out.print("\n ville ="+ville2.getNomVille()+"  nom pays  "+ville2.getNomPays()+"  le nombre dhabitants   "+ville2.getnbHabitants()+"  categorie  "+ville2.getcategorie()+"\n");
        //permutation
        city inter=new city();
        inter=ville1;
        ville1=ville2;
        ville2=inter;
        //permutation
        System.out.print("\n ville ="+ville1.getNomVille()+"\nnom pays\n"+ville1.getNomPays()+"\nle nombre dhabitants\n"+ville1.getnbHabitants());
        System.out.print("\n ville ="+ville2.getNomVille()+"\nnom pays\n"+ville2.getNomPays()+"\nle nombre dhabitants\n"+ville2.getnbHabitants());
        ville1.setNomVille("paris");
        ville2.setNomVille("tokyo");
        System.out.print("\n ville =\n"+ville1.getNomVille()+"\nnom pays\n"+ville1.getNomPays()+"\nle nombre dhabitants\n"+ville1.getnbHabitants());
        System.out.print("\n ville =\n"+ville2.getNomVille()+"\nnom pays\n"+ville2.getNomPays()+"\nle nombre dhabitants\n"+ville2.getnbHabitants());
    **/}





}/*class*/
