import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class ReversiScoreView implements PropertyChangeListener {
	private ReversiModel model;

	public ReversiScoreView(ReversiModel model) {
		this.model = model;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("Black: " + model.getBlackScore());
		System.out.println("White: " + model.getWhiteScore());
		System.out.println("It's " + model.getTurnColor() + "'s turn.");
	}

}
