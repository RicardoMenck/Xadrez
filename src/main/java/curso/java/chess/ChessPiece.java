package curso.java.chess;

import curso.java.boardgame.Piece;
import curso.java.boardgame.Board;

public class ChessPiece extends Piece {
    private Color color;

    //Método Construtor
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    //Metodo acessor
    public Color getColor() {
        return color;
    }
}
