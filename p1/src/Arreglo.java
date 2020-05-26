import java.util.ArrayList;

public class Arreglo {

    String name;
    ArrayList<Object> elementos;
    String tipo;
    boolean arreglo=true;

    public Arreglo(String name, ArrayList<Object> elementos, String tipo) {
        this.name = name;
        this.elementos = elementos;
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
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
    public boolean isArreglo() {
        return arreglo;
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
