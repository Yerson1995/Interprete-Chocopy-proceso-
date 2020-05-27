import java.util.HashMap;
import java.util.ArrayList;

public class Myvisitors<T> extends chocPyBaseVisitor<T> {
    String funcion_actual="";
    int nivel=0;
    HashMap<String, VariableP> tabla = new HashMap<>();
    HashMap<String, Clase> tablaclass = new HashMap<>();
    HashMap<String, Funcion> tablafunciones = new HashMap<>();
    HashMap<String, Arreglo> tablaA = new HashMap<>();

    public boolean var_exists(String name){
        VariableP value =new VariableP(null,null,null);
        Arreglo valueA =new Arreglo(null,null,null);
        if((value= tabla.get(name))==null&&(valueA= tablaA.get(name))==null)
            return  true;
        else
            return false;
    }
    public Object var_value(String name){
        Object value;
        value= (VariableP) tabla.get(name).getElemento();
        return  value;
    }
    public void var_rplc_value(String name, Object value){
        tabla.get(name).setElemento(value);
    }
    public boolean arre_exists(String name){
        //return tablaArreglos:
        return true;
    }
    @Override
    public T visitType(chocPyParser.TypeContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String identi = ctx.IDENTIFIER().getText();
            Object value;
            if ((value = tabla.get(identi)) == null) {
                int line = ctx.IDENTIFIER().getSymbol().getLine();
                int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();
                System.exit(-1);
                return null;
            } else {
                return (T) value;
            }
        } else if (ctx.IDSTRING() != null) {
            String stringi = ctx.IDSTRING().getText();
            Object value;
            if ((value = tabla.get(stringi)) == null) {
                int line = ctx.IDSTRING().getSymbol().getLine();
                int col = ctx.IDSTRING().getSymbol().getCharPositionInLine();
                System.exit(-1);
                return null;
            } else {
                return (T) value;
            }
        } else if (ctx.INT() != null) {
            String inti = ctx.INT().getText();
            Object value;
            if ((value = tabla.get(inti)) == null) {
                int line = ctx.INT().getSymbol().getLine();
                int col = ctx.INT().getSymbol().getCharPositionInLine();
                System.exit(-1);
                return null;
            } else {
                return (T) value;
            }
        } else if (ctx.STR() != null) {
            String stri = ctx.STR().getText();
            Object value;
            if ((value = tabla.get(stri)) == null) {
                int line = ctx.STR().getSymbol().getLine();
                int col = ctx.STR().getSymbol().getCharPositionInLine();
                System.exit(-1);
                return null;
            } else {
                return (T) value;
            }
        } else if (ctx.BOOL() != null) {
            String booli = ctx.BOOL().getText();
            Object value;
            if ((value = tabla.get(booli)) == null) {
                int line = ctx.BOOL().getSymbol().getLine();
                int col = ctx.BOOL().getSymbol().getCharPositionInLine();
                System.exit(-1);
                return null;
            } else {
                return  (T) value;
            }
        } else if (ctx.OBJECT() != null) {
            String objecti = ctx.OBJECT().getText();
            Object value;
            if ((value = tabla.get(objecti)) == null) {
                int line = ctx.OBJECT().getSymbol().getLine();
                int col = ctx.OBJECT().getSymbol().getCharPositionInLine();
                System.exit(-1);
                return null;
            } else {
                return (T) value;
            }
        }  else if (ctx.TK_SQR_IZQ() != null) {
            String pari = ctx.TK_SQR_IZQ().getText();
            if (ctx.type()!=null){
                visitType(ctx.type());
                if (ctx.TK_SQR_DER() != null) {
                    String pard = ctx.TK_SQR_DER().getText();
                    return null;
                }else{
                    System.exit(-1);
                    return null;
                }
            }else {
                System.exit(-1);
                return null;
            }
        }
        else{
            System.exit(-1);
            return null;
        }
    }
    @Override
    public T visitTyped_var(chocPyParser.Typed_varContext ctx ){
        Object value;
        if(ctx.IDENTIFIER()!=null) {
            String identivar = ctx.IDENTIFIER().getText();
            if ((value = tabla.get(identivar)) == null) {/*
            aqui se busca en la tabla
            */
                int line = ctx.IDENTIFIER().getSymbol().getLine();
                int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();
                System.exit(-1);
                return null;
            } else {
                if (ctx.TK_DOS_PUNTOS()!=null){
                    String tdot = ctx.TK_DOS_PUNTOS().getText();
                    if (ctx.type()!=null){
                        return visitType(ctx.type());
                    }else{
                        System.exit(-1);
                        return null;
                    }
                    //return (T) value;
                }else{
                    System.exit(-1);
                    return null;
                }
            }
        }else {
            System.exit(-1);
            return null;
        }
    }
    @Override
    public T visitVar_def(chocPyParser.Var_defContext ctx ){
        if (ctx.typed_var()!=null){
            String tyvar = ctx.typed_var().type().getText();
            String name = ctx.typed_var().IDENTIFIER().getText();
            //System.out.println("capturado"+tyvar+name);
            if (!var_exists(name)){
                System.err.println(">>> Error: Declaracion duplicada de identificador: "+name);
                System.exit(-1);
                //error
            }else{
                String lite = ctx.literal().getText();
                boolean error1;
                try {
                    Integer.parseInt(lite);
                    error1 = true;
                } catch (NumberFormatException excepcion) {
                    error1 = false;
                }
                if(error1){
                    if(tyvar.equals("int")){
                        VariableP temp = new VariableP(name,lite,tyvar);
                        tabla.put(name,temp);
                    }else{
                        System.err.println(">>>Error de asignacion, se esperaba un valor de tipo '"+"int"+"', para la variable "+name);
                        System.exit(-1);
                    }
                }else{
                    if(tyvar.equals("bool")) {
                        //System.out.println("Aca bool");
                        if (lite.equals("True") || lite.equals("False")) {
                            VariableP temp = new VariableP(name, lite, tyvar);
                            tabla.put(name, temp);
                        }else{
                            System.err.println(">>>Error de asignacion, se esperaba un valor de tipo '"+"bool"+"', para la variable "+name);
                            System.exit(-1);
                        }
                    }else if(tyvar.equals("str")){
                        if(!lite.equals("True") && !lite.equals("False") && !lite.equals("None") ){
                            VariableP temp = new VariableP(name, lite, tyvar);
                            tabla.put(name, temp);
                        }else{
                            System.err.println(">>>Error de asignacion, se esperaba un valor de tipo '"+"str"+"', para la variable "+name);
                            System.exit(-1);
                        }
                    } else if(tyvar.equals("[bool]")||tyvar.equals("[int]")||tyvar.equals("[str]")) {
                        if (lite.equals("None")) {
                            ArrayList l = new ArrayList();
                            Arreglo temp = new Arreglo(name, l, tyvar);
                            tablaA.put(name, temp);
                        }else{
                            System.err.println(">>>Error de asignacion, se esperaba un valor de tipo '"+"[ ]"+"', para la variable "+name);
                            System.exit(-1);
                        }
                    }
                    else{
                        System.err.println(">>>Error de asignacion, se esperaba un valor de tipo '"+tyvar+"', para la variable "+name);
                        System.exit(-1);
                    }
                }
            }
            if (ctx.TK_ASIG()!=null){
                String asig = ctx.TK_ASIG().getText();
                if(ctx.literal()!=null){
                    String lite = ctx.literal().getText();
                    //con la tabla inicial

                    /*
            aqui se insertar en la tabla
            */return (T) lite;
                }else{
                    System.exit(-1);
                    return null;}
            }else{
                System.exit(-1);
                return null;
            }
        }else{
            System.exit(-1);
            return null;
        }

    }
    @Override
    public T visitCexpr(chocPyParser.CexprContext ctx ){
        if(ctx.literal()!=null){
            String lit = ctx.literal().getText();
            return (T) lit;
        }else if(ctx.IDENTIFIER()!=null&&ctx.LEN()==null){
            String name = ctx.IDENTIFIER().getText();
            Object value;
            if((value=tabla.get(name))!=null){/*
            aqui se busca en la tabla
            */Object val = tabla.get(name).getElemento();
                return (T) val;

            }else if((value=tablaA.get(name))!=null){
                Object val= tablaA.get(name).getElementos();
                return (T) val;
            }
            else {
                int line = ctx.IDENTIFIER().getSymbol().getLine();
                int col =ctx.IDENTIFIER().getSymbol().getCharPositionInLine();
                System.exit(-1);
                return null;
            }
        }else if(ctx.TK_SQR_IZQ()!=null&&ctx.LEN()==null&&ctx.cexpr(0)!=null){
            //visitExpr
            String a=ctx.cexpr(0).getText();
            T pos = visitExpr(ctx.expr(0));
            String r=pos.toString();
            boolean error1;
            try {
                Integer.parseInt(r);
                error1 = false;
            } catch (NumberFormatException excepcion) {
                error1 = true;
            }
            Arreglo valueA = new Arreglo(null,null,null);
            if((valueA= tablaA.get(a))!=null){
                int p=Integer.parseInt(r);
                if(p<0||p>=valueA.getElementos().size()){
                    System.err.println(">>>Error de desbordamiento, el valor "+p+"no es acorde al tamaño de arreglo "+valueA.name);
                    System.exit(-1);
                }
                return (T) valueA.elementos.get(p);
            }else{
                VariableP value =new VariableP(null,null,null);
                if((value= tabla.get(a))!=null){
                    int p=Integer.parseInt(r);
                    if(p<0||p>=value.getElemento().toString().length()-2){
                        //error
                        System.err.println(">>>Error de desbordamiento, el valor "+p+"no es acorde al tamaño de arreglo "+value.name);
                        System.exit(-1);
                    }
                    String ret= String.valueOf(value.getElemento().toString().charAt(p+1));
                    ret='"'+ret+'"';;
                    return (T) ret;
                }
                else{
                    //error
                    System.err.println(">>>Error de ubicacion, no se encontro el elemento en el arreglo '"+a+"'");
                    System.exit(-1);
                }
            }
            //System.out.println("Es elemento de arreglo "+a);
        }
        else if(ctx.TK_SQR_IZQ()!=null&&ctx.LEN()==null){
            ArrayList ret= new ArrayList();
            String a1 = (String) visitExpr(ctx.expr(0));
            boolean Is_int;
            boolean Is_bool;
            try {
                Integer.parseInt(a1);
                Is_int = true;
                Is_bool=false;
            } catch (NumberFormatException excepcion) {
                Is_int = false;
                if(a1.charAt(0)=='"'){
                    Is_bool=false;
                }
                else{
                    Is_bool=true;
                }
            }

            for(int c=0;c<ctx.expr().size();c++){
                a1 = (String) visitExpr(ctx.expr(c));
                boolean Is_inta;
                boolean Is_boola;
                try {
                    Integer.parseInt(a1);
                    Is_inta = true;
                    Is_boola=false;
                } catch (NumberFormatException excepcion) {
                    Is_inta = false;
                    if(a1.charAt(0)=='"'){
                        Is_boola=false;
                    }
                    else{
                        Is_boola=true;
                    }
                }
                if((Is_inta==Is_int)&&(Is_boola==Is_bool)){
                    ret.add(a1);
                    //System.out.println(" Agregado");
                }
                else{
                    System.err.println(">>>ERROR, se esperaba que "+a1+" fuera un tipo distinto de dato para agregar.");
                    System.exit(-1);
                }
            }
            return (T)ret;
        }
        else if(ctx.TK_PAR_IZQ()!=null&&ctx.IDENTIFIER()==null&&ctx.LEN()==null){
            return visitExpr(ctx.expr(0));
        }else if(ctx.MINUS_OP()!=null){
            //System.out.println("minus"+ctx.cexpr(0).getText());
            int r=Integer.parseInt((String) visitCexpr(ctx.cexpr(0)))*-1;
            String ret= Integer.toString(r);
            return (T)(ret);
        }else if(ctx.LEN()!=null){
            if(ctx.IDENTIFIER()!=null){
                String name = ctx.IDENTIFIER().getText();
                VariableP value =new VariableP(null,null,null);
                Arreglo valueA =new Arreglo(null,null,null);
                if((value= tabla.get(name))!=null){
                    if(value.tipo.equals("str")){
                        Integer ret =value.elemento.toString().length()-2;
                        return (T) ret.toString();
                    }
                    else{

                    }
                }else
                if((valueA= tablaA.get(name))!=null){
                    Integer ret =valueA.elementos.size();
                    return (T) ret.toString();
                }
                else{
                    System.err.println(">>>ERROR, argumento invalido ");
                    System.exit(-1);
                }

                return (T) name;

            }else if(ctx.STRING()!=null){
                String a= ctx.STRING().getText();
                Integer r=a.length()-2;

                String ret= Integer.toString(r);
                return(T) ret;
            }else if(ctx.TK_SQR_IZQ()!=null) {
                int a = ctx.expr().size();
                Integer r=a;
                String ret= Integer.toString(r);
                return (T) ret;
            }
        }else if(ctx.logop()!=null){
            //visitExpr
            String op = ctx.logop().getText();
            String a;
            String b;
            try{
                a = (String) visitCexpr(ctx.cexpr(0));
            }catch( ClassCastException excepcion) {
                a = Boolean.toString((Boolean) visitCexpr(ctx.cexpr(0)));
            }
            try{
                b = (String) visitCexpr(ctx.cexpr(1));
            }catch( ClassCastException excepcion) {
                b = Boolean.toString((Boolean) visitCexpr(ctx.cexpr(1)));
            }
            //System.out.println("operando"+a+" "+b);
            boolean resultado;
            try {
                Integer.parseInt(a);
                Integer.parseInt(b);
                resultado = true;
            } catch (NumberFormatException excepcion) {
                resultado = false;
            }
            if(resultado){
                Integer ra;
                Integer rb;
                ra=Integer.parseInt(a);
                rb=Integer.parseInt(b);
                boolean rt = false;
                switch(op){
                    case">":
                        if(ra>rb)
                        {
                            rt=true;
                        }else
                            rt=false;
                        break;
                    case"<":
                        if(ra<rb)
                        {
                            rt=true;
                        }else
                            rt=false;
                        break;
                    case"<=":
                        if(ra<=rb)
                        {
                            rt=true;
                        }else
                            rt=false;
                        break;
                    case">=":
                        if(ra>=rb)
                        {
                            rt=true;
                        }else
                            rt=false;
                        break;
                    case"==":
                        if(ra==rb)
                        {
                            rt=true;
                        }else
                            rt=false;
                        break;
                    case"!=":
                        if(ra!=rb)
                        {
                            rt=true;
                        }else
                            rt=false;
                        break;
                }
                //System.out.println("print def: "+rt);
                return (T) (Boolean)(rt)  ;
            }else{
                boolean error;
                boolean error1;
                try {
                    Integer.parseInt(a);
                    error1 = false;
                } catch (NumberFormatException excepcion) {
                    error1 = true;
                }
                boolean error2;
                try {
                    Integer.parseInt(b);
                    error2 = false;
                } catch (NumberFormatException excepcion) {
                    error2 = true;
                }
                error=error1&&error2;
                boolean r = false;
                if(error){//no hay algun numero
                    if((a.equals("True")||a.equals("False")
                            ||a.equals("true")||a.equals("false"))
                            &&(b.equals("True")||b.equals("False")
                            ||b.equals("true")||b.equals("false"))){

                        switch(op){
                            case"==":
                                if(a.equals("True")||a.equals("true"))
                                {
                                    if(b.equals("True")||b.equals("true")){
                                        r=(true);
                                    }
                                }else if( a.equals("False")||a.equals("False"))
                                {
                                    if(b.equals("False")||b.equals("false")){
                                        //System.out.println(a+"ambos"+b);
                                        r=(true);
                                    }
                                }else{
                                    r=(false);
                                }
                                break;
                            case"!=":
                                if(a.equals("True")||a.equals("true"))
                                {
                                    //System.out.println("igual");
                                    if(b.equals("False")||b.equals("false")){
                                        //System.out.println(a+"ambos"+b);
                                        r=(true);
                                    }
                                }else if( a.equals("False")||a.equals("False"))
                                {
                                    if(b.equals("True")||b.equals("true")){
                                        //System.out.println(a+"ambos"+b);
                                        r=(true);
                                    }
                                }else{
                                    r=(false);
                                }
                            default:
                                int line = ctx.cexpr(0).literal().FALSE().getSymbol().getLine();
                                System.exit(-1);
                                break;
                        }
                    }else if(b.equals(a)){
                        r=true;
                    }else{
                        r=false;
                    }
                    return (T) (Boolean) r;
                }else{//hay numero
                    System.exit(-1);
                }
            }
        }else {
            String op = null;
            if(ctx.bin_op()!=null)
                op = ctx.bin_op().getText();
            else if(ctx.multdiv()!=null)
                op = ctx.multdiv().getText();
            String a = (String) visitCexpr(ctx.cexpr(0));
            String b = (String) visitCexpr(ctx.cexpr(1));
            boolean resultado;
            try {
                Integer.parseInt(a);
                Integer.parseInt(b);
                resultado = true;
            } catch (NumberFormatException excepcion) {
                resultado = false;
            }
            if(resultado){
                Integer ra;
                Integer rb;
                ra=Integer.parseInt(a);
                rb=Integer.parseInt(b);
                if(op==""&&(ra<0||rb<0)){
                    op="+";
                }
                int rt = 0;
                switch(op){
                    case"+":
                        rt=ra+rb;
                        break;
                    case"-":
                        rt=ra-rb;
                        break;
                    case"//":
                        if(rb==0){
                            int line=ctx.cexpr(0).literal().TK_ENTERO().getSymbol().getLine();
                            //int pos=ctx.cexpr(0).literal().TK_ENTERO().getSymbol().;
                            System.err.println(">>>ERROR, no se puede ejecutar una division por 0, linea"+line);
                            System.exit(-1);
                        }
                        rt=ra/rb;
                        break;
                    case"*":
                        rt=ra*rb;
                        break;
                    case"%":
                        rt=ra%rb;
                        break;

                }
                //System.out.println("print def"+rt);
                return (T) Integer.toString(rt)  ;
            }else{
                boolean error;
                try {
                    Integer.parseInt(a);
                    error = false;
                } catch (NumberFormatException excepcion) {
                    error = true;
                }
                boolean error2;
                try {
                    Integer.parseInt(b);
                    error2 = false;
                } catch (NumberFormatException excepcion) {
                    error2 = true;
                }
                error=error&&error2;
                if(error){//ambos no son numeros
                    if((b.equals("True")||b.equals("False"))||(a.equals("True")||a.equals("False"))){
                        System.err.println(">>>ERROR, los valores '"+a+"' & '"+b+"' evaluados se esperaban tipo 'int' ");
                        System.exit(-1);
                    }
                    else{
                        //System.out.println(a+" "+b);
                        String c="";
                        switch(op){
                            case"+":
                                for(int i=0;i<a.length()-1;i++){
                                    c=c+a.charAt(i);
                                }
                                for(int i=1;i<b.length();i++) {
                                    c = c + b.charAt(i);
                                }
                                break;
                            default:
                                System.err.println(">>>ERROR de operacion, no se ejecuto una operacion valida para la cadena de texto. ");
                                System.exit(-1);
                        }
                        //System.out.println("generado"+c);
                        return (T) c;
                    }
                }else{//alguno es numero
                    System.err.println(">>>ERROR de operacion, no es posible operar 'int' con un dato 'str'.");
                    System.exit(-1);
                }
            }
        }
        return null;
    }
    @Override
    public T visitExpr(chocPyParser.ExprContext ctx) {
        if(ctx.NOT()!=null){
            try{
                boolean n=(Boolean)visitExpr(ctx.expr(0));
                //System.out.println("Not devuelve "+!n);
                return (T)(Boolean)!n;
            }
            catch (Exception e){
                //System.out.println("expresion no booleana");
                System.exit(-1);
            }
        }
        else if(ctx.cexpr()!=null){
            return visitCexpr(ctx.cexpr());
        }
        else if(ctx.IF()!=null){
            boolean cond2=false;
            boolean cond1=false;
            try{
                cond1=(Boolean)visitExpr(ctx.expr(1));
                cond2=true;
            }
            catch (Exception e){
                System.err.println(">>>ERROR, la expresion recibida no es de tipo 'bool'.");
                System.exit(-1);
            }
            finally{
                if(cond2) {
                    if (cond1) {
                        return visitExpr(ctx.expr(0));
                    } else {
                        return visitExpr(ctx.expr(2));
                    }
                }
                else{
                    System.err.println(">>>ERROR, error al procesar los datos 'bool'.");
                    System.exit(-1);
                }
            }
        }
        else{
            boolean cond3=false;
            boolean cond2=false;
            boolean cond1=false;
            try{
                cond1=(Boolean)visitExpr(ctx.expr(0));
                cond3=(Boolean)visitExpr(ctx.expr(1));
                cond2=true;
            }
            catch (Exception e){
                System.err.println(">>>ERROR, la expresion recibida no es de tipo 'bool'.");
                System.exit(-1);
            }
            finally{
                if(cond2) {
                    if (ctx.AND() != null) {
                        return (T) (Boolean) (cond1 && cond3);
                    } else if (ctx.OR() != null) {
                        return (T) (Boolean) (cond1 || cond3);
                    } else {
                        return visitChildren(ctx);
                    }
                }
                else{
                    System.err.println(">>>ERROR, error al procesar los datos 'bool'.");
                    System.exit(-1);
                }
            }
        }
        return null;
    }
    @Override
    public T visitSimple_stmt(chocPyParser.Simple_stmtContext ctx) {
        if(ctx.PASS()!=null){
            //no se hace nada
        }
        else if(ctx.RETURN()!=null){
            if(ctx.expr()!=null){
                T Rep=visitExpr(ctx.expr());
                //codigo clase
            }
        }
        else if(ctx.target(0)!=null){
            T rep=visitExpr(ctx.expr());
            boolean error3 = false;
            try {
                ArrayList artemp= (ArrayList) rep;
                error3 = true;
            } catch (Exception e) {
                error3 = false;
            }
            if(error3){
                ArrayList artemp= (ArrayList) rep;
                String tem=artemp.get(0).toString();
                //System.out.println(tem);
                boolean error1;
                try {
                    Integer.parseInt(tem);
                    error1 = true;
                } catch (NumberFormatException excepcion) {
                    error1 = false;
                }
                boolean error2=false;
                if(tem.equals("True")||tem.equals("False")){
                    error2=true;
                }
                for(int i=0;i<ctx.target().size();i++){
                    //System.out.println(ctx.target(i).getText());
                    String name = ctx.target(i).getText();
                    if(tablaA.get(name)!=null){
                        Arreglo tempa=tablaA.get(name);
                        String tipo= tempa.tipo;
                        if((error1&&tipo.equals("[int]"))){
                            Arreglo temp= new Arreglo(name,artemp,tipo);
                            tablaA.replace(name,temp);
                        }
                        else{
                            if(error2&&tipo.equals("[bool]")){
                                Arreglo temp= new Arreglo(name,artemp,tipo);
                                tablaA.replace(name,temp);
                            }else if(!error2&&tipo.equals("[str]")){
                                Arreglo temp= new Arreglo(name,artemp,tipo);
                                tablaA.replace(name,temp);
                            }
                            else{
                                System.err.println(">>>ERROR, los tipos no coinciden.");
                                System.exit(-1);
                            }
                        }
                    }
                }
            }else{
                for(int i=0;i<ctx.target().size();i++){
                    //System.out.println(ctx.target(i).getText());
                    String name = ctx.target(i).getText();
                    boolean error1;
                    try {
                        Integer.parseInt(rep.toString());
                        error1 = true;
                    } catch (NumberFormatException excepcion) {
                        error1 = false;
                    }
                    boolean error2=false;
                    if(rep.toString().equals("True")||rep.toString().equals("False")){
                        error2=true;
                    }
                    if(tabla.get(name)!=null){
                        VariableP tempa=tabla.get(name);
                        String tipo= tempa.getTipo();
                        if((error1&&tipo.equals("int"))){
                            VariableP temp= new VariableP(name,rep,tempa.getTipo());
                            tabla.replace(name,temp);
                        }
                        else{
                            if(error2&&tipo.equals("bool")){
                                VariableP temp= new VariableP(name,rep,tempa.getTipo());
                                tabla.replace(name,temp);
                            }else if(!error2&&tipo.equals("str")){
                                VariableP temp= new VariableP(name,rep,tempa.getTipo());
                                tabla.replace(name,temp);
                            }
                            else{
                                System.err.println(">>>ERROR, los tipos no coinciden.");
                                System.exit(-1);
                            }
                        }
                    }if(ctx.target(i).TK_SQR_IZQ()!=null){
                        String id= ctx.target(i).cexpr().IDENTIFIER().toString();
                        String pos= (String) visitExpr(ctx.target(i).expr());
                        int p=Integer.parseInt(pos);
                        if(tablaA.get(id)!=null){
                            String val = visitExpr(ctx.expr()).toString();
                            tablaA.get(id).replaceElemento(p,val);
                        }else{
                            System.err.println(">>>ERROR, no existe arreglo de nombre '"+tablaA.get(id)+"'.");
                            System.exit(-1);
                        }
                    }

                }
            }
            //System.out.println("se ejecuto un target");
        }
        else if(ctx.PRINT()!=null){
            String argu;
            boolean error1;
            try {
                argu=(String)visitExpr(ctx.expr());
                error1 = true;
            } catch (Exception excepcion) {
                error1 = false;
            }
            if(error1){
                argu=(String)visitExpr(ctx.expr());
            }
            else{
                argu=Boolean.toString((Boolean) visitExpr(ctx.expr()));
            }
//String argAndres=ctx.expr().getText();

            String aux="";
            for(int i=0;i<argu.length();i++){
                if(argu.charAt(i)=='\\'){
                    if(i+1<argu.length()-1){
                        if(argu.charAt(i+1)=='n'){
                            System.err.println(aux);
                            System.exit(-1);
                            i=i+1;
                            aux="";
                        }
                        else if(argu.charAt(i+1)=='t'){
                            aux=aux+" ";
                            i=i+1;
                        }else if(argu.charAt(i+1)=='"'){
                            aux=aux+" ";
                            i=i+1;
                        }else if(argu.charAt(i+1)=='\''){
                            aux=aux+" ";
                            i=i+1;
                        }
                    }
                    else{
                        System.err.println(">>>ERROR, Simbolo \\ al final de el argumento del print en "+argu);
                        System.exit(-1);
                    }
                }
                else aux=aux+argu.charAt(i);
            }
            System.out.println(aux);
        }
        else{
            return visitExpr(ctx.expr());
        }
        return null;
    }
    @Override
    public T visitTarget(chocPyParser.TargetContext ctx) {
        if(ctx.cexpr()!=null){
            //Expresiones complicadas
        }
        else{
            return (T)ctx.IDENTIFIER().getText();
        }
        return super.visitTarget(ctx);
    }
    @Override
    public T visitStmt(chocPyParser.StmtContext ctx) {
        if(ctx.FOR()!=null){
            //codigo for
            String a= ctx.IDENTIFIER().getText();
            VariableP x=new VariableP(null,null);
            if((x=tabla.get(a))!=null){
                try{
                    ArrayList itr=new ArrayList();
                    itr=(ArrayList)visitExpr(ctx.expr(0));
                    int i=0;
                    while(i<itr.size()){
                        x.setElemento(itr.get(i));
                        tabla.replace(a,x);
                        visitBlock(ctx.block(0));
                        i=i+1;
                    }
                }
                catch(Exception e){
                    System.err.println(">>>Error de Casteo, la expresion no es un iterador valido");
                    System.exit(-1);
                }
            }
            else {
                System.err.println(">>>Error de iniciacion, la variable " + a +" no ha sido creada");
                System.exit(-1);
            }
        }
        else if(ctx.WHILE()!=null){
            boolean cond=(Boolean)visitExpr(ctx.expr(0) );
            while (cond){
                visitBlock(ctx.block(0));
                cond=(Boolean)visitExpr(ctx.expr(0) );
            }
        }
        else if(ctx.IF()!=null){
            boolean cond=(Boolean)visitExpr(ctx.expr(0) );
            if(cond){
                visitBlock(ctx.block(0));
            }
            else{
                int eicount=0;
                for(int i=1;i<=ctx.ELIF().size();i++){
                    cond=(Boolean)visitExpr(ctx.expr(i) );
                    if(cond){
                        visitBlock(ctx.block(i));
                        i=i+ctx.ELIF().size();
                    }
                    else eicount=eicount+1;
                }
                if(eicount==ctx.ELIF().size() && ctx.ELSE()!=null){
                    visitBlock(ctx.block(ctx.block().size()-1));
                }
            }
        }
        else if(ctx.simple_stmt()!=null){
            visitSimple_stmt(ctx.simple_stmt());
        }
        else{
            System.exit(-1);
        }
        return null;
    }
    @Override
    public T visitBlock(chocPyParser.BlockContext ctx) {
        nivel++;
        for(int i=0;i<ctx.stmt().size();i++){
            visitStmt(ctx.stmt(i));
        }
        nivel=nivel-1;
        return null;
    }
    @Override
    public T visitFunc_def(chocPyParser.Func_defContext ctx){
        String name=ctx.IDENTIFIER().getText();
        ArrayList<VariableP> arg=new ArrayList();
        for (int i = 0; i <ctx.typed_var().size(); i++) {
            VariableP temp=new VariableP(ctx.typed_var(i).IDENTIFIER().getText(),ctx.typed_var(i).type().getText());
            arg.add(temp);
        }
        Funcion ft=new Funcion(name,ctx.func_body(),ctx.type(),arg);
        if((tabla.get(name)==null)&&(tablaA.get(name)==null)){
            tablafunciones.put(name,ft);
        }
        else{
            System.err.println(">>>ERROR, El nombre "+name+" ya es usado por una variable");
            System.exit(-1);
        }
        return null;
    }
}