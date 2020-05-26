
public class VariableP {
    String name;
    Object elemento;
    String tipo;

    public VariableP(String name, Object elemento) {
        this.elemento = elemento;
        this.name=name;
    }
    public Object getElementos() {
        return elemento;
    }
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    public String getName() {
        return name;
    }
    public String getTipo() {
        return tipo;
    }
}
