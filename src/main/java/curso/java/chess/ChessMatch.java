package curso.java.chess;

import curso.java.boardgame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }


    // Método para retorna a matriz de peças da partida de xadrez;
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i=0; i<board.getRows(); i++) {
            for(int j=0; j<board.getColumns(); j++) {
                mat [i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
}
