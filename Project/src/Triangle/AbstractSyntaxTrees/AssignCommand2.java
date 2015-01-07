//	@authors:- 	megha & nikhil

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


public class AssignCommand2 extends Command {

	public AssignCommand2(Vname vAST, CharacterExpression ceAST, SourcePosition thePosition) {
		super(thePosition);
	    V = vAST;
	    CE = ceAST;
	}

	public Object visit(Visitor v, Object o) {
		return v.visitAssignCommand2(this, o);
	}
	
	 public Vname V;
	 public CharacterExpression CE;
}
