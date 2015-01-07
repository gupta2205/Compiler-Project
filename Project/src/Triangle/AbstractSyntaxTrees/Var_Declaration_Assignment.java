
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

// @author:- 	megha & nikhil

public class Var_Declaration_Assignment extends Declaration {

	
	public Var_Declaration_Assignment(Identifier iAST, Expression eAST,
			Vname vAST, SourcePosition thePosition) {
		super(thePosition);
		I = iAST;
		E = eAST;
		V = vAST;
	}


	public Object visit(Visitor v, Object o) {
		return v.visitVarDeclarationAssignment(this, o);
	}

	public Identifier I;
	public Expression E;
	public Vname V;
	public TypeDenoter T;
}
