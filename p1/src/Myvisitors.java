import java.util.HashMap;

public class Myvisitors<T> extends chocPyBaseVisitor<T>{
    HashMap<String,Object> tabla = new HashMap<>();
    @Override
    public T visitCexpr(chocPyParser.CexprContext ctx ){
        if(ctx.literal()!=null){

            String lit = ctx.literal().getText();
            System.out.println("literal"+lit);
            boolean resultado;
            try {
                Integer.parseInt(lit);
                resultado = true;
            } catch (NumberFormatException excepcion) {
                resultado = false;
            }
            if(resultado){
                Integer r = Integer.parseInt(lit);
                System.out.println(r);
                return (T) r;
            }else{
                return (T) lit;
            }

        }else if(ctx.IDENTIFIER()!=null){
            String name = ctx.IDENTIFIER().getText();
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
        }else if(ctx.bin_op()!=null){
            String a = (String) visitCexpr(ctx.cexpr(0));
    
            String op = ctx.bin_op().getText();

            System.out.println("print def"+a);
            //visitExpr
        }
        return null;
    }
}
