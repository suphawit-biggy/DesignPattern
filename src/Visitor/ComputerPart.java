package Visitor;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
