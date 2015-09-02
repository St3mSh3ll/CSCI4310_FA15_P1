import java.util.ArrayList;

/**
 * Created by Matthew Ingle on 9/2/15.
 */
public class Main
{
  //This class is for testing purposes only and does not replace the GUI
  public static void main(String[] args)
  {
    GameEngine engine = new GameEngine(3, 3);

    ArrayList<String[]> gameBoard = engine.getBoard();

    for(int i =0; i < gameBoard.size(); i++)
    {
      String[] row = gameBoard.get(i);
      for( int x = 0; x < row.length;x++)
      {
        if(x < row.length - 1)
        {
          System.out.print(row[x] + " | ");
        }
        else
        {
          System.out.println(row[x]);
        }
      }
      if( i < gameBoard.size() -1)
        System.out.println("---------------------");

    }

  }
}
