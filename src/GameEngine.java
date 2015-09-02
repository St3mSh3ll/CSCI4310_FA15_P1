import java.util.ArrayList;

/**
 * Created by Matthew Ingle on 9/2/15.
 */
public class GameEngine
{
  ArrayList<String[]> board = new ArrayList();
  //Constructor for a new game with the specified dimensions
  public GameEngine(int dimension1, int dimension2)
  {
    for (int i = 0; i < dimension1; i++)
    {
      String[] temp = new String[dimension2];
      board.add(temp);
    }
  }

  public void checkState()
  {
    //This assumes dimensions are equal i.e 3 x 3 , 5 x 5
    ArrayList<String> diagonal = new ArrayList();
    //Begin looping through rows
    for (int i = 0; i < board.size(); i++)
    {
      String[] row = board.get(i);
      //Loop through columnss
      for (int x = 0; x < row.length; x++)
      {
        if (x == 0)
        {
          if (diagonal.size() == 0)
          {
            diagonal.add(row[i]);
          }
          else if (diagonal.get(0).equals(row[i]))
          {
            diagonal.add((row[i]));
          }
        }
      }
    }

    //Returns if a player has won yet
    //Will return the symbol of the player that is winning
    // Check for horizontal diagonal and vertical
    //if there is no winner returns 0
  }

  public int playerMove(String symbol, int row, int column)
  {
    if (board.get(row)[column] == "" || board.get(row)[column] == null)
    {
      board.get(row)[column] = symbol;
      return 1;
    }
    return 0;
  }

  public ArrayList<String[]> getBoard()
  {
    return board;
  }


}
