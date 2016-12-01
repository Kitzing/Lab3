import java.awt.*;


/**
 * Common superclass for all game model classes.
 *
 * Constructors of subclasses should initiate matrix elements and additional,
 * game-dependent fields.
 */
public interface IGameModel {

    /** A Matrix containing the state of the gameboard. */
    public GameTile[][] gameboardState;

    /** The size of the state matrix. */
     public Dimension gameboardSize = Constants.getGameSize();

	/*
	/**
	 * Create a new game model. As GameModel is an abstract class, this is only
	 * intended for subclasses.
	 */
/*	protected IGameModel() {
		this.gameboardState =
				new GameTile[this.gameboardSize.width][this.gameboardSize.height];
	}

*/
    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    public void setGameboardState(final Position pos, final GameTile tile);

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
    public void setGameboardState(final int x, final int y, final GameTile tile);

    /**
     * Returns the GameTile in logical position (x,y) of the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     */
    public GameTile getGameboardState(final Position pos);

    /**
     * Returns the GameTile in logical position (x,y) of the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     */
    public GameTile getGameboardState(final int x, final int y);

    /**
     * Returns the size of the gameboard.
     */
    public Dimension getGameboardSize();

}