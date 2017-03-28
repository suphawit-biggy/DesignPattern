package Visitor;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public interface ComputerPartVisitor {
	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}