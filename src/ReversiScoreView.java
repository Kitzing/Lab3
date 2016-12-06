import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class ReversiScoreView implements PropertyChangeListener {
private ReversiModel.Turn oldTurn = ReversiModel.Turn.BLACK;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getSource().getClass() == ReversiModel.class) {
			ReversiModel model = (ReversiModel) evt.getSource();
			if(model.getTurnColor() != oldTurn) {
				System.out.println("Black: " + model.getBlackScore());
				System.out.println("White: " + model.getWhiteScore());
				System.out.println("It's " + model.getTurnColor() + "'s turn.");
				oldTurn = model.getTurnColor();
			}
		}
	}

}
