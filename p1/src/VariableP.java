
public class VariableP {
    String name;
    Object elemento;
    String tipo;
    int nivel;

    public VariableP(String name, Object elemento, String tipo, int nivel) {
        this.name = name;
        this.elemento = elemento;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public VariableP(String name, Object elemento, String tipo) {
        this.name = name;
        this.elemento = elemento;
        this.tipo = tipo;
        this.nivel=0;
    }

    public Object getElemento() {
        return elemento;
    }
    public int getNivel() {
        return nivel;
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
