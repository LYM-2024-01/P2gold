// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/decoder.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class decoder {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object Alph=null;
  public static String guardados=null;
  static {
    int $line=0;
    $line=22;
    $try:try {
      guardados=$defaultValue(String.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,null,$line);
    }
  }
  public static ISet Q=null;
  static {
    int $line=0;
    $line=24;
    $try:try {
      Q=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,null,$line);
    }
  }
  public static ISet estadosImpares=null;
  static {
    int $line=0;
    $line=26;
    $try:try {
      estadosImpares=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,null,$line);
    }
  }
  public static ISet estadosTransicionImpares=null;
  static {
    int $line=0;
    $line=27;
    $try:try {
      estadosTransicionImpares=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,null,$line);
    }
  }
  public static ISet estadosParesEstrella=null;
  static {
    int $line=0;
    $line=29;
    $try:try {
      estadosParesEstrella=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,null,$line);
    }
  }
  public static ISet estadosParesnormales=null;
  static {
    int $line=0;
    $line=30;
    $try:try {
      estadosParesnormales=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,null,$line);
    }
  }
  public static ISet estadosPares=null;
  static {
    int $line=0;
    $line=32;
    $try:try {
      estadosPares=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,null,$line);
    }
  }
  public static ISet estadosTransicionPares=null;
  static {
    int $line=0;
    $line=34;
    $try:try {
      estadosTransicionPares=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,null,$line);
    }
  }
  public static ISet letritas=null;
  static {
    int $line=0;
    $line=36;
    $try:try {
      letritas=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,null,$line);
    }
  }
  public static ISet simbolitos=null;
  static {
    int $line=0;
    $line=37;
    $try:try {
      simbolitos=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,null,$line);
    }
  }
  public static Object chars(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v1=$newSet();
      int $v3=$int(0);
      int $v4=$int($invokeMethod("length",string,new Object[]{}))-1;
      $v2:for (int i=$v3; i<=$v4; i++) {
        $v1.add($invokeMethod("charAt",string,new Object[]{i}));
      }
      $result=$v1;
      if (true) break $try;
      $line=40;
      $rethrow(new RuntimeException("The function \"chars(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"chars",$line);
    }
    return $result;
  }
  public static Object charsStrings(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v5=$newSet(GCollections.emptySet());
      $v6:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v5.union(GCollections.unmodifiableSet(((java.lang.Iterable)(decoder.chars(s)))));
      }
      $result=$v5;
      if (true) break $try;
      $line=41;
      $rethrow(new RuntimeException("The function \"charsStrings(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"charsStrings",$line);
    }
    return $result;
  }
  public static Object prefixes(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v7=$newSet();
      int $v9=$int(1);
      int $v10=$int($invokeMethod("length",string,new Object[]{}));
      $v8:for (int i=$v9; i<=$v10; i++) {
        $v7.add($invokeMethod("substring",string,new Object[]{0,i}));
      }
      $result=$v7;
      if (true) break $try;
      $line=43;
      $rethrow(new RuntimeException("The function \"prefixes(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"prefixes",$line);
    }
    return $result;
  }
  public static Object allPrefixes(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v11=$newSet(GCollections.emptySet());
      $v12:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v11.union(GCollections.unmodifiableSet(((java.lang.Iterable)(decoder.prefixes(s)))));
      }
      $result=$v11;
      if (true) break $try;
      $line=44;
      $rethrow(new RuntimeException("The function \"allPrefixes(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"allPrefixes",$line);
    }
    return $result;
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=49;
      Object T=$fix(decoder.createTransducer());
      $line=50;
      System.out.println($message(new Object[]{"Estrada para el coder: "}));
      $line=52;
      Utilities.test($cast(gold.structures.automaton.IAutomaton.class,T));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"main",$line);
    }
  }
  public static ITransducer createTransducer() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=59;
      Object Ls=$fix(GCollections.asSet("a","b","c","d"));
      $line=60;
      gold.structures.set.ISet $v13=$newSet();
      $v14:for (Object a:GCollections.unmodifiableCollection(Ls)) {
        $v13.add($opAdditY("",a));
      }
      Object M1=$fix($v13);
      $line=61;
      gold.structures.set.ISet $v15=$newSet();
      $v16:for (Object a:GCollections.unmodifiableCollection(Ls)) {
        for (Object b:GCollections.unmodifiableCollection(Ls)) {
          $v15.add($opAdditY($opAdditY("",a),b));
        }
      }
      Object M2=$fix($v15);
      $line=62;
      gold.structures.set.ISet $v17=$newSet();
      $v18:for (Object a:GCollections.unmodifiableCollection(Ls)) {
        for (Object b:GCollections.unmodifiableCollection(Ls)) {
          for (Object c:GCollections.unmodifiableCollection(Ls)) {
            $v17.add($opAdditY($opAdditY($opAdditY("",a),b),c));
          }
        }
      }
      Object M3=$fix($v17);
      $line=63;
      gold.structures.set.ISet $v19=$newSet();
      $v20:for (Object s:GCollections.unmodifiableCollection($opUnionY($opUnionY(M1,M2),M3))) {
        $v19.add(s);
      }
      Object MF=$fix($v19);
      $line=65;
      letritas=$cast(ISet.class,$fix(GCollections.asSet("a","b","c","d")));
      $line=66;
      simbolitos=$cast(ISet.class,$fix(GCollections.asSet("!","#")));
      $line=68;
      gold.structures.set.ISet $v21=$newSet();
      $v22:for (Object s:GCollections.unmodifiableCollection(MF)) {
        $v21.add(GCollections.asList(s,"1"));
      }
      estadosImpares=$cast(ISet.class,$fix($v21));
      $line=69;
      gold.structures.set.ISet $v23=$newSet();
      $v24:for (Object s:GCollections.unmodifiableCollection(M3)) {
        $v23.add(GCollections.asList(s,"!"));
      }
      estadosTransicionImpares=$cast(ISet.class,$fix($v23));
      $line=71;
      gold.structures.set.ISet $v25=$newSet();
      $v26:for (Object s:GCollections.unmodifiableCollection(M3)) {
        $v25.add(GCollections.asList(s,"*"));
      }
      estadosParesEstrella=$cast(ISet.class,$fix($v25));
      $line=72;
      gold.structures.set.ISet $v27=$newSet();
      $v28:for (Object s:GCollections.unmodifiableCollection(MF)) {
        $v27.add(GCollections.asList(s,"2"));
      }
      estadosParesnormales=$cast(ISet.class,$fix($v27));
      $line=73;
      estadosPares=$cast(ISet.class,$fix($opUnionY(estadosParesEstrella,estadosParesnormales)));
      $line=75;
      Q=$cast(ISet.class,$fix($opUnionY($opUnionY($opUnionY(estadosImpares,estadosPares),estadosTransicionImpares),GCollections.asSet("INIT","#","!2","*"))));
      $line=76;
      Object \u03A3=$fix($opUnionY($opUnionY(decoder.charsStrings(new GMethod(decoder.class,"letritas")),decoder.charsStrings(simbolitos)),GCollections.asSet('*')));
      $line=77;
      Object O=$fix(\u03A3);
      $line=78;
      Object q_0=$fix("INIT");
      $line=79;
      Object F=$fix(Q);
      $line=81;
      System.out.println($message(new Object[]{Q}));
      $line=82;
      System.out.println($message(new Object[]{\u03A3}));
      $line=84;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,O,q_0,F,new GMethod(decoder.class,"\u03B4"),new GMethod(decoder.class,"imprEstados"),new GMethod(decoder.class,"imprFlechas")});
      if (true) break $try;
      $line=85;
      $rethrow(new RuntimeException("The function \"createTransducer()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"createTransducer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object imprEstados(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=90;
      if ($opEqualY(new GMethod(decoder.class,"q"),"#")) {
        $line=91;
        $result="#";
        if (true) break $try;
      }
      else {
        $line=93;
        if ($opEqualY(new GMethod(decoder.class,"q"),"!2")) {
          $line=94;
          $result="!";
          if (true) break $try;
        }
        else {
          $line=96;
          if ($opMembrY(new GMethod(decoder.class,"q"),estadosTransicionImpares)) {
            $line=97;
            $result="!";
            if (true) break $try;
          }
          else {
            $line=99;
            if ($opMembrY(new GMethod(decoder.class,"q"),estadosParesEstrella)) {
              $line=100;
              $result=$opAdditY("",new GMethod(decoder.class,"q"));
              if (true) break $try;
            }
            else {
              $line=102;
              if ($opMembrY(new GMethod(decoder.class,"q"),estadosParesnormales)) {
                $line=103;
                String palabra=null;
                palabra=$defaultValue(String.class);
                $line=104;
                palabra=$cast(String.class,$fix(new GMethod(decoder.class,"q")));
                $line=106;
                if ($opEqualY(((java.lang.String)palabra).length(),3)) {
                  $line=107;
                  $result=palabra;
                  if (true) break $try;
                }
                else {
                  $line=110;
                  $result="";
                  if (true) break $try;
                }
              }
              else {
                $line=113;
                if ($opMembrY(new GMethod(decoder.class,"q"),estadosImpares)) {
                  $line=114;
                  String palabra=null;
                  palabra=$defaultValue(String.class);
                  $line=115;
                  palabra=$cast(String.class,$fix(new GMethod(decoder.class,"q")));
                  $line=117;
                  if ($opEqualY(((java.lang.String)palabra).length(),3)) {
                    $line=118;
                    $result=palabra;
                    if (true) break $try;
                  }
                  else {
                    $line=121;
                    $result="";
                    if (true) break $try;
                  }
                }
                else {
                  $line=125;
                  $result="";
                  if (true) break $try;
                }
              }
            }
          }
        }
      }
      $line=130;
      $rethrow(new RuntimeException("The function \"imprEstados(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"imprEstados",$line);
    }
    return $result;
  }
  public static Object imprFlechas(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=135;
      $result="";
      if (true) break $try;
      $line=136;
      $rethrow(new RuntimeException("The function \"imprFlechas(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"imprFlechas",$line);
    }
    return $result;
  }
  public static Object \u03B4(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=142;
      if ($opEqualY(new GMethod(decoder.class,"q"),"INIT")) {
        $line=143;
        if ($opMembrY($opAdditY("",new GMethod(decoder.class,"\u03C3")),new GMethod(decoder.class,"letritas"))) {
          $line=144;
          $result=GCollections.asList($opAdditY("",new GMethod(decoder.class,"\u03C3")),"1");
          if (true) break $try;
        }
        else {
          $line=145;
          $result="#";
          if (true) break $try;
        }
      }
      else {
        $line=148;
        if ($opEqualY(new GMethod(decoder.class,"q"),"#")) {
          $line=149;
          $result="#";
          if (true) break $try;
        }
        else {
          $line=151;
          if ($opMembrY(new GMethod(decoder.class,"q"),estadosImpares)) {
            $line=152;
            String letras=null;
            letras=$defaultValue(String.class);
            $line=153;
            letras=$cast(String.class,$fix(new GMethod(decoder.class,"q")));
            $line=154;
            if ($opMembrY($opAdditY("",new GMethod(decoder.class,"\u03C3")),new GMethod(decoder.class,"letritas"))) {
              $line=155;
              if ($opLessqY(((java.lang.String)letras).length(),2)) {
                $line=156;
                $result=GCollections.asList($opAdditY(letras,new GMethod(decoder.class,"\u03C3")),"1");
                if (true) break $try;
              }
              else {
                $line=157;
                $result="#";
                if (true) break $try;
              }
            }
            else {
              $line=160;
              if ($opEqualY($opAdditY("",new GMethod(decoder.class,"\u03C3")),"!")) {
                $line=161;
                if ($opEqualY(((java.lang.String)letras).length(),3)) {
                  $line=162;
                  $result=GCollections.asList(letras,"!");
                  if (true) break $try;
                }
                else {
                  $line=163;
                  $result="#";
                  if (true) break $try;
                }
              }
              else {
                $line=166;
                if ($opEqualY($opAdditY("",new GMethod(decoder.class,"\u03C3")),"#")) {
                  $line=167;
                  $result="#";
                  if (true) break $try;
                }
                else {
                  $line=169;
                  $result="#";
                  if (true) break $try;
                }
              }
            }
          }
          else {
            $line=173;
            if ($opMembrY(new GMethod(decoder.class,"q"),estadosPares)) {
              $line=174;
              String letras1=null;
              letras1=$defaultValue(String.class);
              $line=175;
              String letras2=null;
              letras2=$defaultValue(String.class);
              $line=176;
              letras1=$cast(String.class,$fix(new GMethod(decoder.class,"q")));
              $line=177;
              letras2=$cast(String.class,$fix(new GMethod(decoder.class,"q")));
              $line=179;
              if ($opMembrY(new GMethod(decoder.class,"q"),estadosParesEstrella)) {
                $line=180;
                if ($opEqualY($opAdditY("",new GMethod(decoder.class,"\u03C3")),"!")) {
                  $line=181;
                  if ($opEqualY(((java.lang.String)letras1).length(),3)) {
                    $line=182;
                    $result="!2";
                    if (true) break $try;
                  }
                  else {
                    $line=183;
                    $result="#";
                    if (true) break $try;
                  }
                }
                else {
                  $line=186;
                  if ($opEqualY($opAdditY("",new GMethod(decoder.class,"\u03C3")),"#")) {
                    $line=187;
                    $result="#";
                    if (true) break $try;
                  }
                  else {
                    $line=189;
                    $result="#";
                    if (true) break $try;
                  }
                }
              }
              else {
                $line=192;
                if ($opMembrY(new GMethod(decoder.class,"q"),estadosParesnormales)) {
                  $line=194;
                  if ($opMembrY($opAdditY("",new GMethod(decoder.class,"\u03C3")),new GMethod(decoder.class,"letritas"))) {
                    $line=195;
                    if ($opLessqY(((java.lang.String)letras2).length(),2)) {
                      $line=196;
                      $result=GCollections.asList($opAdditY(letras2,new GMethod(decoder.class,"\u03C3")),"2");
                      if (true) break $try;
                    }
                    else {
                      $line=198;
                      $result="#";
                      if (true) break $try;
                    }
                  }
                  else {
                    $line=201;
                    if ($opEqualY($opAdditY("",new GMethod(decoder.class,"\u03C3")),"!")) {
                      $line=202;
                      if ($opEqualY(((java.lang.String)letras1).length(),3)) {
                        $line=203;
                        $result="!2";
                        if (true) break $try;
                      }
                      else {
                        $line=204;
                        $result="#";
                        if (true) break $try;
                      }
                    }
                    else {
                      $line=207;
                      if ($opEqualY($opAdditY("",new GMethod(decoder.class,"\u03C3")),"#")) {
                        $line=208;
                        $result="#";
                        if (true) break $try;
                      }
                      else {
                        $line=210;
                        $result="#";
                        if (true) break $try;
                      }
                    }
                  }
                }
                else {
                  $line=214;
                  $result="#";
                  if (true) break $try;
                }
              }
            }
            else {
              $line=218;
              if ($opMembrY(new GMethod(decoder.class,"q"),estadosTransicionImpares)) {
                $line=219;
                String letras=null;
                letras=$defaultValue(String.class);
                $line=220;
                letras=$cast(String.class,$fix(new GMethod(decoder.class,"q")));
                $line=222;
                if ($opMembrY($opAdditY("",new GMethod(decoder.class,"\u03C3")),new GMethod(decoder.class,"letritas"))) {
                  $line=223;
                  $result=GCollections.asList($opAdditY("",new GMethod(decoder.class,"\u03C3")),"2");
                  if (true) break $try;
                }
              }
              else {
                $line=226;
                if ($opEqualY($opAdditY("",new GMethod(decoder.class,"\u03C3")),'*')) {
                  $line=226;
                  $result="*";
                  if (true) break $try;
                }
                else {
                  $line=227;
                  $result="#";
                  if (true) break $try;
                }
              }
            }
          }
        }
      }
      $line=230;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object q() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=231;
      $rethrow(new RuntimeException("The function \"q()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"q",$line);
    }
    return $result;
  }
  public static Object \u03C3() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=231;
      $rethrow(new RuntimeException("The function \"\u03C3()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"\u03C3",$line);
    }
    return $result;
  }
  public static Object letritas() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=232;
      $rethrow(new RuntimeException("The function \"letritas()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"letritas",$line);
    }
    return $result;
  }
  public static Object \u03C3() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=236;
      $rethrow(new RuntimeException("The function \"\u03C3()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"\u03C3",$line);
    }
    return $result;
  }
  public static Object q() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=237;
      $rethrow(new RuntimeException("The function \"q()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"q",$line);
    }
    return $result;
  }
  public static Object \u03C3() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=247;
      $rethrow(new RuntimeException("The function \"\u03C3()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,decoder.class,"\u03C3",$line);
    }
    return $result;
  }
}
