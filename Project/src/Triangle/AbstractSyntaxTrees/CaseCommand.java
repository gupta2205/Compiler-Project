//added for 9.7		@authors:- 	megha & nikhil
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;
import java.util.LinkedHashMap;

public class CaseCommand extends Command {

	public LinkedHashMap<IntegerLiteral, Command> CASELIST;
	public Command C;
	public Expression E;

	public CaseCommand(Expression eAST, LinkedHashMap<IntegerLiteral, Command> caseList, Command cAST,
			SourcePosition thePosition) {
		super(thePosition);
		E = eAST;
		CASELIST = caseList;
		C = cAST;		
	}

	public Object visit(Visitor v, Object o) {
		  return v.visitCaseCommand(this, o);
	  }
/*
	  public void display(int indent) {
		  super.display(indent);
		  E.display(indent + 1);
		  for(IntegerLiteral IL : MAP.keySet()){
			  IL.display(indent+1);
			  MAP.get(IL).display(indent+1);
		  }
		  C.display(indent+1);
	  }
*/
}
