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
        else if(ctx.TK_PAR_IZQ()!=null){
            //visitExpr
        }else {
            String op = ctx.bin_op().getText();
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

                }

                System.out.println("print def"+rt);
                return (T) Integer.toString(rt)  ;
            }else{

            }
            System.out.println(b.getClass());



            System.out.println("print def");
            //visitExpr
        }
        return null;
    }
}
