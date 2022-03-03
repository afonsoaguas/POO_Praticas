import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Canvas {
	
	private List<AbstractFigure> figList;
	
	public Canvas() {
		figList = new LinkedList<>();
	}
	
	public void add(AbstractFigure fig) {
		figList.add(fig);
	}
	
	public void remove(AbstractFigure fig) {
		figList.remove(fig);
	}
	
	public AbstractFigure higherArea() {
		if(figList.isEmpty())
			return null;
		AbstractFigure higher = null;
		double maxArea = 0;
		for(AbstractFigure fig : figList)
			if(fig.getArea()>maxArea) {
				maxArea=fig.getArea();
				higher=fig;
			}
		return higher;
	}
	
	public void remove() {
		figList.remove(higherArea());
	}
	
	public double totalArea() {
		double higherArea = 0;
		for(AbstractFigure fig : figList)
			higherArea += fig.getArea();
		return higherArea;
	}

}
