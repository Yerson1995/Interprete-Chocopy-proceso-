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
                if(a.equals("True")||a.equals("False")){
                    switch(op){
                        case">":
                            int line = ctx.cexpr(0).literal().FALSE().getSymbol().getLine();
                            System.err.printf("error compare"+line);
                            System.exit(-1);
                            break;
                        /*case"<":
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
                            break;*/
                    }
                    /*System.err.printf("error compare");
                    System.exit(-1);*/
                }else if(b.equals("True")||b.equals("False")){

                }
                System.out.println("print def strings"+a);
            }
        }else {
            String op = null;
            if(ctx.bin_op()!=null)
            op = ctx.bin_op().getText();
            else if(ctx.multdiv()!=null)
                op = ctx.multdiv().getText();
            //else if (ctx.logop()!=null)
                //op = ctx.logop().getText();

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
                            System.err.printf("error div por 0");
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
                    error = true;
                } catch (NumberFormatException excepcion) {
                    error = false;
                }
                boolean error2;
                try {
                    Integer.parseInt(b);
                    error2 = true;
                } catch (NumberFormatException excepcion) {
                    error2 = false;
                }
                error=error&&error2;
                if(error){

                }else{

                }
                System.out.println("print string def"+error);
            }

            //visitExpr
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
