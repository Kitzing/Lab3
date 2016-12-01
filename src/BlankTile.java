import java.awt.*;

/**
 * Created by Sara on 2016-12-01.
 */
public class BlankTile implements GameTile {
    @Override
    public void draw(Graphics g, int x, int y, Dimension d) {
        // The default GameTile is transparent,
        // therefore no drawing is performed.
    }
}
