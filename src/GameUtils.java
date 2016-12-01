import java.awt.Dimension;

public class GameUtils {

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    protected static void setGameboardState(GameTile[][] gameboardState, final Position pos, final GameTile tile) {
        setGameboardState(gameboardState, pos.getX(), pos.getY(), tile);
    }

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    protected static void setGameboardState(GameTile[][] gameboardState, final int x, final int y,
                                     final GameTile tile) {
        gameboardState[x][y] = tile;
    }


}
