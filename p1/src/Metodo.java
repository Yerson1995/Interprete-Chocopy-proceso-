import java.util.ArrayList;

public class Metodo {
    String name;
    chocPyParser.Func_bodyContext funcionctx;
    chocPyParser.TypeContext ejecutado;
    ArrayList<Object> argumentos;
    String self;// tal vez esto mas bien sea algo de visitor comprobar que sea el mismo que el nombre de la clase

    public Metodo(String name, chocPyParser.Func_bodyContext funcionctx, chocPyParser.TypeContext ejecutado, ArrayList<Object> argumentos, String self) {
        this.name = name;
        this.funcionctx = funcionctx;
        this.ejecutado = ejecutado;
        this.argumentos = argumentos;
        this.self = self;
    }


    public String getName() {
        return name;
    }
    public chocPyParser.Func_bodyContext getFuncionctx() {
        return funcionctx;
    }
    public chocPyParser.TypeContext getEjecutado() {
        return ejecutado;
    }
    public ArrayList<Object> getArgumentos() {
        return argumentos;
    }
}
