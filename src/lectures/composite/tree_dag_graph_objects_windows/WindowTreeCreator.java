package lectures.composite.tree_dag_graph_objects_windows;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
/**
 * This class creates a logical and physical structure very different from the
 * Cartesian Plane - one that teaches you something about how a GUI is 
 * implemented.
 * 
 * Look at the class and understand as much of it as possible on your own
 * based on intuition.
 *
 */
public class WindowTreeCreator {
	public static void main (String[] args) {
		createTree();
	}
	public static JFrame createTree () {
		
		JFrame frame = new JFrame(); // creating widget structure root
		
		JSplitPane splitPane = new JSplitPane();
		frame.add(splitPane); // split pane is now a descendant of frame
		
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		splitPane.setLeftComponent(leftPanel); //  leftPanel is now the left child of split pane
		splitPane.setRightComponent(rightPanel);// rightPanel is now the right child of split pane
		
		JTextField textField = new JTextField("Edit me");
		leftPanel.add(textField); // textField is now a child of leftPanel
		
		JButton button = new JButton ("Press me");
		rightPanel.add(button); // button is now a child of rightPanel
		
		frame.setSize(200, 100);
		frame.setVisible(true);
		
		// set break point at this return statement
		return frame;
	}
/* 
 * 
 * The logical structure of this object is composed of different kinds of 
 * "widgets" - objects that represent buttons, textboxes and other images 
 * drawn in rectangles (windows) on the screen.
 * 
 *  Widgets may be readonly by the user (e.g. labels) or can be
 *  manipulated by the user (e.g. textboxed).
 * 
 * 
 * The widgets used here are a button, a textfield, two panels, a split pane, 
 * and a frame (top level window).
 * 
 * If we want a widget to be displayed in another widget, 
 * then we must make it a child of the latter.
 * 
 * A child of a widget is displayed within the area of the parent
 * widget.
 * 
 * Every displayed widget must be a frame or have a frame as 
 * its ancestor, otherwise it is not displayed.
 * 
 * 
 * In Java, a frame is an instance of the Frame or JFrame classes.
 * 
 * An example of a Java widget is a:
 * 		a) String
 * 		b) JTextField
 * 		c) int
 * 
 * A Java widget is:
 *   (a) an arbitrary Java object 	
 *   (b) a Java object that represents an image drawn in a rectangular area of 
 *        the screen. 	
*    (c) a Java object that represents a 3-D physical object in the real-world
*    
 * A widget is displayed:
 *    (a) within its parent widget.
 *    (b) within its child widget.
 *    (c) anywhere on the screen.
 * 
 * Which nodes of the logical structure of a frame can be displayed?
 *     (a) root (the frame)
 *     (b) interior nodes
 *     (c) leaf nodes 
 *  
 */
/*
 * Run the program it in the debug mode, stopping at the break point that
 * you are asked to place.
 * 
 * When the program stops, verify the containment relationship on the screen 
 * among widgets and their children.
 * 
 * Now verify the parent-child relationship itself by looking in the 
 * "Variables" tab in the debugger.
 * 
 * Start with the splitPane.
 * 
 * Each of these widgets has an instance variable called "component",
 * which can be expanded 
 * to see the (physical) children under "elementData".
 * 
 * Verify that you can reach the text field or button from the splitPane.
 * 
 * In WindowTreeCreator, a JPanel instance is:
 * 		(a) the root of the widget tree.
 * 		(b) an interior node of the widget tree,
 * 		(c) a leaf of the widget tree.
 * 
 * In WindowTreeCreator, a JTextField instance is:
 * 		(a) the root of the widget tree.
 * 		(b) an interior node of the widget tree,
 * 		(c) a leaf of the widget tree.
 * 
 *  In WindowTreeCreator, a JFrame instance is:
 * 		(a) the root of the widget tree.
 * 		(b) an interior node of the widget tree,
 * 		(c) a leaf of the widget tree.
 * 
 */
 /*
  * Next class: WindowDAGCreator 
  */

}
