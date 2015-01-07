//	@authors:- 	megha & nikhil

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class SubscriptVname2 extends Vname {

	
	public SubscriptVname2(Vname vAST, IntegerLiteral ilAST, SourcePosition thePosition) {
		super(thePosition);
		V = vAST;
	    IL = ilAST;
	}

	public Object visit(Visitor v, Object o) {
		return v.visitSubscriptVname2(this, o);
	}

	 public Vname V;
	 public IntegerLiteral IL;
}
