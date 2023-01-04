import com.fasterxml.jackson.databind.ObjectMapper;

//import astra.ast.type.ObjectType;
import astra.core.Module;
import astra.formula.Formula;
import astra.formula.Predicate;
import astra.term.Funct;
import astra.term.ListTerm;
import astra.term.Primitive;
import astra.term.Term;


public class Extra extends Module {

     @ACTION
     public boolean checkstr(Object X){
    ///// public static void method(Object obj) {
          if (X instanceof String)
               return true;
          else{
               return false;
          }

     }

     @ACTION
     public boolean checklong(Object X){
          if (X instanceof Long)
               return true;
          else{
               return false;
          }
     }
     @ACTION
     public boolean checkint(Object X){
          if (X instanceof Integer)
               return true;
          else{
               return false;
          }
     }
}
