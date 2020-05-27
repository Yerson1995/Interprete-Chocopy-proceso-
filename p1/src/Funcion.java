import java.util.ArrayList;

public class Funcion{

    String name;
    chocPyParser.Func_bodyContext funcionctx;
    chocPyParser.TypeContext ejecutado;
    ArrayList<VariableP> argumentos;

    public Funcion(String name, chocPyParser.Func_bodyContext funcionctx, chocPyParser.TypeContext ejecutado, ArrayList<VariableP> argumentos) {
        this.name = name;
        this.funcionctx = funcionctx;
        this.ejecutado = ejecutado;
        this.argumentos = argumentos;
    }

    public chocPyParser.Func_bodyContext getFuncionctx() {
        return funcionctx;
    }
    public String getName() {
        return name;
    }
    public chocPyParser.TypeContext getEjecutado() {
        return ejecutado;
    }
    public ArrayList<VariableP> getArgumentos() {
        return argumentos;
    }

}
