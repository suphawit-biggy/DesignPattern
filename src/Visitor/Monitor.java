package Visitor;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class Monitor implements ComputerPart {
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}