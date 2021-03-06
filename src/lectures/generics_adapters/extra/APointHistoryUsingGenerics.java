package lectures.generics_adapters.extra;

import lectures.generics_adapters.AHistory;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;

public class APointHistoryUsingGenerics extends AHistory<Point> implements lectures.arrays.collections_kinds.extra.PointHistory{
	public void addElement(int x, int y) {
		addElement(new ACartesianPoint(x,y));		
	} 
}
