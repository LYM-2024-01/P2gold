// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/CodeDeCode.gold"
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
public final class CodeDeCode {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object Alph=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=27;
      if ($opEqualY($invokeField("length",args),0)) {
        $line=27;
        Alph=$fix(GCollections.asSet('a','c','t'));
      }
      else {
        $line=29;
        gold.structures.set.ISet $v1=$newSet();
        int $v3=$int(0);
        int $v4=$int($invokeMethod("length",((java.lang.String[])args)[$int(0)],new Object[]{}))-1;
        $v2:for (int i=$v3; i<=$v4; i++) {
          $v1.add($invokeMethod("charAt",((java.lang.String[])args)[$int(0)],new Object[]{i}));
        }
        Alph=$fix($opDiffeY($v1,GCollections.asSet('$','#')));
      }
      $line=35;
      Object coder=$fix(ReplaceForxyz.createTransducer(Alph));
      $line=37;
      Object deCoder=$fix(InvReplaceForxyz.createTransducer(Alph));
      $line=44;
      System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY($opAdditY("Input strings of the form xyz:W#. with x, y, over ",Alph),"and W  over   "),Alph),"* (end with an empty string)")}));
      $line=47;
      Utilities.testCodeDecode($cast(gold.structures.automaton.ITransducer.class,coder),$cast(gold.structures.automaton.ITransducer.class,deCoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CodeDeCode.class,"main",$line);
    }
  }
}
