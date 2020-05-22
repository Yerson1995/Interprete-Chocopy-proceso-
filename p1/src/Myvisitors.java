import java.util.HashMap;

public class Myvisitors<T> extends chocPyBaseVisitor<T>{
    HashMap<String,Object> tabla = new HashMap<>();
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
            if((value=tabla.get(name))==null){
                int line = ctx.IDENTIFIER().getSymbol().getLine();
                int col =ctx.IDENTIFIER().getSymbol().getCharPositionInLine();
                System.err.printf("error");
                System.exit(-1);
                return null;
            }else {
                return (T) value;
            }
        }else if(ctx.TK_SQR_IZQ()!=null){
            //visitExpr
        }
        else if(ctx.TK_PAR_IZQ()!=null&&ctx.IDENTIFIER()==null){
            return visitExpr(ctx.expr(0));
        }else if(ctx.MINUS_OP()!=null){
            return visitExpr(ctx.expr(0));
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
                        //System.out.println("generado"+c);
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
}
