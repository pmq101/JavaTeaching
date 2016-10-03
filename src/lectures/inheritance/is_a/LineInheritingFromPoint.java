package lectures.inheritance.is_a;

import lectures.graphics.Point;
/**
 * CORRECT USE OF INHERITANCE
 * 
 * A class C should inherit for class E only if 
 * it makes sense to use C where E can be used.
 * 
 * Thus, this class should inherit from Point if
 * it makes sense to use a line where a point is expected. 
 * 
 * (T/F) An interface defining a line should inherit from an interface defining
 * a point, that is, LineInheritingFromPoint used inheritance correctly.
 *    
 * In this interface, we are inheriting the X and Y Coordinates of Point
 * so they do not have to be redefined.
 * 
 * Go to interface Locatable to see another way to share code with Point.
 */
public interface LineInheritingFromPoint extends Point {
	int getWidth();

	int getHeight();

	void setWidth(int newVal);

	void setHeight(int newVal);
}
