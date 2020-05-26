import java.util.ArrayList;
import java.util.HashMap;

public class Myvisitors<T> extends chocPyBaseVisitor<T> {
    String funcion_actual="";
    HashMap<String, VariableP> tabla = new HashMap<>();
    HashMap<String, Arreglo> tablaA = new HashMap<>();
    HashMap<String, Object> tablaclass = new HashMap<>();
    HashMap<String, Object> tablafunciones = new HashMap<>();
    HashMap<String, Object> tablatemp = new HashMap<>();

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
        value= (VariableP) tabla.get(name).getElementos();
        return  value;
    }
    public void var_rplc_value(String name, Object value){
        tabla.get(name).setElemento(value);
    }
    @Override
    public T visitType(chocPyParser.TypeContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String identi = ctx.IDENTIFIER().getText();
            System.out.println("IDENTIFIER: " + identi);
            Object value;
            if ((value = tabla.get(identi)) == null) {
                int line = ctx.IDENTIFIER().getSymbol().getLine();
                int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();
                System.err.printf("Error ubicando IDENTIFIER");
                System.exit(-1);
                return null;
            } else {
                return (T) value;
            }
        } else if (ctx.IDSTRING() != null) {
            String stringi = ctx.IDSTRING().getText();
            System.out.println("IDSTRING: " + stringi);
            Object value;
            if ((value = tabla.get(stringi)) == null) {
                int line = ctx.IDSTRING().getSymbol().getLine();
                int col = ctx.IDSTRING().getSymbol().getCharPositionInLine();
                System.err.printf("Error ubicando IDSTRING");
                System.exit(-1);
                return null;
            } else {
                return (T) value;
            }
        } else if (ctx.INT() != null) {
            String inti = ctx.INT().getText();
            System.out.println("INT: " + inti);
            Object value;
            if ((value = tabla.get(inti)) == null) {
                int line = ctx.INT().getSymbol().getLine();
                int col = ctx.INT().getSymbol().getCharPositionInLine();
                System.err.printf("Error ubicando INT");
                System.exit(-1);
                return null;
            } else {
                return (T) value;
            }
        } else if (ctx.STR() != null) {
            String stri = ctx.STR().getText();
            System.out.println("STR: " + stri);
            Object value;
            if ((value = tabla.get(stri)) == null) {
                int line = ctx.STR().getSymbol().getLine();
                int col = ctx.STR().getSymbol().getCharPositionInLine();
                System.err.printf("Error ubicando STR");
                System.exit(-1);
                return null;
            } else {
                return (T) value;
            }
        } else if (ctx.BOOL() != null) {
            String booli = ctx.BOOL().getText();
            System.out.println("BOOL: " + booli);
            Object value;
            if ((value = tabla.get(booli)) == null) {
                int line = ctx.BOOL().getSymbol().getLine();
                int col = ctx.BOOL().getSymbol().getCharPositionInLine();
                System.err.printf("Error ubicando BOOL");
                System.exit(-1);
                return null;
            } else {
                return  (T) value;
            }
        } else if (ctx.OBJECT() != null) {
            String objecti = ctx.OBJECT().getText();
            System.out.println("OBJECT: " + objecti);
            Object value;
            if ((value = tabla.get(objecti)) == null) {
                int line = ctx.OBJECT().getSymbol().getLine();
                int col = ctx.OBJECT().getSymbol().getCharPositionInLine();
                System.err.printf("Error ubicando BOOL");
                System.exit(-1);
                return null;
            } else {
                return (T) value;
            }
        }  else if (ctx.TK_SQR_IZQ() != null) {
            String pari = ctx.TK_SQR_IZQ().getText();
            System.out.println("tk_SQR_IZR:"+pari);
            if (ctx.type()!=null){
                System.out.println("type: "+ctx.type().getText());
                visitType(ctx.type());
                if (ctx.TK_SQR_DER() != null) {
                    String pard = ctx.TK_SQR_DER().getText();
                    System.out.println("tk_SQR_DER:"+pard);
                    return null;
                }else{
                    System.err.printf("Error, no se encuentra vari en []");
                    System.exit(-1);
                    return null;
                }
            }else {
                System.err.printf("Error, no se encuentra el tipo de variable a identificar");
                System.exit(-1);
                return null;
            }
        }
        else{
            System.out.println("Error TYPE");
            System.err.printf("error");
            System.exit(-1);
            return null;
        }
    }

    @Override
    public T visitTyped_var(chocPyParser.Typed_varContext ctx ){
        Object value;
        if(ctx.IDENTIFIER()!=null) {
            String identivar = ctx.IDENTIFIER().getText();
            System.out.println("IDENTIFIER: " + identivar);
            if ((value = tabla.get(identivar)) == null) {/*
            aqui se busca en la tabla
            */
                int line = ctx.IDENTIFIER().getSymbol().getLine();
                int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();
                System.err.printf("Error ubicando IDENTIFIER");
                System.exit(-1);
                return null;
            } else {
                if (ctx.TK_DOS_PUNTOS()!=null){
                    String tdot = ctx.TK_DOS_PUNTOS().getText();
                    System.out.println("tk_dos_puntos:"+tdot);
                    if (ctx.type()!=null){
                        System.out.println("type: "+ctx.type().getText());
                        return visitType(ctx.type());
                    }else{
                        System.err.printf("Error, no se encuentra el tipo de variable a identificar");
                        System.exit(-1);
                        return null;
                    }
                    //return (T) value;
                }else{
                    System.err.printf("Error, no se encuentra 2 puntos");
                    System.exit(-1);
                    return null;
                }
            }
        }else {
            System.out.println("Error TYPED");
            System.err.printf("error");
            System.exit(-1);
            return null;
        }
    }

    @Override
    public T visitVar_def(chocPyParser.Var_defContext ctx ){
        if (ctx.typed_var()!=null){
            String tyvar = ctx.typed_var().type().getText();
            String name = ctx.typed_var().IDENTIFIER().getText();
            System.out.println("capturado"+tyvar+name);
            if (!var_exists(name)){
                System.out.println("error variable repetida");
                //error
            }else{
                // System.out.println("im here");
                String lite = ctx.literal().getText();
                //System.out.println("im here"+lite);
                boolean error1;
                try {
                    Integer.parseInt(lite);
                    error1 = true;
                } catch (NumberFormatException excepcion) {
                    error1 = false;
                }
                System.out.println("r"+error1);
                if(error1){
                    if(tyvar.equals("int")){
                        //System.out.println("aca");
                        VariableP temp = new VariableP(name,lite,tyvar);
                        tabla.put(name,temp);
                        System.out.println(name + "   lite: " +lite + "tyvar: " +tyvar);
                        System.out.println("se inserto");
                    }else{
                        //error no coinciden los tipos
                    }
                }else{
                    if(tyvar.equals("bool")) {
                        //System.out.println("Aca bool");
                        if (lite.equals("True") || lite.equals("False")) {
                            VariableP temp = new VariableP(name, lite, tyvar);
                            tabla.put(name, temp);
                            System.out.println("se inserto booleano");
                        }else{
                            System.out.println("No es valido para una variable booleana");
                        }
                    }else if(tyvar.equals("str")){
                        VariableP temp = new VariableP(name, lite, tyvar);
                        tabla.put(name, temp);
                        System.out.println("se inserto cadena");
                    } else if(tyvar.equals("[bool]")||tyvar.equals("[int]")||tyvar.equals("[str]")) {
                        if (lite.equals("None")) {
                            VariableP temp = new VariableP(name, lite, tyvar);
                            tabla.put(name, temp);
                            System.out.println("se inserto arreglo");
                        }else{
                            System.out.println("No es valido para una variable booleana");
                        }
                    }
                    else{
                        System.out.println("Error texto");
                }
                }
            }
            System.out.println("typed_var"+tyvar);
            if (ctx.TK_ASIG()!=null){
                String asig = ctx.TK_ASIG().getText();
                System.out.println("tk:asig"+asig);
                if(ctx.literal()!=null){
                    String lite = ctx.literal().getText();
                    System.out.println("literal"+lite);

                    //con la tabla inicial

                    /*
            aqui se insertar en la tabla
            */return (T) lite;
                    //if(ctx.NEWLINE!=null){
                    //System.out.println("FIN DE LINEA");
                    //}else if(ctx.EOF!=null){
                    //System.out.println("FIN DE ARCHIVO");
                    //}
                }else{
                    System.err.printf("Error, no se asigno un elemento");
                    System.exit(-1);
                    return null;}
            }else{
                System.err.printf("Error, no se encontro TK_ASIG");
                System.exit(-1);
                return null;
            }
        }else{
            System.err.printf("Error, no sea impedido");
            System.exit(-1);
            return null;
        }

    }
    
    @Override
    public T visitCexpr(chocPyParser.CexprContext ctx ){
        if(ctx.literal()!=null){
            String lit = ctx.literal().getText();
            System.out.println("literal"+lit);
            return (T) lit;
        }else if(ctx.IDENTIFIER()!=null){
            String name = ctx.IDENTIFIER().getText();
            System.out.println("print def"+name);
            Object value;
            if((value=tabla.get(name).getElementos())==null){/*
            aqui se busca en la tabla
            */
                int line = ctx.IDENTIFIER().getSymbol().getLine();
                int col =ctx.IDENTIFIER().getSymbol().getCharPositionInLine();
                System.err.printf("error");
                System.exit(-1);
                return null;
            }else {
                return (T) value;
            }
        }else if(ctx.TK_SQR_IZQ()!=null&&ctx.LEN()==null){
            //visitExpr
        }
        else if(ctx.TK_PAR_IZQ()!=null&&ctx.IDENTIFIER()==null&&ctx.LEN()==null){
            return visitExpr(ctx.expr(0));
        }else if(ctx.MINUS_OP()!=null){
            System.out.println("minus"+ctx.cexpr(0).getText());
            int r=Integer.parseInt((String) visitCexpr(ctx.cexpr(0)))*-1;
            String ret= Integer.toString(r);
            return (T)(ret);
        }else if(ctx.LEN()!=null){
            if(ctx.IDENTIFIER()!=null){
                //
                //System.out.println("acaestoy");
            }else if(ctx.STRING()!=null){
                String a= ctx.STRING().getText();
                System.out.println(a);
                Integer r=a.length()-2;
                String ret= Integer.toString(r);
                return(T) ret;
            }else if(ctx.TK_SQR_IZQ()!=null) {
                //System.out.println("acaestoy");
                int a = ctx.expr().size();
                System.out.println(a);
                return null;
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
            System.out.println("operando"+a+" "+b);
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
                            System.out.println("mayor");
                            rt=true;
                        }else
                            rt=false;
                        break;
                    case"<":
                        if(ra<rb)
                        {
                            System.out.println("menor");
                            rt=true;
                        }else
                            rt=false;
                        break;
                    case"<=":
                        if(ra<=rb)
                        {
                            System.out.println("menorigual");
                            rt=true;
                        }else
                            rt=false;
                        break;
                    case">=":
                        if(ra>=rb)
                        {
                            System.out.println("mayorigual");
                            rt=true;
                        }else
                            rt=false;
                        break;
                    case"==":
                        if(ra==rb)
                        {
                            System.out.println("igual");
                            rt=true;
                        }else
                            rt=false;
                        break;
                    case"!=":
                        if(ra!=rb)
                        {
                            System.out.println("diferente");
                            rt=true;
                        }else
                            rt=false;
                        break;
                }

                System.out.println("print def"+rt);
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

                                    //System.out.println("igual");
                                    if(b.equals("True")||b.equals("true")){
                                        System.out.println(a+"ambos"+b);
                                        r=(true);
                                    }


                                }else if( a.equals("False")||a.equals("False"))
                                {
                                    if(b.equals("False")||b.equals("false")){
                                        System.out.println(a+"ambos"+b);
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
                                        System.out.println(a+"ambos"+b);
                                        r=(true);
                                    }

                                }else if( a.equals("False")||a.equals("False"))
                                {
                                    if(b.equals("True")||b.equals("true")){
                                        System.out.println(a+"ambos"+b);
                                        r=(true);
                                    }

                                }else{
                                    r=(false);
                                }
                            default:
                                int line = ctx.cexpr(0).literal().FALSE().getSymbol().getLine();
                                System.err.printf("error compare"+line);
                                System.exit(-1);
                                break;
                        }

                    }else if(b.equals(a)){
                        r=true;
                    }else{
                        r=false;
                    }
                    System.out.println("resultado =="+r);
                    return (T) (Boolean) r;
                }else{//hay numero
                    System.err.printf("error comparacion ");
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
            System.out.println("operando"+a+" "+b);
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
                            System.err.printf("error div por 0 linea"+line);
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
                System.out.println("print def"+rt);
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
                        System.out.println("print error bool string def");
                    }
                    else{
                        System.out.println(a+" "+b);
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
                                System.out.println("error operacion invalida string");
                        }
                        System.out.println("generado"+c);
                        return (T) c;
                    }
                }else{//alguno es numero
                    System.out.println("error numero + string");
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
                System.out.println("Not devuelve "+!n);
                return (T)(Boolean)!n;
            }
            catch (Exception e){
                System.out.println("expresion no booleana");
                System.exit(-1);
            }
        }
        else if(ctx.cexpr()!=null){
            System.out.println("expr"+ctx.cexpr().getText());
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
                System.out.println("expresion no booleana");
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
                    System.out.println("El error te debio haber sacado como esta aqui");
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
                System.out.println("expresion no booleana");
                System.exit(-1);
            }
            finally{
                if(cond2) {
                    if (ctx.AND() != null) {
                        System.out.println("AND res "+(cond1 && cond3));
                        return (T) (Boolean) (cond1 && cond3);
                    } else if (ctx.OR() != null) {
                        System.out.println("O sca R "+(cond1 || cond3));
                        return (T) (Boolean) (cond1 || cond3);
                    } else {
                        System.out.println("De verdad no te reconocio");
                        return visitChildren(ctx);
                    }
                }
                else{
                    System.out.println("El error te debio haber sacado como esta aqui");
                }
            }
        }
        return null;
    }
    @Override
    public T visitSimple_stmt(chocPyParser.Simple_stmtContext ctx) {
        if(ctx.PASS()!=null){
            //no se hace nada
            System.out.println("se ejecuto un pass");
        }
        else if(ctx.RETURN()!=null){
            if(ctx.expr()!=null){
                T Rep=visitExpr(ctx.expr());
                //codigo clase
            }
            System.out.println("se ejecuto un return");
        }
        else if(ctx.target(0)!=null){
            T rep=visitExpr(ctx.expr());
            for(int i=0;i<ctx.target().size();i++){
                System.out.println(ctx.target(i).getText());
                String name = ctx.target(i).getText();
                System.out.println(rep.toString());
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
                        System.out.println("no es elemento de arreglo");
                    }
                    else{
                        if(error2&&tipo.equals("bool")){
                            VariableP temp= new VariableP(name,rep,tempa.getTipo());
                            tabla.replace(name,temp);
                            System.out.println("no es elemento de arreglo");
                        }else if(!error2&&tipo.equals("str")){
                            VariableP temp= new VariableP(name,rep,tempa.getTipo());
                            tabla.replace(name,temp);
                            System.out.println("no es elemento de arreglo");
                        }
                        else{
                            System.out.println("error tipos");
                        }
                    }
                }else if(tablaA.get(name)!=null){

                    System.out.println("es arreglo");
                }if(ctx.target(i).TK_SQR_IZQ()!=null){
                    if(tablaA.get(ctx.target(i).IDENTIFIER())!=null){

                    }else{
                        System.out.println("es error no hay arreglo con ese nombre");
                    }
                    System.out.println("es elemento de arreglo");
                }
                /*String name=visitTarget(ctx.target(i)).toString();//obtiene el nombre de el target no su valor
                if(tabla.get(name)!=null){
                    tabla.replace(name,rep);
                }
                else{
                    System.out.println(name+" no ha sido inicializado");
                    System.exit(-1);
                }*//*
            aqui se busca en la tabla
            */
                //System.out.println(ctx.target().size());
            }
            System.out.println("se ejecuto un target");
        }
        else if(ctx.PRINT()!=null){
            String argu=(String)visitExpr(ctx.expr());
            String argAndres=ctx.expr().getText();
            String aux="";
            for(int i=0;i<argu.length();i++){
                if(argu.charAt(i)=='\\'){
                    if(i+1<argu.length()-1){
                        if(argu.charAt(i+1)=='n'){
                            System.out.println(aux);
                            i=i+1;
                            aux="";
                        }
                        else if(argu.charAt(i+1)=='t'){
                            aux=aux+"    ";
                            i=i+1;
                        }else if(argu.charAt(i+1)=='"'){
                            aux=aux+"    ";
                            i=i+1;
                        }else if(argu.charAt(i+1)=='\''){
                            aux=aux+"    ";
                            i=i+1;
                        }
                    }
                    else{
                        System.out.println("Simbolo \\ al final de el argumento del print en "+argu);
                        System.exit(-1);
                    }
                }
                else aux=aux+argu.charAt(i);
            }
            System.out.println(aux);
            System.out.println(argAndres);
            //System.out.println(argu);
            //System.out.println(visitExpr(ctx.expr()));
            System.out.println("se ejecuto un print");
        }
        else{
            System.out.println("se ejecuto un expr");
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
            System.out.print(a);
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
            System.out.println("entro a simplestmt"+ctx.simple_stmt().getText());
            visitSimple_stmt(ctx.simple_stmt());
        }
        else{
            System.out.println("Como llegaste aqui");
            System.exit(-1);
        }
        return null;
    }

    @Override
    public T visitBlock(chocPyParser.BlockContext ctx) {
        for(int i=0;i<ctx.stmt().size();i++){
            visitStmt(ctx.stmt(i));
        }
        return null;
    }
}
