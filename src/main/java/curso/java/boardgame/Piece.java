package curso.java.boardgame;

public class Piece {
    protected Position position;
    private Board board;

    //Metodo construtor
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getTabuleiro() {
        return board;
    }
}
