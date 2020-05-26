import java.util.ArrayList;

public class Clase<T> extends chocPyBaseVisitor<T>{

    String name;
    String argumento;  //id o object
    ArrayList<Metodo> classfunctions;
    ArrayList<Object> classvariables;

    public Clase(String name,String argumento) {
        this.name = name;
        this.argumento=argumento;
    }

    public String getArgumento() {
        return argumento;
    }
    public String getName() {
        return name;
    }
    public void addfuction(Metodo m){
        classfunctions.add(m);
    }
    public void addvariable(Object o){
        classvariables.add(o);
    }
}
