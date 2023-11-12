package curso.java.aplication;

import curso.java.boardgame.Board;
import curso.java.chess.ChessMatch;

public class App 
{
    public static void main( String[] args )
    {
        ChessMatch cm = new ChessMatch();
        UI.printBoard(cm.getPieces());
    }
}
