
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.rex.compiladormultilenguajeservidor.utilidades.proyecto.analisis;

import java.util.List;
import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\002\003\000\002\002\004\000\002\003" +
    "\010\000\002\004\012\000\002\005\003\000\002\005\002" +
    "\000\002\006\003\000\002\006\004\000\002\007\003\000" +
    "\002\007\002\000\002\010\003\000\002\010\004\000\002" +
    "\011\020\000\002\012\020" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\004\004\004\001\002\000\004\006\010\001" +
    "\002\000\004\002\001\001\002\000\004\002\007\001\002" +
    "\000\004\002\000\001\002\000\004\037\011\001\002\000" +
    "\004\007\012\001\002\000\004\010\013\001\002\000\004" +
    "\020\016\001\002\000\004\005\015\001\002\000\004\002" +
    "\uffff\001\002\000\006\012\021\021\ufffc\001\002\000\004" +
    "\021\ufffd\001\002\000\004\021\062\001\002\000\004\014" +
    "\024\001\002\000\006\012\021\021\ufffb\001\002\000\004" +
    "\021\ufffa\001\002\000\004\037\025\001\002\000\004\015" +
    "\026\001\002\000\004\016\027\001\002\000\004\037\030" +
    "\001\002\000\004\017\031\001\002\000\004\020\032\001" +
    "\002\000\006\012\021\021\ufffc\001\002\000\004\021\034" +
    "\001\002\000\004\022\035\001\002\000\006\023\ufff8\024" +
    "\041\001\002\000\004\023\060\001\002\000\004\023\ufff9" +
    "\001\002\000\006\023\ufff7\024\041\001\002\000\004\026" +
    "\042\001\002\000\004\037\043\001\002\000\004\027\044" +
    "\001\002\000\004\030\045\001\002\000\004\037\046\001" +
    "\002\000\004\031\047\001\002\000\004\032\050\001\002" +
    "\000\004\037\051\001\002\000\004\033\052\001\002\000" +
    "\004\034\053\001\002\000\004\036\054\001\002\000\004" +
    "\035\055\001\002\000\004\025\056\001\002\000\006\023" +
    "\ufff4\024\ufff4\001\002\000\004\023\ufff6\001\002\000\004" +
    "\013\061\001\002\000\006\012\ufff5\021\ufff5\001\002\000" +
    "\004\022\063\001\002\000\006\023\ufff8\024\041\001\002" +
    "\000\004\023\065\001\002\000\004\011\066\001\002\000" +
    "\004\005\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\006\002\005\003\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\013\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\005\017\006\016\011\021\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\006\022" +
    "\011\021\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\005\032\006\016\011" +
    "\021\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\007\035\010\036\012\037\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\010\056\012\037\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\007\063\010\036\012\037" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public void syntax_error(Symbol symbol){
        if(symbol.value==null){
            System.out.println("ERROR_SINTACTICO EN::NULL LINEA:"+symbol.left+" COLUMNA:"+symbol.right);
        }else{
            System.out.println("ERROR_SINTACTICO EN::"+((String)symbol.value)+" LINEA:"+symbol.left+" COLUMNA:"+symbol.right);
        }
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // inicial ::= proyecto 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicial",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // proyecto ::= ET_PROYECTO_INIC ET_NOMBRE_PROYECTO_INIC ID_NOMBRE ET_NOMBRE_PROYECTO_FIN paquete_principal ET_PROYECTO_FIN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("proyecto",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // paquete_principal ::= ET_PAQUETE_PRINCIPAL_INIC ET_PAQUETES_PAQUETE_INIC paquetes ET_PAQUETES_PAQUETE_FIN ET_ARCHIVOS_PAQUETE_INIC archivos ET_ARCHIVOS_PAQUETE_FIN ET_PAQUETE_PRINCIPAL_FIN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("paquete_principal",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // paquetes ::= paquetes_p 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("paquetes",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // paquetes ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("paquetes",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // paquetes_p ::= paquete 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("paquetes_p",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // paquetes_p ::= paquete paquetes_p 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("paquetes_p",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // archivos ::= archivos_p 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("archivos",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // archivos ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("archivos",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // archivos_p ::= archivo 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("archivos_p",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // archivos_p ::= archivo archivos_p 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("archivos_p",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // paquete ::= ET_PAQUETE_INIC ET_NOMBRE_PAQUETE_INIC ID_NOMBRE ET_NOMBRE_PAQUETE_FIN ET_ID_PAQUETE_INIC ID_NOMBRE ET_ID_PAQUETE_FIN ET_PAQUETES_PAQUETE_INIC paquetes ET_PAQUETES_PAQUETE_FIN ET_ARCHIVOS_PAQUETE_INIC archivos ET_ARCHIVOS_PAQUETE_FIN ET_PAQUETE_FIN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("paquete",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-13)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // archivo ::= ET_ARCHIVO_INIC ET_NOMBRE_ARCHIVO_INIC ID_NOMBRE ET_NOMBRE_ARCHIVO_FIN ET_ID_ARCHIVO_INIC ID_NOMBRE ET_ID_ARCHIVO_FIN ET_PAQUETE_ARCHIVO_INIC ID_NOMBRE ET_PAQUETE_ARCHIVO_FIN ET_CODIGO_ARCHIVO_INIC CODIGO ET_CODIGO_ARCHIVO_FIN ET_ARCHIVO_FIN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("archivo",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-13)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
