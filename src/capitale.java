/**
 * Created by djawed on 10/06/17.
 */
public class capitale extends city {
    private String monument;

    public capitale(){
    super();
    monument="nada";
    }
    public String decrisToi(){
        String str=super.decrisToi()+"\n \t==>"+this.monument+"en est un monument";
        System.out.print("invocation de super.decris toi");
        return str;
    }
}
