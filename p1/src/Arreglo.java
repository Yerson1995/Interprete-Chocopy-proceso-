import java.util.ArrayList;

public class Arreglo {

    String name;
    ArrayList<Object> elementos;

    public Arreglo(String name,ArrayList<Object> elementos) {
        this.elementos = elementos;
        this.name=name;
    }
    public ArrayList<Object> getElementos() {
        return elementos;
    }
    public void setElementos(ArrayList<Object> elementos) {
        this.elementos = elementos;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Object getElementos(int p) {
        return elementos.get(p);
    }
    public void addElemento(Object a) {
        this.elementos.add(a);
    }
    public void replaceElemento(int p,Object a) {
        this.elementos.add(p,a);
    }
}
